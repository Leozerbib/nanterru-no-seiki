package org.example.mechanic;

import lombok.Getter;
import lombok.Setter;
import org.example.method;
import org.example.method.*;
import org.example.perso.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Getter@Setter
public class Start {
    static Scanner sc =new Scanner(System.in);
    public static ArrayList<joueur> listeplay = new ArrayList<>();
    public static ArrayList<competence> listeCompe;
    public static void Start(){
        competence.rangerCompetences();
        System.out.println(competence.listecompe1.size());
        method.clearConsole();
        method.printLine(50);
        System.out.println("Combien de joueur êtes-vous ?");
        int choix=method.scInt("=>",10);
        for(int i=1; i<=choix;i++){
            ArrayList<competence> listeCompe = new ArrayList<>();
            ArrayList<objet> inventaire = new ArrayList<>();
            equip equip = new equip(equiAtt.equiAtt1,equiDef.equiDef,equiSpeed.equiSpeed,equiPocheton.equiPocheton);
            joueur play = new joueur("", "joueur", 0,500, 500, 0, 50, 10, 100, 1, 0, 1, CharClass.A, 1, 1, 20, 100,100, 0.15, 20,listeCompe,inventaire,equip);
            listeplay.add(play);
            CreaPers(i-1,listeplay.get(i-1));
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getAtt());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getDef());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getSpeed());
            refreshequip(listeplay.get(i-1),listeplay.get(i-1).equip.getPocheton());
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
    public static void refreshequip(joueur joueur,equipement equipement){
        for (int i =0;i<equipement.boost.length;i++){
            booster.appliquerEffet(joueur,equipement.boost[i]);
        }
    }
    public static void CreaPers(int i,joueur player){
        System.out.println("Quelle est votre nom ?");
        String nom= sc.next();
        System.out.println("Voici les classes de personnage disponible sur le jeu ?");
        for(CharClass p : CharClass.values()){
            System.out.println( p +". "+p.getType() +" : " + p.getName());
        }

        System.out.println("Vous devez choisir une Classe de perso, ce choix impactera votre style de jeu. Il existe des dps,des tank et un healer leur role vous aiderai dans les combats et dans les quete.\n Quelle Classe voulez-vous ? :");
        CharClass ch = CharClass.valueOf(sc.next());
        Appli(ch,i,player,nom);

    }
    public static joueur Appli(CharClass A,int i,joueur player,String nom){
        player.setName(nom);
        player.setChance(player.getChance()+ A.getChance());
        player.setCrit(player.getCrit()+ A.getCrit());
        player.setNum(i);
        player.setChartype(A);
        player.setForce(player.getForce()+ A.getForce());
        player.setEnrgie(player.getEnrgie()+ A.getEnrgie());
        player.setCritChan(player.getCritChan()*A.getCritChan());
        player.setIntel(player.getIntel()+A.getIntel());
        player.setAcc(player.getAcc()+A.getAcc());
        player.setAtt(player.getAtt()+A.getAtt());
        player.setDef(player.getDef()+A.getDef());
        listeplay.get(i).setMaxHP(player.getMaxHP()+A.getMaxHP());
        player.setShield(player.getShield()+A.getShield());
        player.setSpeed(player.getSpeed()*A.getSpeed());
        joueur.initComp(player);
        return player;
    }
}
