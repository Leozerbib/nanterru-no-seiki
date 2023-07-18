package org.example.perso;

import java.util.ArrayList;
import java.util.Random;

public enum Equipea {

    A1(equiAtt.equiAtt1),
    A2(equiAtt.equiAtt2),
    A3(equiAtt.equiAtt3),
    A4(equiAtt.equiAtt4),
    A5(equiAtt.equiAtt5),
    A6(equiAtt.equiAtt6),
    A7(equiAtt.equiAtt7),
    A8(equiAtt.equiAtt8),
    A9(equiAtt.equiAtt9),
    A10(equiAtt.equiAtt10),
    A11(equiAtt.equiAtt11),
    A12(equiAtt.equiAtt12),
    A13(equiAtt.equiAtt13),
    A14(equiAtt.equiAtt14),
    A15(equiAtt.equiAtt15),
    A16(equiAtt.equiAtt16),
    A17(equiAtt.equiAtt17),
    A18(equiAtt.equiAtt18),
    A19(equiAtt.equiAtt19),
    A20(equiAtt.equiAtt20),
    A21(equiAtt.equiAtt21),
    A22(equiAtt.equiAtt22),
    A23(equiAtt.equiAtt23),
    A24(equiAtt.equiAtt24),
    A25(equiAtt.equiAtt25),
    A26(equiAtt.equiAtt26),
    A27(equiAtt.equiAtt27),
    A28(equiAtt.equiAtt28),
    A29(equiAtt.equiAtt29),
    A30(equiAtt.equiAtt30),
    A31(equiAtt.equiAtt31),
    A32(equiAtt.equiAtt32),
    A33(equiAtt.equiAtt33),
    A34(equiAtt.equiAtt34),
    A35(equiAtt.equiAtt35),
    A36(equiAtt.equiAtt36),
    A37(equiAtt.equiAtt37),
    A38(equiAtt.equiAtt38),
    A39(equiAtt.equiAtt39),
    A40(equiAtt.equiAtt40),
    P1(equiPocheton.equiPocheton1),
    P2(equiPocheton.equiPocheton2),
    P3(equiPocheton.equiPocheton3),
    P4(equiPocheton.equiPocheton4),
    P5(equiPocheton.equiPocheton5),
    P6(equiPocheton.equiPocheton6),
    P7(equiPocheton.equiPocheton7),
    P8(equiPocheton.equiPocheton8),
    P9(equiPocheton.equiPocheton9),
    P10(equiPocheton.equiPocheton10),
    P11(equiPocheton.equiPocheton11),
    P12(equiPocheton.equiPocheton12),
    P13(equiPocheton.equiPocheton13),
    P14(equiPocheton.equiPocheton14),
    P15(equiPocheton.equiPocheton15),
    P16(equiPocheton.equiPocheton16),
    P17(equiPocheton.equiPocheton17),
    P18(equiPocheton.equiPocheton18),
    P19(equiPocheton.equiPocheton19),
    P20(equiPocheton.equiPocheton20),
    P21(equiPocheton.equiPocheton21),
    P22(equiPocheton.equiPocheton22),
    P23(equiPocheton.equiPocheton23),
    P24(equiPocheton.equiPocheton24),
    P25(equiPocheton.equiPocheton25),
    P26(equiPocheton.equiPocheton26),
    P27(equiPocheton.equiPocheton27),
    P28(equiPocheton.equiPocheton28),
    P29(equiPocheton.equiPocheton29),
    P30(equiPocheton.equiPocheton30),
    P31(equiPocheton.equiPocheton31),
    P32(equiPocheton.equiPocheton32),
    P33(equiPocheton.equiPocheton33),
    P34(equiPocheton.equiPocheton34),
    P35(equiPocheton.equiPocheton35),
    P36(equiPocheton.equiPocheton36),
    P37(equiPocheton.equiPocheton37),
    P38(equiPocheton.equiPocheton38),
    P39(equiPocheton.equiPocheton39),
    P40(equiPocheton.equiPocheton40),
    D1(equiDef.equiDef1),
    D2(equiDef.equiDef2),
    D3(equiDef.equiDef3),
    D4(equiDef.equiDef4),
    D5(equiDef.equiDef5),
    D6(equiDef.equiDef6),
    D7(equiDef.equiDef7),
    D8(equiDef.equiDef8),
    D9(equiDef.equiDef9),
    D10(equiDef.equiDef10),
    D11(equiDef.equiDef11),
    D12(equiDef.equiDef12),
    D13(equiDef.equiDef13),
    D14(equiDef.equiDef14),
    D15(equiDef.equiDef15),
    D16(equiDef.equiDef16),
    D17(equiDef.equiDef17),
    D18(equiDef.equiDef18),
    D19(equiDef.equiDef19),
    D20(equiDef.equiDef20),
    D21(equiDef.equiDef21),
    D22(equiDef.equiDef22),
    D23(equiDef.equiDef23),
    D24(equiDef.equiDef24),
    D25(equiDef.equiDef25),
    D26(equiDef.equiDef26),
    D27(equiDef.equiDef27),
    D28(equiDef.equiDef28),
    D29(equiDef.equiDef29),
    D30(equiDef.equiDef30),
    D31(equiDef.equiDef31),
    D32(equiDef.equiDef32),
    D33(equiDef.equiDef33),
    D34(equiDef.equiDef34),
    D35(equiDef.equiDef35),
    D36(equiDef.equiDef36),
    D37(equiDef.equiDef37),
    D38(equiDef.equiDef38),
    D39(equiDef.equiDef39),
    D40(equiDef.equiDef40);
    public equipement equipement;
    public static ArrayList<boost> listobj1 = new ArrayList<>();
    public static ArrayList<boost> listobj2 = new ArrayList<>();
    public static ArrayList<boost> listobj3 = new ArrayList<>();
    public static ArrayList<equipement> listobjet1 = new ArrayList<>();
    public static ArrayList<equipement> listobjet2 = new ArrayList<>();
    public static ArrayList<equipement> listobjet3 = new ArrayList<>();
    public static ArrayList<equipement> listobjet4 = new ArrayList<>();
    public static ArrayList<equipement> listobjet5 = new ArrayList<>();
    public static ArrayList<equipement> listobjet6 = new ArrayList<>();
    Equipea(equipement equipement){
        this.equipement= equipement;
    }
    public static void jsp(){
        listobj1.add(boost.att);
        listobj1.add(boost.critChance);
        listobj1.add(boost.crit);
        listobj1.add(boost.force);
        listobj2.add(boost.def);
        listobj2.add(boost.hp);
        listobj2.add(boost.shield);
        listobj2.add(boost.force);
        listobj3.add(boost.att);
        listobj3.add(boost.critChance);
        listobj3.add(boost.crit);
        listobj3.add(boost.force);
        listobj3.add(boost.def);
        listobj3.add(boost.hp);
        listobj3.add(boost.shield);
        listobj3.add(boost.force);
    }
    public static void equipbooster(equipement equipement){
        boost type=boost.att;
        int random=0;
        float value=0;
        for (int i=1;i<=equipement.getRarete().number;i++){
        switch (equipement.type) {
            case att:
                random = new Random().nextInt(listobj1.size());
                type = listobj1.get(random);
                break;
            case def:
                random = new Random().nextInt(listobj2.size());
                type = listobj2.get(random);
                break;
            case pocheton:
                random = new Random().nextInt(listobj3.size());
                type = listobj3.get(random);
                break;
        }

            value= (float) switchatt(type,equipement.getRarete().value);
            booster booster=new booster(value,type,2);
            equipement.boost.add(booster);
        }



    }

