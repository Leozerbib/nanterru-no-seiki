package org.example.perso;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class equip {
    private equiAtt att;
    private equiAtt att1;
    private equiDef def;
    private equiSpeed speed;
    private equiPocheton pocheton;
    private equiPocheton pocheton1;
    public equip(equiAtt att,equiAtt att1,equiDef def,equiSpeed speed,equiPocheton pocheton,equiPocheton pocheton1){
        this.att=att;
        this.att1=att1;
        this.def=def;
        this.speed=speed;
        this.pocheton=pocheton;
        this.pocheton1=pocheton1;
    }
}
