package org.example.perso;

import lombok.*;

import java.util.ArrayList;


@Getter
public enum CharClass {
    A("1","dps",150,2,1,1.35,1.25,2,20,1,10,20,1,1,competence.listecompe1),
    B("2","dps",120,1.25,1.1,1.25,1.75,2.75,30,3,50,20,1,1,competence.listecompe2),
    C("3","dps",50,1.75,1,1.75,1.15,1.5,100,1,30,20,1,200,competence.listecompe3),
    D("4","tank",350,0.75,2,0.95,0.5,2.2,50,1,-20,80,1,300,competence.listecompe4),
    E("5","tank",550,0.85,2.5,0.5,0.85,1.5,20,1,-50,100,1,800,competence.listecompe5),
    F("6","healer",200,1,1.5,1.55,1.25,1.5,40,1,60,20,1,200,competence.listecompe6);
    private int chance;
    private int intel;
    private double crit;
    private int enrgie;
    private ArrayList<competence> listeCompetence;
    private double critChan;
    private int force;
    private String name;
    private String type;
    private int maxHP;
    private double att;
    private double def;
    private double acc;
    private double shield;
    private double speed;
    CharClass(String name,
                 String type,
                 int maxHP,
                 double att,
                 double def,
                 double speed,
                 double critChan,
                 double crit,
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
