package org.example.perso;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Boostapply {
    public booster booster;
    public charactere charactere;
    public Boostapply(booster booster,charactere charactere){
        this.booster=booster;
        this.charactere=charactere;
    }

}
