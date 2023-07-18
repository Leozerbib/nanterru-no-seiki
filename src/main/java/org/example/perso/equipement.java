package org.example.perso;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class equipement extends objet{
    public objetType type;

    public ArrayList<booster> boost;
    public int niveau;

    public equipement(String name, String desc, int id, org.example.perso.rarete rarete, ObjetStyle Typ, objetType type,ArrayList<booster> boost,int poid, int number,int niveau) {
        super(name, desc, id, rarete, Typ, poid, number);
        this.type=type;
        this.boost=boost;
        this.niveau=niveau;

    }


  }
