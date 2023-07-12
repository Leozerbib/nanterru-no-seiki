package org.example.perso;

import lombok.Getter;
import lombok.Setter;

public abstract class charactere {
    @Getter @Setter
    private String name;
    @Getter@Setter
    private String type;
    @Getter@Setter
    private int maxHP;
    @Getter@Setter
    public double hp;
    @Getter@Setter
    private double exp;
    @Getter@Setter
    private int att;
    @Getter@Setter
    private double def;
    @Getter@Setter
    private double acc;
    @Getter@Setter
    private double shield;
    @Getter@Setter
    private double speed;
    @Getter@Setter
    private int num;
    public charactere(String name,String type,int num,int maxHP,double hp,double exp, int att,double def,double speed,double acc,double shield){
        this.name=name;
        this.type=type;
        this.num=num;
        this.maxHP=maxHP;
        this.hp=maxHP;
        this.exp=exp;
        this.att=att;
        this.def=def;
        this.speed=speed;
        this.acc=acc;
        this.shield=shield;

    }


}
