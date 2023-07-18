package org.example.perso;

import lombok.Getter;
import lombok.Setter;
import org.example.mechanic.MethodGen;
import org.example.mechanic.Start;
import org.example.method;

import java.util.ArrayList;

import static java.awt.Color.CYAN;
import static java.awt.Color.yellow;

@Getter@Setter
public class joueur extends charactere{
    private int level;
    private CharClass Chartype;
    private int chance;
    private int intel;
    private double crit;
    private double actualEnergie;
    private double enrgie;
    private double CritChan;
    private int force;
    private ArrayList<competence> listecompetence;
    private ArrayList<ArrayList<objet>> inventaire;
    public equip equip;

    public joueur(String name, String type, int num,int maxHP, double hp, double exp, int att, double def, double speed,double acc, double shield,double actualshield,int level,CharClass Chartype,int chance,int intel, double crit,double actualEnergie,double enrgie,double CritChan,int force,ArrayList<competence> listecompetence,ArrayList<ArrayList<objet>> inventaire,equip equip) {
        super(name, type,num, maxHP, hp, exp, att, def,speed, acc, shield,actualshield);
        this.chance=chance;
        this.Chartype=Chartype;
        this.crit=crit;
        this.actualEnergie=actualEnergie;
        this.enrgie=enrgie;
        this.force=force;
        this.CritChan=CritChan;
        this.intel=intel;
        this.level=level;
        this.listecompetence=listecompetence;
        this.inventaire=inventaire;
        this.equip=equip;

    }
    public static void initComp(joueur joueur){
        joueur.getListecompetence().addAll(competence.triecompe(joueur.getChartype().getListeCompetence()));
    }
    public static void afficherStatistiques(joueur player) {
        String reset = "\u001B[0m";
        String bold = "\u001B[1m";
        String yellow = "\u001B[33m";
        String cyan = "\u001B[36m";
        String green = "\u001B[32m";
        String red = "\u001B[31m";
        String purple = "\u001B[35m";

        MethodGen.afficherMenuEnGros("Statistique de : " + player.getName());
        System.out.println(" ");
        method.printLine(20);
        System.out.println(red+bold + "     Info joueur :"+reset);
        System.out.println("Nom : " + cyan + player.getName() + reset);
        System.out.println("Type : " + cyan + player.getType() + reset);
        System.out.println("Classe de personnage : " + cyan + player.Chartype + reset);
        System.out.println("Niveau : " + purple + player.level + reset);
        System.out.println("Expérience : " + yellow + player.getExp() + reset);
        System.out.println("Max energie : " + yellow + player.enrgie + reset);
        org.example.perso.joueur.afficherBarreBleue((int) (player.getActualEnergie()/player.getEnrgie()*100),player, player.getActualEnergie(), "Energie","\u001B[43m","\u001B[0m",reset);
        System.out.println(player.getActualEnergie()/ player.getEnrgie());
        System.out.println(" ");
        method.printLine(20);
        System.out.println(red+bold + "     Stat :"+reset);
        System.out.println("Points de vie max : " + yellow + player.getMaxHP() + reset);
        afficherBarreBleue((int) (player.getHp()/ player.getMaxHP()*100),player, player.getHp(),"PV","\u001B[44m","\u001B[41m","\u001B[44m");
        System.out.println("Bouclier : " + yellow  + player.getShield() + reset);
        System.out.println("Attaque : " + yellow + player.getAtt() + reset);
        System.out.println("Défense : " + yellow + player.getDef() + reset);
        System.out.println("Vitesse : " + yellow + player.getSpeed() + reset);
        System.out.println("Précision : " + yellow + player.getAcc() + reset);
        System.out.println("Chance de coup critique : " + yellow + player.CritChan + reset);
        System.out.println("Critique : " + yellow + player.crit + reset);
        System.out.println(" ");
        method.printLine(20);
        System.out.println(red+bold + "     Stat secondaire :"+reset);
        System.out.println("Chance : " + cyan + player.chance + reset);
        System.out.println("Intelligence : " + cyan + player.intel + reset);
        System.out.println("Force : " + green + bold + player.force + reset);
    }

    public static void afficherBarreBleue(int pourcentage,charactere player,double valeur,String type,String coulPos,String coulNeg,String Neut) {
        int longueurBarre = 30; // Longueur de la barre en caractères
        int remplissage = (int) (pourcentage / 100.0 * longueurBarre); // Calcul du nombre de caractères à remplir

        System.out.print(type+" : [");
        for (int i = 0; i < longueurBarre; i++) {
            if (i < remplissage) {
                System.out.print(coulPos+" "); // Caractère bleu pour le remplissage de la barre
            } else {
                System.out.print(coulNeg+ " "); // Caractère vide pour le reste de la barre
            }
        }
        System.out.println("\u001B[0m"+"] " + "\u001B[33m"+ valeur + "\u001B[0m");
    }
    public static void afficherBarreBle(int pourcentage,charactere player,double valeur,String type,String coulPos,String coulNeg,String Neut) {
        int longueurBarre = 30; // Longueur de la barre en caractères
        int remplissage = (int) (pourcentage / 100.0 * longueurBarre); // Calcul du nombre de caractères à remplir

        System.out.print(type+" : [");
        for (int i = 0; i < longueurBarre; i++) {
            if (i < remplissage) {
                System.out.print(coulPos+"H"); // Caractère bleu pour le remplissage de la barre
            } else {
                System.out.print(coulNeg+ " "); // Caractère vide pour le reste de la barre
            }
        }
        System.out.println("\u001B[0m"+"] " + "\u001B[33m"+ valeur + "\u001B[0m");
    }

}
