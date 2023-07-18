package org.example.mechanic;

import lombok.Getter;
import lombok.Setter;
import org.example.method;
import org.example.method.*;
import org.example.perso.*;

import java.util.*;

import static java.lang.Math.sqrt;


@Getter@Setter
public class Start {
    public static CharClass ch;
    static Scanner sc =new Scanner(System.in);
    static ArrayList<ennemy> eneme =new ArrayList<>();
    public static ArrayList<joueur> listeplay = new ArrayList<>();
    public static ArrayList<competence> listeCompe;
    public static void Start(){
        Equipea.jsp();
        competence.rangerCompetences();
        for (Equipea att : Equipea.values()) {
            Equipea.equipbooster(att.equipement);
        }

        Equipea.triEquip();
        System.out.println(Equipea.listobjet1.size());
        System.out.println(Equipea.listobjet2.size());
        System.out.println(Equipea.listobjet3.size());
        System.out.println(Equipea.listobjet4.size());
        System.out.println(Equipea.listobjet5.size());
        System.out.println(Equipea.listobjet6.size());

        for (int h= 0;h<Equipea.listobjet6.size();h++){
            System.out.print(Equipea.listobjet6.get(h).getId());
            System.out.print("             " +Equipea.listobjet6.get(h).niveau);
            System.out.println("             " +Equipea.listobjet1.get(h).boost.size());

        }
        for (int h = 0; h < Equipea.listobjet1.size(); h++) {
            for (int p = 0;  p< Equipea.listobjet1.get(h).boost.size(); p++) {
                System.out.println(Equipea.listobjet1.get(h).getName()+"    Boost de la liste 1 : " + Equipea.listobjet1.get(h).boost.get(p).getBoost()+"  Boost : " + Equipea.listobjet1.get(h).boost.get(p).getType());
            }
        }
        for (int h = 0; h < Equipea.listobjet2.size(); h++) {
            for (int p = 0;  p< Equipea.listobjet2.get(h).boost.size(); p++) {
                System.out.println(Equipea.listobjet2.get(h).getName()+"    Boost de la liste 2 : " + Equipea.listobjet2.get(h).boost.get(p).getBoost()+"  Boost  : " + Equipea.listobjet2.get(h).boost.get(p).getType());
            }        }
        for (int h = 0; h < Equipea.listobjet3.size(); h++) {
            for (int p = 0;  p< Equipea.listobjet3.get(h).boost.size(); p++) {
                System.out.println(Equipea.listobjet3.get(h).getName()+"    Boost de la liste 3 : " + Equipea.listobjet3.get(h).boost.get(p).getBoost()+"  Boost : " + Equipea.listobjet3.get(h).boost.get(p).getType());
            }        }

        eneme.add(monstre.ennemy1);
        eneme.add(monstre.ennemy2);
        eneme.add(monstre.ennemy3);
        eneme.add(monstre.ennemy4);
        eneme.add(monstre.ennemy5);
        eneme.add(monstre.ennemy6);
        eneme.add(monstre.ennemy7);
        eneme.add(monstre.ennemy8);
        eneme.add(monstre.ennemy9);
        eneme.add(monstre.ennemy10);
        eneme.add(monstre.ennemy11);
        eneme.add(miniboss.miniboss);
        System.out.println(competence.listecompe1.size());
        method.clearConsole();
        method.printLine(50);
        System.out.println("Combien de joueur êtes-vous ?");
        int choix=method.scInt("=>",10);
        for(int i=1; i<=choix;i++){
            ArrayList<competence> listeCompe = new ArrayList<>();
            ArrayList<ArrayList<objet>> inventaire = new ArrayList<>();
            ArrayList<objet> equipement = new ArrayList<objet>();
            ArrayList<objet> potion = new ArrayList<objet>();
            ArrayList<objet> special = new ArrayList<objet>();
            ArrayList<objet> bonus= new ArrayList<objet>();
            inventaire.add(bonus);
            inventaire.add(special);
            inventaire.add(potion);
            inventaire.add(equipement);
            equip equip = new equip(equiAtt.equiAtt,equiAtt.equiAtt,equiDef.equiDef,equiSpeed.equiSpeed,equiPocheton.equiPocheton,equiPocheton.equiPocheton);
            joueur play = new joueur("", "joueur", 0,500, 500, 0, 50, 0.05, 100, 1, 0,0, 1, CharClass.A, 1, 1, 1, 100,100, 0.005, 20,listeCompe,inventaire,equip);
            listeplay.add(play);
            CreaPers(i-1,listeplay.get(i-1));
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getAtt());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getAtt1());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getDef());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getSpeed());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getPocheton());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getPocheton1());
            method.clearConsole();
            method.printLine(50);
            System.out.println(" ");
            joueur.afficherStatistiques(listeplay.get(i-1));
            method.printLine(50);
            method.enterContinue();
            method.clearConsole();
        }
        MethodGen.menu();
    }
    public static Comparator<competence> Comparatorlevel=new Comparator<competence>() {
        @Override
        public int compare(competence o1, competence o2) {
            return (int) (o2.getNiveau()-o1.getNiveau());
        }
    };
    public static ArrayList inventaire(ArrayList list){
        ArrayList<objet> listeequi = new ArrayList<>();
        ArrayList<objet> listespecial= new ArrayList<>();
        ArrayList<objet> listepotion = new ArrayList<>();
        ArrayList<objet> listebonus = new ArrayList<>();
        list.add(listeequi);
        list.add(listespecial);
        list.add(listepotion);
        list.add(listebonus);
        return list;
    }
    public static void setcompe(CharClass ch,joueur joueur){
        Collections.sort(ch.getListeCompetence(),Comparatorlevel);
        MethodGen.afficherMenuEnGros("Liste Competence ");
        method.printLine(50);
        System.out.println(" ");
        method.printLine(10);
        System.out.println( "\u001B[1m"+ "\u001B[31m" +"Competence debloqué :" + "\u001B[0m");
        method.printLine(10);
        System.out.println(" ");
        System.out.println(" ");
        for (int i =0 ;i<ch.getListeCompetence().size();i++){
            if (ch.getListeCompetence().get(i).getNiveau()<=joueur.getLevel()){
                System.out.println(" ");
                System.out.println("- " + "\u001B[36m"+ch.getListeCompetence().get(i).getName());
                System.out.println("     " + "\u001B[0m" + ch.getListeCompetence().get(i).getDescr());
                System.out.println();
                System.out.println("\u001B[31m"+"Boost applliqé" + "\u001B[0m");
                method.printLine(20);
                for (int j = 0;j<ch.getListeCompetence().get(i).getBoost().length;j++){
                    System.out.print("Type : " +"\u001B[36m"+ ch.getListeCompetence().get(i).getBoost()[j].getType()+ "\u001B[0m");
                    System.out.print("      Boost : " +"\u001B[31m"+ ch.getListeCompetence().get(i).getBoost()[j].getBoost()+ "\u001B[0m");
                    System.out.println("     Temp Restant : " +"\u001B[33m" +  ch.getListeCompetence().get(i).getBoost()[j].getTurn() + "\u001B[0m");

                }
                System.out.println(" ");

                }
            }
        System.out.println(" ");
        System.out.println(" ");
        method.printLine(10);
        System.out.println( "\u001B[1m"+ "\u001B[31m" +"Competence debloquable :" + "\u001B[0m");
        method.printLine(10);
        System.out.println(" ");
        System.out.println(" ");
        for (int i =0 ;i<ch.getListeCompetence().size();i++){
        if (ch.getListeCompetence().get(i).getNiveau()>joueur.getLevel()){
            System.out.println(" ");
            System.out.println("- " + "\u001B[36m"+ch.getListeCompetence().get(i).getName()+ "\u001B[31m"+ "          Niveau "+ ch.getListeCompetence().get(i).getNiveau()+ "pour debloquer");
            System.out.println("     " + "\u001B[0m" + ch.getListeCompetence().get(i).getDescr());
            System.out.println();
            System.out.println("\u001B[31m"+"Boost applliqé" + "\u001B[0m");
            method.printLine(20);
            for (int j = 0;j<ch.getListeCompetence().get(i).getBoost().length;j++){
                System.out.print("Type : " +"\u001B[36m"+ ch.getListeCompetence().get(i).getBoost()[j].getType()+ "\u001B[0m");
                System.out.print("      Boost : " +"\u001B[31m"+ ch.getListeCompetence().get(i).getBoost()[j].getBoost()+ "\u001B[0m");
                System.out.println("     Temp Restant : " +"\u001B[33m" +  ch.getListeCompetence().get(i).getBoost()[j].getTurn() + "\u001B[0m");

            }
            System.out.println(" ");

        }
    }

}

    public static void refreshequip(joueur joueur,equipement equipement){
        for (int i =0;i<equipement.boost.size();i++){
            booster.appliquerEffet(joueur,equipement.boost.get(i));
        }
    }
    public static void CreaPers(int i,joueur player){
        MethodGen.afficherMenuEnGros("Start");
        method.printLine(50);
        System.out.println("Quelle est votre nom ?");
        String nom= sc.next();
        selectClass(i,player,nom);



    }
    public static void selectClass(int i,joueur player,String nom){
        method.clearConsole();
        MethodGen.afficherMenuEnGros("Choisissez un classe ");
        method.printLine(50);
        System.out.println("Voici les classes de personnage disponible sur le jeu ?");
        for(CharClass p : CharClass.values()){
            System.out.println( p +". "+p.getType() +" : " + p.getName());
        }

        method.printLine(20);
        String choi2 = null;
        System.out.println("Vous devez choisir une Classe de perso, ce choix impactera votre style de jeu. Il existe des dps,des tank et un healer leur role vous aiderai dans les combats et dans les quete.");
        int choix= sc.nextInt();
        if (choix==1){
            printCharClass(CharClass.A,player);
            selectClass(i,player,nom);
        } else if (choix==2) {
            printCharClass(CharClass.B,player);
            selectClass(i,player,nom);
        } else if (choix==3) {
            printCharClass(CharClass.C,player);
            selectClass(i,player,nom);
        } else if (choix==4) {
            printCharClass(CharClass.D,player);
            selectClass(i,player,nom);
        } else if (choix==5) {
            printCharClass(CharClass.E,player);
            selectClass(i,player,nom);
        } else if (choix==6) {
            printCharClass(CharClass.F,player);
            selectClass(i,player,nom);
        } else if (choix==0) {
            choi2=sc.next();
            ch=CharClass.valueOf(choi2);
            Appli(ch,i,player,nom);
        }



    }
    public static void afficherBarre(double pourcentage,String type,String coulPos,String coulNeg,String Neut) {
        int setCenter=50;
        double pourcent;
        int longueurBarre = 30; // Longueur de la barre en caractères
        int remplissage; // Calcul du nombre de caractères à remplir
        int reste;
        System.out.print(" : -3 [");
        if(pourcentage>1){
            pourcent=(pourcentage-1)/3;
            remplissage = (int) (pourcent*longueurBarre/2); // Calcul du nombre de caractères à remplir
            reste = (int) (15-remplissage);
            for (int i = 0; i < 0.5*longueurBarre; i++){
                System.out.print("\u001B[44m"+" "); // Caractère bleu pour le remplissage de la barre
            }
            System.out.print("\u001B[46m"+"|"+"\u001B[0m");
            for (int i = 0; i < remplissage; i++){
                System.out.print(coulPos + " ");
            }
            for (int i = 0; i < reste; i++){
                System.out.print(Neut+" "); // Caractère bleu pour le remplissage de la barre
            }
        }
        else {
            double pour=1/pourcentage;
            pourcent=(pour-1)/3;
            remplissage = (int) (pourcent * longueurBarre); // Calcul du nombre de caractères à remplir
            reste = (int) (15-remplissage);

            for (int i = 0; i < reste; i++){
                System.out.print("\u001B[44m"+" "); // Caractère bleu pour le remplissage de la barre
            }
            for (int i = 0; i < remplissage; i++){
                System.out.print(coulNeg + " ");
            }
            System.out.print("\u001B[46m"+"|"+"\u001B[0m");
            for (int i = 0; i < 0.5*longueurBarre; i++){
                System.out.print(Neut+" "); // Caractère bleu pour le remplissage de la barre
            }
        }
        System.out.println(Neut+ "] +3");
        System.out.println(" ");
    }

    public static void imprimerAPartirDu50emeCaractere(String texte,int oui) {
        int nbCaracteresPrint = 0;
        int nbEspaces = 0;


        // Compter le nombre de caractères imprimables et d'espaces dans la chaîne
        for (char c : texte.toCharArray()) {
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                if (Character.isWhitespace(c)) {
                    nbEspaces++;
                } else {
                    nbCaracteresPrint++;
                }
            }
        }

        int nbCaracteresTotal = nbCaracteresPrint + nbEspaces;
        int nbCaracteresAAjouter = oui - nbCaracteresTotal;


        if (nbCaracteresAAjouter > 0) {
            for (int i = 0; i < nbCaracteresAAjouter; i++) {
                System.out.print(" ");
            }
        }


    }


    private static void printCharClass(CharClass charClass,joueur joueur) {
        String reset = "\u001B[0m";
        String bold = "\u001B[1m";
        String yellow = "\u001B[33m";
        String cyan = "\u001B[36m";
        String green = "\u001B[32m";
        String red = "\u001B[31m";
        String purple = "\u001B[35m";
        MethodGen.afficherMenuEnGros(charClass.getName());
        method.printLine(50);
        System.out.println(" ");
        System.out.println("Nom: " + cyan+charClass.getName());
        System.out.println("Type: " + charClass.getType()+reset);
        System.out.print("Points de vie max bonus : " + charClass.getMaxHP());
        imprimerAPartirDu50emeCaractere("Points de vie max bonus : " + charClass.getMaxHP(),30);
        joueur.afficherBarreBleue(charClass.getMaxHP()*100/1000,listeplay.get(0), charClass.getMaxHP(), "","\u001B[42m","\u001B[0m","\u001B[0m");
        System.out.print("Attaque: " + charClass.getAtt());
        imprimerAPartirDu50emeCaractere("Attaque: " + charClass.getAtt(),30);
        afficherBarre(charClass.getAtt(),"Att", "\u001B[42m","\u001B[41m","\u001B[0m");
        System.out.print("Défense: " + charClass.getDef());
        imprimerAPartirDu50emeCaractere("Défense: " + charClass.getDef(),30);
        afficherBarre(charClass.getDef(),"Def", "\u001B[42m","\u001B[41m","\u001B[0m");
        System.out.print("Vitesse: " + charClass.getSpeed());
        imprimerAPartirDu50emeCaractere("Vitesse: " + charClass.getSpeed(),30);
        afficherBarre(charClass.getSpeed(),"Speed", "\u001B[42m","\u001B[41m","\u001B[0m");
        System.out.print("Précision: " + charClass.getAcc());
        imprimerAPartirDu50emeCaractere("Précision: " + charClass.getAcc(),30);
        afficherBarre(charClass.getAcc(),"Acc", "\u001B[42m","\u001B[41m","\u001B[0m");
        System.out.print("Chances de coup critique: " + charClass.getCritChan());
        imprimerAPartirDu50emeCaractere("Chances de coup critique: " + charClass.getCritChan(),30);
        afficherBarre(charClass.getCritChan(),"Chance coup critique", "\u001B[42m","\u001B[41m","\u001B[0m");
        System.out.print("Crit bonus : ");
        imprimerAPartirDu50emeCaractere("Crit bonus : ",30);
        afficherBarre(charClass.getCrit(),"Crit", "\u001B[42m","\u001B[41m","\u001B[0m");
        System.out.print("Bouclier bonus : ");
        imprimerAPartirDu50emeCaractere("Bouclier bonus : ",30);
        joueur.afficherBarreBleue((int) (charClass.getShield()*100/1000),listeplay.get(0), charClass.getShield(), "","\u001B[42m","\u001B[0m","\u001B[0m");
        System.out.print("Chance bonus : ");
        imprimerAPartirDu50emeCaractere("Chance bonus : ",30);
        joueur.afficherBarreBleue(charClass.getChance()*100/50,listeplay.get(0), charClass.getChance(), "","\u001B[42m","\u001B[0m","\u001B[0m");
        System.out.print("Energie bonus : ");
        imprimerAPartirDu50emeCaractere("Energie bonus : ",30);
        joueur.afficherBarreBleue(charClass.getEnrgie()*100/50,listeplay.get(0), charClass.getEnrgie(), "","\u001B[42m","\u001B[0m","\u001B[0m");
        System.out.print("Force bonus : ");
        imprimerAPartirDu50emeCaractere("Force bonus : ",30);
        joueur.afficherBarreBleue(charClass.getForce()*100/50,listeplay.get(0), charClass.getForce(), "","\u001B[42m","\u001B[0m","\u001B[0m");
        System.out.print("Intel bonus : ");
        imprimerAPartirDu50emeCaractere("Intel bonus : ",30);
        joueur.afficherBarreBleue(charClass.getIntel()*100/50,listeplay.get(0), charClass.getIntel(), "","\u001B[42m","\u001B[0m","\u001B[0m");

        setcompe(charClass,joueur);
        System.out.println("--------------------");
        sc.nextInt();


    }
    public static void affcomp(CharClass charClass){
        for (competence comp : charClass.getListeCompetence()) {

            MethodGen.afficherMenuEnGros("Competence de " + charClass.getName());
            method.printLine(50);

        }
    }
    public static joueur Appli(CharClass A,int i,joueur player,String nom){
        player.setName(nom);
        player.setChance(player.getChance()+ A.getChance());
        player.setCrit(player.getCrit()*A.getCrit());
        player.setNum(i);
        player.setChartype(A);
        player.setForce(player.getForce()+ A.getForce());
        player.setEnrgie(player.getEnrgie()+ A.getEnrgie());
        player.setCritChan(player.getCritChan()*A.getCritChan());
        player.setIntel(player.getIntel()+A.getIntel());
        player.setAcc(player.getAcc()+A.getAcc());
        player.setAtt((int) (player.getAtt()*A.getAtt()));
        player.setDef(player.getDef()*A.getDef());
        listeplay.get(i).setMaxHP(player.getMaxHP()+A.getMaxHP());
        player.setShield(player.getShield()+A.getShield());
        player.setActualshield(player.getShield());
        player.setSpeed(player.getSpeed()*A.getSpeed());
        joueur.initComp(player);
        player.setHp(player.getMaxHP());
        return player;
    }
}
