package org.example.perso;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class booster {
    private double boost;
    private boost type;
    private int turn;

    public booster(double boost, boost type, int turn) {
        this.boost = boost;
        this.type = type;
        this.turn = turn;
    }


    public static void appliquerEffet(charactere joueur,booster Effet) {
        org.example.perso.boost typeEffet = Effet.getType();
        switch (typeEffet) {
            case att:
                applyAttackBoost(joueur,Effet);
                break;
            case def:
                // Logique pour appliquer le boost de défense
                applyDefenseBoost(joueur,Effet);
                break;
            case crit:
                applycritBoost((org.example.perso.joueur) joueur,Effet);
                break;
            case critChance:
                applyCritchanBoost((org.example.perso.joueur) joueur,Effet);
                break;
            case acc:
                // Logique pour appliquer le boost de précision
                applyAccBoost(joueur,Effet);
                break;
            case hp:
                // Logique pour appliquer le boost de points de vie
                applyhpBoost(joueur,Effet);
                break;
            case speed:
                // Logique pour appliquer le boost de vitesse
                applyspeedBoost(joueur,Effet);
                break;
            case shield:
                // Logique pour appliquer le boost de bouclier
                break;
            case energie:
                // Logique pour appliquer le boost d'énergie
                break;
            default:
                // Cas par défaut si l'effet n'est pas pris en charge
                break;
        }
    }
    public static void removeEffet(charactere joueur, booster Effet) {
        org.example.perso.boost typeEffet = Effet.getType();
        switch (typeEffet) {
            case att:
                lyAttackBoost(joueur,Effet);
                break;
            case def:
                // Logique pour appliquer le boost de défense
                lyDefenseBoost(joueur,Effet);
                break;
            case crit:
                lycritBoost((org.example.perso.joueur) joueur,Effet);
                break;
            case critChance:
                lyCritchanBoost((org.example.perso.joueur) joueur,Effet);
                break;
            case acc:
                // Logique pour appliquer le boost de précision
                lyAccBoost(joueur,Effet);
                break;
            case hp:
                // Logique pour appliquer le boost de points de vie
                lyhpBoost(joueur,Effet);
                break;
            case speed:
                // Logique pour appliquer le boost de vitesse
                lyspeedBoost(joueur,Effet);
                break;
            case shield:
                // Logique pour appliquer le boost de bouclier

                break;
            case energie:
                // Logique pour appliquer le boost d'énergie
                break;
            default:
                // Cas par défaut si l'effet n'est pas pris en charge
                break;
        }
    }



    public static void applyAttackBoost(charactere player, booster booster) {
        int current = player.getAtt();
        player.setAtt((int) (current + booster.boost));
    }

    public static void applyDefenseBoost(charactere player, booster booster) {
        double current = player.getDef();
        player.setDef(current * booster.boost);
    }

    public static void applycritBoost(joueur player, booster booster) {
        double current = player.getCrit();
        player.setCrit( current* booster.boost);
    }

    public static void applyCritchanBoost(joueur player, booster booster) {
        double current = player.getCritChan();
        player.setCritChan(current * booster.boost);
    }

    public static void applyAccBoost(charactere player, booster booster) {
        double current = player.getAcc();
        player.setAcc(current * booster.boost);
    }

    public static void applyhpBoost(charactere player, booster booster) {
        double current = player.getHp();
        player.setHp(current * booster.boost);
    }

    public static void applyspeedBoost(charactere player, booster booster) {
        double current = player.getSpeed();
        player.setSpeed(current + booster.boost);
    }

    public static void applyshieldBoost(joueur player, booster booster) {
        double current = player.getShield();
        player.setShield(current * booster.boost);
    }

    public static void applyenergieBoost(joueur player, booster booster) {
        double current = player.getEnrgie();
        player.setEnrgie(current + booster.boost);
    }

    public static void lyAttackBoost(charactere player, booster booster) {
        int current = player.getAtt();
        player.setAtt((int) (current - booster.boost));
    }

    public static void lyDefenseBoost(charactere player, booster booster) {
        double current = player.getDef();
        player.setDef(current / booster.boost);
    }

    public static void lycritBoost(joueur player, booster booster) {
        double current = player.getCrit();
        player.setCrit(current/booster.boost);
    }

    public static void lyCritchanBoost(joueur player, booster booster) {
        double current = player.getCritChan();
        player.setCritChan(current / booster.boost);
    }

    public static void lyAccBoost(charactere player, booster booster) {
        double current = player.getAcc();
        player.setAcc(current - booster.boost);
    }

    public static void lyhpBoost(charactere player, booster booster) {
        double current = player.getHp();
        player.setHp(current / booster.boost);
    }

    public static void lyspeedBoost(charactere player, booster booster) {
        double current = player.getSpeed();
        player.setSpeed(current - booster.boost);
    }

    public static void lyshieldBoost(joueur player, booster booster) {
        double current = player.getShield();
        player.setShield(current / booster.boost);
    }

    public static void lyenergieBoost(joueur player, booster booster) {
        double current = player.getEnrgie();
        player.setEnrgie(current - booster.boost);
    }
}
