package org.example.mechanic;

import org.example.method;
import org.example.perso.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.example.mechanic.Start.listeplay;
import static org.example.mechanic.Start.sc;
import static org.example.perso.joueur.afficherBarreBleue;


public class combat {
    static String reset = "\u001B[0m";
    static String bold = "\u001B[1m";
    static String yellow = "\u001B[33m";
    static String cyan = "\u001B[36m";
    static String green = "\u001B[32m";
    static String red = "\u001B[31m";
    static String purple = "\u001B[35m";
    private static int turn;
    private static ArrayList<Integer> Ajouer =new ArrayList<>();
    public static ArrayList<charactere> combattant =new ArrayList<>();
    private static ArrayList<ennemy> enem =new ArrayList<>();
    private static ArrayList<ennemy> enememy =new ArrayList<>();
    private static ArrayList<Boostapply> listeboost =new ArrayList<>();
    private static ArrayList<effecter> listeeffect =new ArrayList<>();

    public static void decla1ennemie(int enemie){
        turn=1;
        combattant.addAll(listeplay);
        enem.add(monstre.ennemy1);
        enem.add(monstre.ennemy2);
        enem.add(monstre.ennemy3);
        enem.add(monstre.ennemy4);
        enem.add(monstre.ennemy5);
        enem.add(monstre.ennemy6);
        enem.add(monstre.ennemy7);
        enem.add(monstre.ennemy8);
        enem.add(monstre.ennemy9);
        enem.add(monstre.ennemy10);
        enem.add(monstre.ennemy11);


        for(int i=1;i<=enemie;i++){
            int num;
            System.out.println("Qui est le n° de l'enemie "+i + " :");
            num=sc.nextInt();
            ennemy eneme =new monstre(enem.get(num).getName(),enem.get(num).getType(),i+10,enem.get(num).getMaxHP(),enem.get(num).getHp(),enem.get(num).getExp(),enem.get(num).getAtt(),enem.get(num).getDef(),enem.get(num).getSpeed(),enem.get(num).getAcc(),enem.get(num).getShield());
            enememy.add(eneme);
            combattant.add(eneme);

        }
        initCombat();
    }
    public static void initCombat(){
        while (FightFini()==false){
            while (Ajouer.size()!=combattant.size()&&FightFini()==false){

                Collections.sort(combattant,ComparatorSpeed);
                if (combattant.get(0).getType().equals("joueur")){
                    combatJoueur((joueur) combattant.get(0));
                }
                else {
                    combatEnem((ennemy) combattant.get(0));
                }
                if (Ajouer.size()==0){
                    Ajouer.add(combattant.get(0).getNum());
                } else if (pres(combattant.get(0).getNum())==true) {
                    Ajouer.add(combattant.get(0).getNum());
                }else {

                }
                for (int i =0;i<combattant.size();i++){
                    if (combattant.get(i).getHp()<=0&&combattant.get(i).getType()!="joueur"){
                        expGain((joueur) combattant.get(0), (ennemy) combattant.get(i));
                        enememy.remove(combattant.get(i));
                        combattant.remove(i);
                    }
                    else {
                        System.out.println("");
                    }
                }
                combattant.get(0).setSpeed(combattant.get(0).getSpeed()-100);
            }
            for (int i =0;i<combattant.size();i++){
                combattant.get(i).setSpeed(combattant.get(i).getSpeed()+100);
            }
            System.out.println(combattant.get(0).getSpeed());
            System.out.println("Tous le monde a jouer, tour suivant");
            turn+=1;
            turnVerif();
            method.enterContinue();

            Ajouer.clear();

        }
        turn=0;
        for (int i=0;i<listeboost.size();i++){
            booster.removeEffet(listeboost.get(i).charactere,listeboost.get(i).getBooster());

        }
        listeboost.clear();
        MethodGen.menu();


    }
    public static void expGain(joueur joueur,ennemy ennemy){
        System.out.println("Vous avez gagné " + ennemy.getExp()+" exp");
        joueur.setExp(joueur.getExp()+ennemy.getExp());
        int passage=joueur.getLevel()*joueur.getLevel()*40;
        while(joueur.getExp()>=passage){
            System.out.println("level up vous etes passé au niveau " + (joueur.getLevel()+1));
            levelup(joueur,passage);
            passage=joueur.getLevel()*joueur.getLevel()*40;
        }
    }
    public static void levelup(joueur player,int passage){
        player.setExp((int)(player.getExp()-passage));
        player.setLevel(player.getLevel()+1);
        player.setChance(player.getChance()+2);
        player.setCrit(player.getCrit()+player.getChartype().getCrit());
        player.setForce(player.getForce()+ 5);
        player.setEnrgie(player.getEnrgie()+ 10);
        player.setIntel(player.getIntel()+5);
        player.setAcc(player.getAcc()*1.1);
        player.setAtt(player.getAtt()+ (player.getLevel()/2)*player.getChartype().getAtt());
        player.setDef(player.getDef()+(player.getLevel()/2)*player.getChartype().getDef());
        player.setMaxHP(player.getMaxHP()+(player.getChartype().getMaxHP()/player.getChartype().getMaxHP()* player.getLevel()));
        player.setShield(player.getShield()+50);
        player.setSpeed(player.getSpeed()+player.getChartype().getSpeed()*50);

    }
    public static void turnVerif(){
        Collections.sort(listeboost,Comparatorturn);
        for (int i=0;i<listeboost.size();i++){
            listeboost.get(i).booster.setTurn(listeboost.get(i).booster.getTurn()-1);
            if (listeboost.get(i).booster.getTurn()==0){
                booster.removeEffet(listeboost.get(i).charactere,listeboost.get(i).getBooster());
                listeboost.remove(listeboost.get(i));
            }
            else {
                System.out.println("");
            }
        }
    }
    public static int verifene(int txt){
        int bool=0;
        for(int j=0;j<enem.size();j++){
            System.out.println(enem.get(j).getName());
            if (enem.get(j).getName().equals(txt)){
                bool=j;
                return bool;
            }
            else {
                bool=0;
            }
        }

        return bool;
    }
    public static Comparator<charactere> ComparatorSpeed=new Comparator<charactere>() {
        @Override
        public int compare(charactere o1, charactere o2) {
            return (int) (o2.getSpeed()-o1.getSpeed());
        }
    };
    public static Comparator<Boostapply> Comparatorturn=new Comparator<Boostapply>() {
        @Override
        public int compare(Boostapply l1, Boostapply l2) {
            return (int) (l1.booster.getTurn()-l2.booster.getTurn());
        }
    };
    public static boolean FightFini(){
        boolean bool=true;
        String type=combattant.get(0).getType();
        for (int i =1;i<combattant.size();i++){
            if (combattant.get(i).getType()==type){
                bool=true;
            }
            else {
                bool=false;
                return bool;

            }

        }
        return bool;
    }
    public static void combatJoueur(joueur joueur){
        method.clearConsole();
        ath(joueur);
        System.out.println(" ");
        System.out.println("1. Utiliser une compétences");
        System.out.println("2. Utiliser un objet");
        int choix = method.scInt("=>",3);
        if(choix==1){
            MethodGen.affCompequip(joueur);
            method.printLine(50);
            System.out.println("");
            System.out.println(" Choisisser une compétence : ");
            int choix2=sc.nextInt();
            for (int i=0;i<joueur.getListecompetence().get(choix2-1).getBoost().length;i++){
                booster boost=new booster((int) joueur.getListecompetence().get(choix2-1).getBoost()[i].getBoost(),joueur.getListecompetence().get(choix2-1).getBoost()[i].getType(),joueur.getListecompetence().get(choix2-1).getBoost()[i].getTurn());
                Boostapply boos = new Boostapply(boost,joueur);
                listeboost.add(boos);
                booster.appliquerEffet(joueur,joueur.getListecompetence().get(choix2-1).getBoost()[i]);
            }
            utiliCompe(joueur,choix2-1);

        }
        else{

        }
    }
    public static void utiliCompe(joueur joueur,int num){
        method.clearConsole();
        method.printLine(20);
        for (int j=0;j<enememy.size();j++){
            System.out.println("Ennemie n°"+ (j+1) +":");
            System.out.println(cyan + enememy.get(j).getName() +reset);
            System.out.println( cyan+ enememy.get(j).getType() +reset);
            afficherBarreBleue((int) (enememy.get(j).getHp()/ enememy.get(j).getMaxHP()*100),enememy.get(j), enememy.get(j).getHp(),"PV","\u001B[44m","\u001B[41m","\u001B[44m");

        }
        System.out.println("Quelle ennemie voulez-vous attaquer ?");
        int choix =sc.nextInt();
        int index=index(choix-1);
        for (int i=0;i<joueur.getListecompetence().get(num).getEffect().length;i++){
            effecter.applyEffect(joueur,joueur.getListecompetence().get(num).getEffect()[i],index);

            method.enterContinue();
        }




    }
    public static int index(int num){
        for (int i =0;i<combattant.size();i++){
            if (combattant.get(i).getNum()==enememy.get(num).getNum()){
                return i;
            }else {
                System.out.println("");
            }
        }
        return num;
    }
    public static void utiliObj(){

    }
    public static void ath(joueur joueur){
        method.printLine(50);
        MethodGen.afficherMenuEnGros("Tour de : " +joueur.getName() +"..."+joueur.getSpeed());
        String txt="";
        for (int i=1;i<combattant.size();i++){
            String t=bold +cyan + combattant.get(i).getName()+" | SPEED : "+reset+combattant.get(i).getSpeed();
            txt=txt+t;
        }
        System.out.println("Prochain joueur : [" + txt);
        method.printLine(20);
        System.out.println("Type : " + cyan + joueur.getType() + reset);
        System.out.println("Classe de personnage : " + cyan + joueur.getChartype() + reset);
        System.out.println("Niveau : " + purple + joueur.getLevel() + reset);
        afficherBarreBleue((int) ((joueur.getExp()/ (joueur.getLevel()*joueur.getLevel()*40))*100),joueur, joueur.getExp(), "Exp","\u001B[46m","\u001B[0m",reset);
        afficherBarreBleue((int) (joueur.getActualEnergie()/ joueur.getEnrgie()*100),joueur, joueur.getActualEnergie(), "Energie","\u001B[43m","\u001B[0m",reset);
        System.out.println(" ");
        method.printLine(20);
        affBoost(joueur);
        method.enterContinue();
    }
    public static void combatEnem(ennemy ennemy){
        method.printLine(50);
        MethodGen.afficherMenuEnGros("Tour de : " +ennemy.getName());
        System.out.println(ennemy.getHp());
        String txt="";
        for (int i=1;i<combattant.size();i++){
            String t=bold +cyan + combattant.get(i).getName()+" | SPEED : "+reset+combattant.get(i).getSpeed();
            txt=txt+t;
        }
        System.out.println("Prochain joueur : [" + txt);
        method.printLine(20);
        System.out.println("Type : " + cyan + ennemy.getType() + reset);
        System.out.println(" ");
        method.printLine(20);
        affBoost(ennemy);
        method.enterContinue();

    }
    public static void affBoost(charactere charactere){
        System.out.println(red + "Boost appliquer : " +reset);
        for (int i = 0;i<listeboost.size();i++){
            if (listeboost.get(i).charactere==charactere){
                System.out.println(cyan + "Boost : " + listeboost.get(i).getBooster().getType());
                System.out.println("Valeur : " + listeboost.get(i).getBooster().getBoost()+ reset);
                System.out.println(yellow + "Temp Restant : " + listeboost.get(i).getBooster().getTurn() + reset);
            }
        }
    }


    public static boolean pres(int i){
        boolean bool =true;
        for (int j=0;j<Ajouer.size();j++){
            if(Ajouer.get(j).equals(i)){
                bool=false;
                return bool;
            }
            else {
                bool=true;
            }
        }
        return bool;
    }
}
