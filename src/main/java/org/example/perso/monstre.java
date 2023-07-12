package org.example.perso;

public class monstre extends ennemy {

    public monstre(String name, String type, int num,int maxHP, double hp, double exp, int att, double def, double speed, double acc, double shield) {
        super(name, type,num, maxHP, hp, exp, att, def, speed, acc, shield);
    }
    public static ennemy ennemy1=new monstre("A","monstre",0,1000,1000,100,10,10,120,1,1);
    public static ennemy ennemy2=new monstre("B","monstre",1,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy3=new monstre("C","monstre",2,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy4=new monstre("D","monstre",3,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy5=new monstre("E","monstre",4,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy6=new monstre("F","monstre",5,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy7=new monstre("G","monstre",6,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy8=new monstre("H","monstre",7,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy9=new monstre("K","monstre",8,10000,10000,100,10,10,120,1,1);
    public static ennemy ennemy10=new monstre("L","monstre",9,10000,10000,1000,10,10,120,1,1);
    public static ennemy ennemy11=new monstre("M","monstre",10,10000,10000,1000,10,10,120,1,1);
    public static ennemy ennemy12=new monstre("N","monstre",11,10000,10000,10,10,10,120,1,1);
}
