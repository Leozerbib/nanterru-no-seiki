package org.example.mechanic;

import org.example.method;
import org.example.perso.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import static org.example.mechanic.Start.*;
import static org.example.perso.joueur.afficherBarreBle;
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

    private static ArrayList<ennemy> enememy =new ArrayList<>();
    private static ArrayList<Boostapply> listeboost =new ArrayList<>();
    private static ArrayList<effecter> listeeffect =new ArrayList<>();

    public static void decla1ennemie(int enemie){
        turn=1;
        combattant.addAll(listeplay);
        ArrayList<equipement> setlist=new ArrayList<>();
        if (listeplay.get(0).getLevel()<6){
            setlist=Equipea.listobjet1;
        } else if (listeplay.get(0).getLevel()<11) {
            setlist=Equipea.listobjet2;
        }else if (listeplay.get(0).getLevel()<16) {
            setlist=Equipea.listobjet3;
        }else if (listeplay.get(0).getLevel()<21) {
            setlist=Equipea.listobjet4;
        }else if (listeplay.get(0).getLevel()<26) {
            setlist=Equipea.listobjet5;
        }else if (listeplay.get(0).getLevel()<31) {
            setlist=Equipea.listobjet6;
        }

        for(int i=1;i<=enemie;i++){
            int num;
            System.out.println("Qui est le n° de l'enemie "+i + " :");
            num=sc.nextInt();
            ennemy eneme = null;
            switch (Start.eneme.get(num).getType()){
                case "monstre":
                    Ressource ressource=new Ressource((listeplay.get(0).getLevel()/2)*1000,(listeplay.get(0).getLevel()/2)*100,(listeplay.get(0).getLevel()/2)*10);
                    ArrayList<equipement> lootmon=new ArrayList<>();
                    loot(lootmon,"monstre",setlist);
                    eneme =new monstre(Start.eneme.get(num).getName(),Start.eneme.get(num).getType(),i+10,(listeplay.get(0).getLevel()*1000)+Start.eneme.get(num).getMaxHP(),Start.eneme.get(num).getMaxHP(),listeplay.get(0).getLevel()*Start.eneme.get(num).getExp(),(listeplay.get(0).getLevel()*20)+Start.eneme.get(num).getAtt(),(listeplay.get(0).getLevel()*0.01)+Start.eneme.get(num).getDef(),Start.eneme.get(num).getSpeed(),Start.eneme.get(num).getAcc(),Start.eneme.get(num).getShield(),Start.eneme.get(num).actualshield,lootmon,ressource);
                    System.out.println("ola :"+eneme.getLoot().size());
                    break;
                case "Miniboss":
                    System.out.println("EUH");
                    Ressource ressource1=new Ressource((listeplay.get(0).getLevel()/2)*1000,(listeplay.get(0).getLevel()/2)*100,(listeplay.get(0).getLevel()/2)*10);
                    ArrayList<competence> listcom= new ArrayList<>();
                    System.out.println("oui");
                    ArrayList<equipement> lootmini=new ArrayList<>();

                    listcom.addAll(miniboss.setcompe(Start.eneme.get(num),listeplay.get(0)));
                    System.out.println("ou");
                    eneme =new miniboss(Start.eneme.get(num).getName(),Start.eneme.get(num).getType(),i+10,(listeplay.get(0).getLevel()*1000)+Start.eneme.get(num).getMaxHP(),Start.eneme.get(num).getMaxHP(),listeplay.get(0).getLevel()*Start.eneme.get(num).getExp(),(listeplay.get(0).getLevel()*30)+Start.eneme.get(num).getAtt(),(listeplay.get(0).getLevel()*0.01)+Start.eneme.get(num).getDef(),Start.eneme.get(num).getSpeed(),Start.eneme.get(num).getAcc(),(listeplay.get(0).getLevel()*25)+Start.eneme.get(num).getShield(),Start.eneme.get(num).actualshield,lootmini,ressource1,listcom);
                    System.out.println("o");
                    break;
                case "Boss":
                    break;
            }
            System.out.println("ouiNNN");
            enememy.add(eneme);
            combattant.add(eneme);

        }
        initCombat();
    }
    public static void loot(ArrayList<equipement> loot,String type,ArrayList<equipement> box){
        int random;
        equipement equipement = null;
        switch (type){
            case "monstre" :
                for (int j =1;j<=10;j++) {
                    do {
                        random = new Random().nextInt(box.size());
                    } while (box.get(random).getRarete() == rarete.Moonrock || box.get(random).getRarete() == rarete.CaliWeed || box.get(random).getRarete() == rarete.weed);
                    ArrayList<booster> boosters = new ArrayList<>();
                    for (int i = 0; i < box.get(random).boost.size(); i++) {
                        booster boost = new booster(box.get(random).boost.get(i).getBoost(), box.get(random).boost.get(i).getType(), box.get(random).boost.get(i).getTurn());
                        boosters.add(boost);
                    }
                    equipement = new equipement(box.get(random).getName(), box.get(random).getDesc(), box.get(random).getId(), box.get(random).getRarete(), box.get(random).getType(), box.get(random).type, boosters, box.get(random).getPoid(), box.get(random).getNumber(), box.get(random).niveau);
                    loot.add(equipement);
                }
                System.out.println("sizeeee :"+loot.size());
                break;
                    case "Miniboss":
                        break;
        }

    }

    public static void initCombat(){
        double exp=0;
        ArrayList<equipement> receive = new ArrayList<equipement>();
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
                        exp=exp+combattant.get(i).getExp();
                        ennemy ennemy= (org.example.perso.ennemy) combattant.get(i);
                        receive.add(MethodGen.mysterieBox(ennemy.getLoot(),3));
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
        expGain((joueur) combattant.get(0), exp);
        joueur joueur= (org.example.perso.joueur) combattant.get(0);
        joueur.getInventaire().get(3).addAll(receive);
        System.out.println(     joueur.getInventaire().get(3).size());
        listeboost.clear();
        MethodGen.menu();



    }

    public static void expGain(joueur joueur,double exp){
        MethodGen.afficherMenuEnGros("Exp gagné : ");
        method.printLine(50);
        System.out.println("Vous avez gagné " +exp+" exp");
        joueur.setExp(joueur.getExp()+exp);
        method.printLine(50);
        method.enterContinue();
        int passage=joueur.getLevel()*joueur.getLevel()*40;
        while(joueur.getExp()>=passage){
            method.clearConsole();
            method.printLine(50);
            MethodGen.afficherMenuEnGros("LEVEL UP ");
            method.printLine(50);
            System.out.println();
            System.out.println();
            System.out.println("Level up vous etes passé au niveau " + (joueur.getLevel()+1));
            levelup(joueur,passage);
            passage=joueur.getLevel()*joueur.getLevel()*40;

        }
        System.out.println("Niveau suivant dans " + red +passage+ " exp");
    }
    public static void printLEvel(joueur joueur){

    }
    public static void levelup(joueur player,int passage){
        method.printLine(20);
        MethodGen.afficherMenuEnGros("Stat bonus");
        System.out.println();
        int exp =passage;
        int chance=2;
        double crit = 0.05*player.getChartype().getCrit();
        double critchan =0.005*player.getChartype().getCritChan();
        int force = 5;
        double energie = 10;
        int intel =5;
        double acc= 1.1;
        double att =25*(player.getLevel()/2)*player.getChartype().getAtt();
        double def = 0.005*player.getChartype().getDef();
        int maxhp =(player.getChartype().getMaxHP()/player.getChartype().getMaxHP()* player.getLevel()*50);
        int hp = (player.getChartype().getMaxHP()/player.getChartype().getMaxHP()* player.getLevel()*50);
        double shield=50;
        System.out.print("Points de vie max : " );
        Start.imprimerAPartirDu50emeCaractere("Points de vie max : ",30);
        System.out.print("->"+red + player.getMaxHP() + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + player.getMaxHP(),16);
        System.out.print("->"+yellow + maxhp + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + maxhp + reset,16);
        System.out.println("->"+green + (player.getMaxHP()+maxhp) + reset);

        System.out.print("Bouclier : " );
        Start.imprimerAPartirDu50emeCaractere("Bouclier : ",30);
        System.out.print("->"+red + player.getShield() + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + player.getShield(),15);
        System.out.print("->"+yellow + shield + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + shield + reset,15);
        System.out.println("->"+green + (player.getShield()+shield) + reset);


        System.out.print("Attaque : " );
        Start.imprimerAPartirDu50emeCaractere("Attaque : ",30);
        System.out.print("->"+red + player.getAtt() + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + player.getAtt(),16);
        System.out.print("->"+yellow + att + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + att + reset,16);
        System.out.println("->"+green + (player.getAtt()+att) + reset);


        System.out.print("Defense : " );
        Start.imprimerAPartirDu50emeCaractere("Defense : ",30);
        System.out.print("->"+red + (float)(player.getDef() )+ reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + (float)(player.getDef()),15);
        System.out.print("->"+yellow + (float)(def)+ reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + (float)(def) + reset,15);
        System.out.println("->"+green + (float)(player.getDef()+def) + reset);


        System.out.print("Precision : " );
        Start.imprimerAPartirDu50emeCaractere("Precision : ",30);
        System.out.print("->"+red + (float)(player.getAcc()) + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + (float)(player.getAcc()),15);
        System.out.print("->"+yellow + (float)(acc )+ reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + (float)(acc) + reset,15);
        System.out.println("->"+green + (float)((player.getAcc()+acc)) + reset);


        System.out.print("Chance de coup critque : " );
        Start.imprimerAPartirDu50emeCaractere("Chance de coup critque : ",30);
        System.out.print("->"+red + (float)(player.getCritChan()) + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + (float)(player.getCritChan()),15);
        System.out.print("->"+yellow + (float)(critchan) + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + (float)(critchan) + reset,15);
        System.out.println("->"+green + (float)(player.getCritChan()+critchan) + reset);


        System.out.print("Critique : " );
        Start.imprimerAPartirDu50emeCaractere("Critique : ",30);
        System.out.print("->"+red + (float)(player.getCrit())+ reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + (float)(player.getCrit()),15);
        System.out.print("->"+yellow +(float)(crit) + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + (float)(crit) + reset,15);
        System.out.println("->"+green + (float)((player.getCrit()+ crit)) + reset);

        System.out.println(" ");
        method.printLine(20);
        System.out.println(red+bold + "     Stat secondaire :"+reset);

        System.out.print("Chance : " );
        Start.imprimerAPartirDu50emeCaractere("Chance : ",30);
        System.out.print("->"+red + player.getChance() + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + player.getChance(),15);
        System.out.print("->"+yellow + chance + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + chance+ reset,15);
        System.out.println("->"+green + (player.getChance()+chance) + reset);


        System.out.print("Inteligence : " );
        Start.imprimerAPartirDu50emeCaractere("Inteligence : ",30);
        System.out.print("->"+red + player.getIntel() + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + player.getIntel(),15);
        System.out.print("->"+yellow + intel + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + intel + reset,15);
        System.out.println("->"+green + (player.getIntel()+intel) + reset);

        System.out.print("Force : " );
        Start.imprimerAPartirDu50emeCaractere("Force : ",30);
        System.out.print("->"+red + player.getForce() + reset );
        Start.imprimerAPartirDu50emeCaractere("->"+red + player.getForce(),15);
        System.out.print("->"+yellow + force + reset);
        Start.imprimerAPartirDu50emeCaractere("->"+yellow + force + reset,15);
        System.out.println("->"+green + (player.getForce()+force) + reset);

        player.setExp((int)(player.getExp()-exp));
        player.setLevel(player.getLevel()+1);
        player.setChance(player.getChance()+chance);
        player.setCrit(player.getCrit()+crit);
        player.setCritChan(player.getCritChan() + critchan);
        player.setForce(player.getForce()+ force);
        player.setEnrgie(player.getEnrgie()+energie);
        player.setIntel(player.getIntel()+intel);
        player.setAcc(player.getAcc()*acc);
        player.setAtt((int) (player.getAtt()+ att));
        player.setDef(player.getDef()+def);
        player.setMaxHP(player.getMaxHP()+maxhp);
        player.setHp((int) (player.getHp()+hp));
        player.setShield(player.getShield()+shield);
        method.printLine(20);
        method.enterContinue();


    }
    public static void turnVerif(){
        Collections.sort(listeboost,Comparatorturn);
        for (int i=0;i<listeboost.size();i++){
            System.out.println(listeboost.get(i).booster.getTurn());
            listeboost.get(i).booster.setTurn(listeboost.get(i).booster.getTurn()-1);
            System.out.println(listeboost.get(i).booster.getTurn());
            if (listeboost.get(i).booster.getTurn()==0){
                booster.removeEffet(listeboost.get(i).charactere,listeboost.get(i).getBooster());
                listeboost.remove(listeboost.get(i));
                i-=1;
            }
            else {
                System.out.println();
            }
        }
    }
    public static int verifene(int txt){
        int bool=0;
        for(int j=0;j<eneme.size();j++){
            System.out.println(eneme.get(j).getName());
            if (eneme.get(j).getName().equals(txt)){
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
                int turn=joueur.getListecompetence().get(choix2-1).getBoost()[i].getTurn();
                booster boost=new booster((int) joueur.getListecompetence().get(choix2-1).getBoost()[i].getBoost(),joueur.getListecompetence().get(choix2-1).getBoost()[i].getType(), 4);
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
            effecter.applyEffect(joueur,joueur.getListecompetence().get(num).getEffect()[i],index,joueur.getListecompetence().get(num).getName());

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
        afficherBarreBleue((int) ((joueur.getActualshield()/ joueur.getShield())*100),joueur, joueur.actualshield, "Shield","\u001B[44m","\u001B[0m","\u001B[0m");
        System.out.println(" ");
        afficherBarreBleue((int) ((joueur.getHp()/ joueur.getMaxHP())*100),joueur, joueur.hp, "Hp","\u001B[42m","\u001B[41m",reset);
        afficherBarreBle((int) ((joueur.getExp()/ (joueur.getLevel()*joueur.getLevel()*40))*100),joueur, joueur.getExp(), "Exp","\u001B[36m","\u001B[0m",reset);
        System.out.println(" ");
        method.printLine(20);
        affBoost(joueur);
        method.enterContinue();
    }
    public static void combatEnem(ennemy ennemy){
        method.printLine(50);
        String txt="";
        for (int i=1;i<combattant.size();i++){
            String t=bold +cyan + combattant.get(i).getName()+" | SPEED : "+reset+combattant.get(i).getSpeed();
            txt=txt+t;
        }
        System.out.println("Prochain joueur : [" + txt);
        System.out.println(" ");
        MethodGen.afficherMenuEnGros("Tour de : " +ennemy.getName());
        afficherBarreBleue((int) ((ennemy.getActualshield()/ ennemy.getShield())*100),ennemy, ennemy.actualshield, "Shield","\u001B[44m","\u001B[0m","\u001B[0m");
        System.out.println(" ");
        afficherBarreBleue((int) (ennemy.getHp()/ ennemy.getMaxHP()*100),ennemy, ennemy.getHp(),"Hp","\u001B[42m","\u001B[41m","\u001B[44m");
        method.printLine(20);
        System.out.println("Type : " + cyan + ennemy.getType() + reset);
        System.out.println(" ");
        method.printLine(20);
        affBoost(ennemy);
        method.enterContinue();
        ennemyAtt(ennemy);


    }
    public static void ennemyAtt(ennemy ennemy){
        String ene=ennemy.getType();
        switch (ene){
            case "monstre":
                monstreAtt(ennemy);
                break;
            case "Miniboss":
                miniboss miniboss= (org.example.perso.miniboss) ennemy;
                minibossAtt(miniboss);
                break;
            case "boss":
                break;

        }
    }
    public static void minibossAtt(miniboss ennem){
        int random1=new Random().nextInt(listeplay.size());
        int random2=new Random().nextInt(ennem.listecompetence.size());
        System.out.println(random2 +" " +ennem.listecompetence.size());
        for (int i=0;i<ennem.getListecompetence().get(random2).getBoost().length;i++){
            booster boost=new booster((int) ennem.getListecompetence().get(random2).getBoost()[i].getBoost(),ennem.getListecompetence().get(random2).getBoost()[i].getType(),ennem.getListecompetence().get(random2).getBoost()[i].getTurn());
            Boostapply boos = new Boostapply(boost,ennem);
            listeboost.add(boos);
            booster.appliquerEffet(ennem,ennem.getListecompetence().get(random2).getBoost()[i]);

        }
        for (int i=0;i<ennem.listecompetence.get(random2).getEffect().length;i++){
            method.clearConsole();
            System.out.println(ennem.listecompetence.get(random2).getType());
            effecter.applyEffect(ennem,ennem.getListecompetence().get(random2).getEffect()[i],random1,ennem.listecompetence.get(random2).getName());
        }
    }
    public static void monstreAtt(ennemy ennemy){
        double damage = 0;
        int att=ennemy.getAtt();
        int random1=new Random().nextInt(listeplay.size());
        int random2=new Random().nextInt(100);
        joueur playeratt=listeplay.get(random1);
        if (random2<=50){
            damage=att*playeratt.getLevel()*1.5;
            MethodGen.afficherMenuEnGros("Degat");
            method.printLine(50);
            System.out.println(red +ennemy.getName() + reset+" a giffler " +green+ playeratt.getName() +reset+" !!!!");
            System.out.println(green+ playeratt.getName() +reset + " a subi " + damage +" degat.");
            playeratt.setHp(playeratt.getHp()-damage);
            afficherBarreBleue((int) ((playeratt.getHp()/ playeratt.getMaxHP())*100),playeratt, playeratt.hp, "joueur","\u001B[42m","\u001B[41m",reset
            );
            method.printLine(50);
        }
        else if (random2<=80 &&random2>50) {
            damage=att*playeratt.getLevel()*2.4;
            MethodGen.afficherMenuEnGros("Degat");
            method.printLine(50);
            System.out.println(red +ennemy.getName() + reset+" a tacler la daronne de " +green+ playeratt.getName() +reset+" !!!!");
            System.out.println(green+ playeratt.getName() +reset + " a subi " + damage +" degat.");
            playeratt.setHp(playeratt.getHp()-damage);
            afficherBarreBleue((int) ((playeratt.getHp()/ playeratt.getMaxHP())*100),playeratt, playeratt.hp, "joueur","\u001B[42m","\u001B[41m",reset
            );
            method.printLine(50);

        }
        else if (random2>80&&random2<98){
            damage=att*playeratt.getLevel()*3.2;
            MethodGen.afficherMenuEnGros("Degat");
            method.printLine(50);
            System.out.println(red +ennemy.getName() + reset+" a detruit " +green+ playeratt.getName() +reset+" !!!!");
            System.out.println(green+ playeratt.getName() +reset + " a subi " + damage +" degat.");
            playeratt.setHp(playeratt.getHp()-damage);
            afficherBarreBleue((int) ((playeratt.getHp()/ playeratt.getMaxHP())*100),playeratt, playeratt.hp, "joueur","\u001B[42m","\u001B[41m",reset
            );
            method.printLine(50);

        }
        else {
            damage=att*playeratt.getLevel()*5;
            MethodGen.afficherMenuEnGros("Degat");
            method.printLine(50);
            System.out.println("Mon reuf " + playeratt.getName() +" c'est chaud ta luck tu va te faire demonter...");
            System.out.println(green+ playeratt.getName() +reset + " a subi " + damage +" degat.");
            playeratt.setHp(playeratt.getHp()-damage);
            afficherBarreBleue((int) ((playeratt.getHp()/ playeratt.getMaxHP())*100),playeratt, playeratt.hp, "joueur","\u001B[42m","\u001B[41m",reset);
            method.printLine(50);

        }

    }
    public static void affBoost(charactere charactere){
        MethodGen.afficherMenuEnGros("Boost appliquer :");
        method.printLine(20);
        for (int i = 0;i<listeboost.size();i++){
            if (listeboost.get(i).charactere==charactere){
                System.out.print("Type : " +cyan+ listeboost.get(i).getBooster().getType());
                System.out.print("      Boost : " +red+ listeboost.get(i).getBooster().getBoost()+ reset);
                System.out.println("     Temp Restant : " +yellow +  listeboost.get(i).getBooster().getTurn() + reset);
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
