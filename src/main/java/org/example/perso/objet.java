package org.example.perso;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public abstract class objet {
    private String name;
    private String desc;
    private int id;
    private rarete rarete;
    private ObjetStyle Type;
    private int poid;
    private int number;
    public objet(String name,String desc,int id,rarete rarete,ObjetStyle Typ,int poid,int number){
        this.name=name;
        this.desc=desc;
        this.id=id;
        this.rarete=rarete;
        this.Type=Typ;
        this.poid=poid;
        this.number=number;
    }

}
