package org.example.perso;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter@Setter
public abstract class ennemy extends charactere {
    private ArrayList<equipement> loot;
   @Getter@Setter
    public Ressource ressource;
    public ennemy(String name, String type, int num, int maxHP, double hp, double exp, int att, double def, double speed, double acc, double shield, double actualshield, ArrayList<equipement> loot, Ressource ressource) {
        super(name, type,num, maxHP, hp, exp, att, def,speed, acc, shield,actualshield);
        this.loot=loot;
        this.ressource=ressource;
    }


}
