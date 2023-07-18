package org.example.perso;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;
@Getter@Setter
public class miniboss extends ennemy{
    @Getter@Setter
    public ArrayList<competence> listecompetence;

    public miniboss(String name, String type, int num, int maxHP, double hp, double exp, int att, double def, double speed, double acc, double shield,double actualshield,ArrayList<equipement> loot, Ressource ressource, ArrayList<competence> listecompetence) {
        super(name, type, num, maxHP, hp, exp, att, def, speed, acc, shield,actualshield, loot, ressource);
        this.listecompetence=listecompetence;

    }
    public static ennemy miniboss = new miniboss("1","Miniboss",1,15000,15000,500000,500,0.5,200,1,10000,10000,monstre.loot,monstre.ressource,new ArrayList<competence>());
    public static ArrayList<competence> setcompe(ennemy miniboss, joueur level){
        int palierLevel= level.getLevel();
        System.out.println(palierLevel);
        competence compechoose = null;
        ArrayList<competence> liste = new ArrayList<>();

        do {
            int random=new Random().nextInt(6);
            switch (random){
                case 1:
                    do {
                        int random2=new Random().nextInt(competence.listecompe1.size());

                        compechoose=competence.listecompe1.get(random2);
                        System.out.println(compechoose.getNiveau());
                    }while (compechoose.getNiveau()>palierLevel);
                    break;
                case 2:
                    do {
                        int random2=new Random().nextInt(competence.listecompe1.size());

                        compechoose=competence.listecompe2.get(random2);
                        System.out.println(compechoose.getNiveau());
                    }while (compechoose.getNiveau()>palierLevel);
                    break;
                case 3:
                    do {
                        int random2=new Random().nextInt(competence.listecompe1.size());

                        compechoose=competence.listecompe3.get(random2);
                        System.out.println(compechoose.getNiveau());
                    }while (compechoose.getNiveau()>palierLevel);
                    break;
                case 4:
                    do {
                        int random2=new Random().nextInt(competence.listecompe1.size());

                        compechoose=competence.listecompe4.get(random2);
                        System.out.println(compechoose.getNiveau());
                    }while (compechoose.getNiveau()>palierLevel);
                    break;
                case 5:
                    do {
                        int random2=new Random().nextInt(competence.listecompe1.size());

                        compechoose=competence.listecompe5.get(random2);
                        System.out.println(compechoose.getNiveau());
                    }while (compechoose.getNiveau()>palierLevel);
                    break;
                case 6:
                    do {
                        int random2=new Random().nextInt(competence.listecompe1.size());

                        compechoose=competence.listecompe6.get(random2);
                        System.out.println(compechoose.getNiveau());
                    }while (compechoose.getNiveau()>=palierLevel);
                    break;
            }
           liste.add(compechoose);
        }while (liste.size()<4);
        return liste;
    }
}
