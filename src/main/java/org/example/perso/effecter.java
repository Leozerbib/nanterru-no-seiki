package org.example.perso;

import lombok.Getter;
import lombok.Setter;

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
    public static void applyEffect(charactere charactere,effecter effect,int i) {
        org.example.perso.effect effectType = effect.getType();
        switch (effectType) {
            case damage:
                    org.example.mechanic.combat.combattant.get(i).setHp(org.example.mechanic.combat.combattant.get(i).getHp()-damage(charactere, (int) effect.getNum()));
                System.out.println(org.example.mechanic.combat.combattant.get(i).getHp());

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
    public static int damage(charactere character,int num){
        int dmg= num*character.getAtt();
        System.out.println(character.getAtt() + "..." +num);
        System.out.println("vous avez fait "+dmg +"degat !!");
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
