package org.example.perso;

public class equiPocheton extends equipement{
    public equiPocheton(String name, String desc, int id, org.example.perso.rarete rarete, ObjetStyle Type, objetType type, booster[] boost) {
        super(name, desc, id, rarete, Type, type, boost);
    }
    public static equiPocheton equiPocheton=new equiPocheton("1","1",1,rarete.Galienni,ObjetStyle.equipement,objetType.pocheton,new booster[]{new booster(100, org.example.perso.boost.att, 2),new booster(100, org.example.perso.boost.speed, 2)});
}
