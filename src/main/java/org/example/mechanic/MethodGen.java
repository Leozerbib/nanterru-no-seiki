package org.example.mechanic;
import java.awt.Color;

import org.example.method;
import org.example.perso.equipement;
import org.example.perso.joueur;
import org.example.perso.rarete;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Random;

import static org.example.mechanic.Start.listeplay;
import static org.example.mechanic.Start.sc;

public class MethodGen {
    static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    static Font[] fonts = ge.getAllFonts();

    // Afficher toutes les polices disponibles

    // Modifier la taille de la police de la console

    static String reset = "\u001B[0m";
    static String bold = "\u001B[1m";
    static String yellow = "\u001B[33m";
    static String cyan = "\u001B[36m";
    static String green = "\u001B[32m";
    String red = "\u001B[31m";
    static String purple = "\u001B[35m";

    public static void affichageCompe(joueur joueur){
        method.clearConsole();
        method.printLine(50);
        afficherMenuEnGros("Compétences");
        System.out.println("1. Competences equipées");
        System.out.println("2. Toutes vos compétences");
        System.out.println("3. Revenir en arrière");
        System.out.println("4. Retour au menu");
        method.printLine(50);
        int choix=method.scInt("=>",3000000);
        if (choix==1){
            affCompequip(joueur);
        } else if (choix==2) {
            for(int i =0; i<joueur.getChartype().getListeCompetence().size();i++){
                System.out.println(i+1 + ". " + joueur.getChartype().getListeCompetence().get(i).getName() + "-" + joueur.getChartype().getListeCompetence().get(i).getNum());
            }
        } else if (choix==3) {
            afficherInven(joueur);
        }
        else if (choix==4) {
            menu();
        }

    }

    public static void affCompequip(joueur joueur) {
        method.clearConsole();
        afficherMenuEnGros("Compétence");
        method.printLine(20);
        for (int i = 0; i < joueur.getListecompetence().size(); i++) {
            System.out.println("\u001B[36mCompétence " + (i + 1) + " : \u001B[0m");
            System.out.println("\u001B[33m" + joueur.getListecompetence().get(i).getName() + "\u001B[0m");
            System.out.println(joueur.getListecompetence().get(i).getDescr());
            System.out.println(".");
            System.out.println("\u001B[36mEffet : \u001B[0m");
            for (int j = 0; j < joueur.getListecompetence().get(i).getEffect().length; j++) {
                System.out.println(joueur.getListecompetence().get(i).getEffect()[j].getType() + " - " + joueur.getListecompetence().get(i).getEffect()[j].getNum() + " - " + joueur.getListecompetence().get(i).getEffect()[j].getTurn());
            }
            System.out.println("\u001B[31m");
            method.printLine(20);
            System.out.println("\u001B[0m");
        }
    }
    public static equipement mysterieBox(ArrayList<equipement> box,int type){
        double random =new Random().nextDouble();
        System.out.println(random);
        rarete rarete=null;
        equipement equi=null;
        if (random< rarete.Moonrock.getDrop() && type==1){
            rarete= org.example.perso.rarete.Moonrock;
        } else if (random<rarete.CaliWeed.getDrop() && type==1) {
            rarete= org.example.perso.rarete.CaliWeed;
        }else if (random<rarete.weed.getDrop() && type<3) {
            rarete= org.example.perso.rarete.weed;
        }else if (random<rarete.filtrer.getDrop()) {
            rarete= org.example.perso.rarete.filtrer;
        }else if (random<rarete.Galienni.getDrop()) {
            rarete= org.example.perso.rarete.Galienni;
        }
        System.out.println(rarete);
        do {
            int random2 =new Random().nextInt(box.size());
            equi=box.get(random2);
            System.out.println(equi.getRarete());
        }while (equi.getRarete()!=rarete);
        System.out.println("vous avez recu : "+equi.getName() +"    "+equi.type+"    "+equi.getRarete());
        return equi;
    }
    public static void menu(){
        method.clearConsole();
        method.printLine(50);
        afficherMenuEnGros("Menue");
        System.out.println("Dans le menue vous pouvez trouvez different onglet. Vous lancez un combat ou interagir avec vos personnage.");
        System.out.println("1. Lancez un combat !!!");
        System.out.println("2. Joueur ");
        int choix=method.scInt("=>",3000000);
        if(choix==1) {
            System.out.println("Combien d'enemies affronter vous ?");
            combat.decla1ennemie(method.scInt("=>",5));
        } else if (choix==2) {
            method.clearConsole();
            method.printLine(50);
            afficherMenuEnGros("Choix du joueur");
            System.out.println(" ");
            System.out.println("Dans l'inventaire de quelle joueur voulez interagir ?");
            for(int i=0;i<listeplay.size();i++){
                System.out.println(i+1 + ". " + listeplay.get(i).getName());


            }
            method.printLine(50);
            int choixJoue = sc.nextInt();
            afficherInven(listeplay.get(choixJoue-1));
        }



    }

    public static void afficherInven(joueur joueur){
        method.clearConsole();
        method.printLine(50);
        afficherMenuEnGros(joueur.getName());
        System.out.println("Ath de " + joueur.getName());
        System.out.println("1. Statistique");
        System.out.println("2. Compétence");
        System.out.println("3. Inventaire");
        System.out.println("4. Retour Menue");
        method.printLine(50);
        int choix=method.scInt("=>",3000000);
        if(choix==1) {
            joueur.afficherStatistiques(joueur);
            System.out.println("1. Revenir en arrière");
            System.out.println("2. Retour Menue");
            int choix2 = method.scInt("=>",30000000);
            if (choix2==1) {
                afficherInven(joueur);
            }
            else if (choix2==2) {
                menu();
            }

        }
        else if (choix==2) {
            method.clearConsole();
            method.printLine(50);
            afficherMenuEnGros("Toutes vos compétences");
            affichageCompe(joueur);
            System.out.println("1. Revenir en arrière");
            System.out.println("2. Retour Menue");
            int choix2 = method.scInt("=>",30000000);
            if (choix2==1) {
                afficherInven(joueur);
            }
            else if (choix2==2) {
                menu();
            }
        }
        else if (choix==3) {

        }
        else if (choix==4) {
            menu();
        }
    }

    public static void afficherMenuEnGros(String Word) {
        System.setProperty("console.font", "Arial-56");
        // Code pour effacer la console (fonctionne dans la plupart des consoles)
        System.out.print("\033[H\033[2J");

        // Code pour afficher "Menu" en gros et en rouge
        String message = Word;
        String ANSI_RED = "\u001B[31m";
        String ANSI_BOLD = "\u001B[1m";
        String ANSI_RESET = "\u001B[0m";

        String grosMessage = "";
        for (int i = 0; i < message.length(); i++) {
            grosMessage += ANSI_BOLD + ANSI_RED + message.charAt(i) + ANSI_RESET + " ";
        }

        System.out.println(grosMessage);
        System.setProperty("console.font", "Arial-16");
    }

}
