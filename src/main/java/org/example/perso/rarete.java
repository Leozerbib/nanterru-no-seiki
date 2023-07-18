package org.example.perso;

import lombok.Getter;

@Getter
public enum rarete {
    Galienni(1,2,1),
    filtrer(0.35,2,1.5),
    weed(0.20,3,1.75),
    CaliWeed(0.5,4,2),
    Moonrock(0.005,5,2.5);
    double drop;
    int number;
    double value;
    rarete(double drop,int number,double value){

        this.drop=drop;
        this.number=number;
        this.value=value;
    }

}
