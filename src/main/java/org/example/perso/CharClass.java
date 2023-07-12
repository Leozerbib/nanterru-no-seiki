package org.example.perso;

import lombok.*;

import java.util.ArrayList;


@Getter
public enum CharClass {
    A("1","dps",150,50,0,1.25,1.25,50,20,1,10,20,1,1,competence.listecompe1),
    B("2","dps",120,20,0,1.25,1.75,90,30,3,50,20,1,1,competence.listecompe2),
    C("3","dps",50,70,0,1.75,1.15,30,100,1,30,20,1,200,competence.listecompe3),
    D("4","tank",350,20,70,0.95,1.25,70,50,1,-20,80,1,300,competence.listecompe4),
    E("5","tank",550,30,100,0.65,1,50,20,1,-50,100,1,800,competence.listecompe5),
    F("6","healer",200,10,0,1.25,1.25,50,40,1,60,20,1,200,competence.listecompe6);
    private int chance;
    private int intel;
    private int crit;
    private int enrgie;
    private ArrayList<competence> listeCompetence;
    private double critChan;
    private int force;
    private String name;
    private String type;
    private int maxHP;
    private int att;
    private double def;
    private double acc;
    private double shield;
    private double speed;
    CharClass(String name,
                 String type,
                 int maxHP,
                 int att,
                 double def,
                 double speed,
                 double critChan,
                 int crit,
                 int enrgie,
                 int chance,
                 int intel,
                 int force,
                 double acc,
                 double shield,
                 ArrayList<competence> listeCompetence){
        this.name=name;
        this.type=type;
        this.maxHP=maxHP;
        this.att=att;
        this.def=def;
        this.speed=speed;
        this.acc=acc;
        this.shield=shield;
        this.chance=chance;
        this.crit=crit;
        this.enrgie=enrgie;
        this.force=force;
        this.critChan=critChan;
        this.intel=intel;
        this.listeCompetence=listeCompetence;
    }





}
