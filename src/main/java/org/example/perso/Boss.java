package org.example.perso;

public abstract class Boss extends ennemy{
    public Boss(String name, String type,int num, int maxHP, double hp, double exp, int att, double def, double speed,double acc, double shield) {
        super(name, type,num, maxHP, hp, exp, att, def,speed, acc, shield);
    }
}
