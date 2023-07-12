package org.example.perso;

import lombok.Getter;

@Getter
public enum rarete {
    Galienni(0.75),
    filtrer(0.50),
    weed(0.20),
    CaliWeed(0.05),
    Moonrock(0.005);
    double drop;
    rarete(double drop){
        this.drop=drop;
    }

}
