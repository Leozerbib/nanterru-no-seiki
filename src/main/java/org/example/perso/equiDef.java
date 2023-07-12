package org.example.perso;

public class equiDef extends equipement{
    public equiDef(String name, String desc, int id, org.example.perso.rarete rarete, ObjetStyle Type, objetType type, booster[] boost) {
        super(name, desc, id, rarete, Type, type, boost);
    }
    public static equiDef equiDef=new equiDef("1","1",1,rarete.Galienni,ObjetStyle.equipement,objetType.def,new booster[]{new booster(5, org.example.perso.boost.def, 2)});

}
