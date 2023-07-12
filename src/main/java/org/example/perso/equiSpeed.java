package org.example.perso;

public class equiSpeed extends equipement{
    public equiSpeed(String name, String desc, int id, org.example.perso.rarete rarete, ObjetStyle Type, objetType type, booster[] boost) {
        super(name, desc, id, rarete, Type, type, boost);
    }
    public static equiSpeed equiSpeed =  new equiSpeed("1","1",1,rarete.Galienni,ObjetStyle.equipement,objetType.speed, new booster[]{new booster(50, org.example.perso.boost.speed, 2)});
}
