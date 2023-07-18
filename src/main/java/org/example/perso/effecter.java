package org.example.perso;

import lombok.Getter;
import lombok.Setter;
import org.example.mechanic.MethodGen;
import org.example.mechanic.Start;
import org.example.mechanic.combat;
import org.example.method;

import java.util.Random;

import static java.awt.Color.green;
import static java.awt.Color.red;
import static org.example.perso.joueur.afficherBarreBleue;

@Getter@Setter
public class effecter {
    private double num;
    private effect type;
    private int turn;

    public effecter(int num, effect type, int turn) {
        this.num = num;
        this.type = type;
        this.turn = turn;
    }
    public static boolean shield(charactere cible){
        boolean shield=false;
        if (cible.actualshield>0){
            shield=true;
        }
        return shield;
    }
    public static void applyEffect(charactere charactere,effecter effect,int i,String nomComp) {
        org.example.perso.effect effectType = effect.getType();
        org.example.perso.charactere cible;
        int crit=0;
        MethodGen.afficherMenuEnGros("Attack !!");
        method.printLine(50);
        if (charactere.getType()=="joueur"){
            cible= combat.combattant.get(i);
            crit=crit((joueur) charactere);
        }else{
            cible= Start.listeplay.get(i);
        }
        switch (effectType) {
            case damage:
                int dmg=damage(charactere, (int) effect.getNum(),cible)+crit;
                if (shield(cible)==true){
                    cible.setActualshield(cible.actualshield-dmg);
                    if (cible.actualshield<0){
                        cible.setActualshield(0);
                    }
                }else {
                    cible.setHp(cible.getHp() - dmg);
                    if (cible.hp<0){
                        cible.setHp(0);
                    }
                }
                affDamage(charactere,cible,dmg,nomComp);
                break;
            case heal:
                // Logique pour appliquer le soin
                break;
            case timedamage:
                // Logique pour appliquer les dommages dans le temps
                break;
            case timeheal:
                // Logique pour appliquer le soin dans le temps
                break;
            case menace:
                // Logique pour gérer l'effet de menace
                break;
            case esquive:
                // Logique pour gérer l'effet d'esquive
                break;
            case damaredu:
                // Logique pour réduire les dommages
                break;
            case damagetoheal:
                // Logique pour convertir les dommages en soin
                break;
            case healtredu:
                // Logique pour réduire les soins reçus
                break;
            case defredu:
                // Logique pour réduire la défense
                break;
            case attredu:
                // Logique pour réduire l'attaque
                break;
            case speedredu:
                // Logique pour réduire la vitesse
                break;
            case multidama:
                // Logique pour gérer les dommages multiples
                break;
            default:
                // Cas par défaut si l'effet n'est pas pris en charge
                break;
        }}
    public static int crit(joueur charactere){
        int random=new Random().nextInt(1);
        int critdmg=0;
        if (charactere.getCritChan()>random){
            critdmg= (int) (charactere.getCrit()*charactere.getAtt());
            System.out.println("Ta tirer un sacré lat mon reuf, Coup Critique : " +"\u001B[32m"+critdmg );
        }
        return critdmg;
    }
    public static void affDamage(charactere charactere,charactere cible,int damage,String nomComp){
        System.out.println("\u001B[31m" +charactere.getName() + "\u001B[0m"+" a utilisé " + "\u001B[31m" +nomComp+" "+"\u001B[32m"+ cible.getName() +"\u001B[0m"+" !!!!");
        System.out.println("\u001B[32m"+ cible.getName() +"\u001B[0m" + " a subi " + damage +" degat.");
        afficherBarreBleue((int) ((cible.getActualshield()/ cible.getShield())*100),cible, cible.actualshield, "joueur","\u001B[44m","\u001B[41m","\u001B[0m");
        afficherBarreBleue((int) ((cible.getHp()/ cible.getMaxHP())*100),cible, cible.hp, "joueur","\u001B[42m","\u001B[41m","\u001B[0m");
        method.printLine(50);
        method.enterContinue();
    }
    public static int damage(charactere character,int num,charactere cible){
        int dmg= num*character.getAtt();
        dmg = (int) (dmg - cible.getDef()*dmg);
        return dmg;
    }
    public double heal(charactere character,int num){
         double heal = num*character.getMaxHP();
         return heal;
    }
    public void menace(joueur joueur,effect effect){

    }
    public void esquive(joueur joueur,effect effect){

    }
    public void damaredu(joueur joueur,effect effect){

    }
    public void damtoheal(joueur joueur,effect effect){

    }
    public double healthredu(charactere character,int num){
        double heathredu=num*character.getMaxHP();
        return heathredu;
    }
    public double defredu(charactere character,int num){
        double defredu=character.getDef()*num;
        return defredu;
    }
    public double attredu(charactere character,int num){
        double attredu=character.getAtt()*num;
        return attredu;
    }
    public double speedredu(charactere character,int num){
        double speedredu=num*character.getSpeed();
        return speedredu;
    }
}
