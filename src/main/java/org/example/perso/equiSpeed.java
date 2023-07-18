package org.example.perso;

import java.util.ArrayList;

public class equiSpeed extends equipement{

    public static equiSpeed equiSpeed =  new equiSpeed("1","1",1,rarete.Galienni,ObjetStyle.equipement,objetType.speed, new ArrayList<booster>(),1,0,1);

    public equiSpeed(String name, String desc, int id, org.example.perso.rarete rarete, ObjetStyle Typ, objetType type,ArrayList<booster> boost, int poid, int number, int niveau) {
        super(name, desc, id, rarete, Typ, type, boost, poid, number, niveau);
    }
}
