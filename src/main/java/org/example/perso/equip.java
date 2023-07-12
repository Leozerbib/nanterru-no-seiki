package org.example.perso;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class equip {
    private equiAtt att;
    private equiDef def;
    private equiSpeed speed;
    private equiPocheton pocheton;
    public equip(equiAtt att,equiDef def,equiSpeed speed,equiPocheton pocheton){
        this.att=att;
        this.def=def;
        this.speed=speed;
        this.pocheton=pocheton;
    }
}
