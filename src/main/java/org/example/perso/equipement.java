package org.example.perso;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public abstract class equipement extends objet{
    public objetType type;
    public booster[] boost;
    public equipement(String name, String desc, int id, org.example.perso.rarete rarete, ObjetStyle Type,objetType type,booster[] boost) {
        super(name, desc, id, rarete, ObjetStyle.equipement);
        this.type=type;
        this.boost=boost;

    }
  }