    public static double switchatt(boost type,double mult){
        double value=0;
        Random random = new Random();
        float nb=0;
        switch (type) {
            case att:
                nb = 40+random.nextInt(60-40);
                value=nb*mult;
                break;
            case def:
                nb = (float) (1.05+random.nextFloat((float) (1.15-1.05)));
                value=nb+mult/20;

                break;
            case crit:
                nb = (float) (1.5+random.nextFloat((float) (1.75-1.5)));
                value=nb+mult/10;

                break;
            case critChance:
                nb = (float) (1.05+random.nextFloat((float) (1.15-1.05)));
                value=nb+mult/20;

                break;
            case hp:
                nb = 90+random.nextInt(120-90);
                value=nb*mult;

                break;
            case shield:
                nb = 40+random.nextInt(60-40);
                value=nb*mult;

                break;
            case force:
                nb = 5+random.nextInt(10-5);
                value=nb*mult;

                break;
        }
        return value;
    }

    // Méthode pour effectuer le calcul du boost en fonction du niveau de l'équipement
    private static float calculerBoost(boost type, float boost, int niveau) {
        float boostModifie = boost;
        for (int i = 1; i <= niveau; i++){
            switch (type) {
                case att:
                    boostModifie *= 1.045f;
                    break;
                case def:
                    boostModifie += 0.025f;
                    break;
                case crit:
                    boostModifie += 0.05f;
                    break;
                case critChance:
                    boostModifie += 0.005f;
                    break;
                case hp:
                    boostModifie *= 1.045f;
                    break;
                case shield:
                    boostModifie *= 1.045f;
                    break;
                case force:
                    boostModifie += 1f;
                    break;
            }
    }
        return boostModifie;
    }


    // Méthode pour trier l'équipement
    public static void triEquip() {
        for (Equipea att : Equipea.values()) {
            if (att.equipement instanceof equiAtt || att.equipement instanceof equiDef || att.equipement instanceof equiPocheton) {
                equipement equi = att.equipement;
                for (int i = 0; i < 6; i++) {
                    equipement equiCopy = createCopyWithModifiedLevel(equi, i);
                    addEquipmentToList(equiCopy, i);
                }
            }
        }
    }

    private static equipement createCopyWithModifiedLevel(equipement equi, int index) {
        ArrayList<booster> please=new ArrayList<>();
        for (booster b : equi.boost) {
            double value=b.getBoost();
            boost type=b.getType();
            value=(calculerBoost(type, (float) value, equi.niveau + (int) (3.7 * index) + index));
            booster booster=new booster(value,type,2);
            please.add(booster);
        }
        equipement equiCopy = new equipement(
                equi.getName(),
                equi.getDesc(),
                equi.getId() +index,
                equi.getRarete(),
                equi.getType(),
                equi.type,
                please,
                equi.getPoid(),
                equi.getNumber(),
                equi.niveau + (int) (3.7 * index) + index
        );



        return equiCopy;
    }

    private static void addEquipmentToList(equipement equi, int index) {
        switch (index) {
            case 0:
                listobjet1.add(equi);
                break;
            case 1:
                listobjet2.add(equi);
                break;
            case 2:
                listobjet3.add(equi);
                break;
            case 3:
                listobjet4.add(equi);
                break;
            case 4:
                listobjet5.add(equi);
                break;
            case 5:
                listobjet6.add(equi);
                break;
        }
    }
}
