package org.example.perso;
import lombok.*;

import java.util.ArrayList;

@Getter
public enum competence {
    competence1a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence2a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence3a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence4a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence5a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence6a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence7a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence8a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence9a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence10a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence11a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),
    competence12a("A", 1, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),

    competence1b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence2b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence3b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence4b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence5b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence6b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(500, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence7b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence8b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence9b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence10b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence11b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),
    competence12b("B", 2, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),

    competence1c("Attack basic", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(50, org.example.perso.effect.damage, 1)},1,false),
    competence2c("Boost att", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(1000, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(2, org.example.perso.effect.damage, 1)},1,false),
    competence3c("Boost Speed", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(100, org.example.perso.boost.speed, 1)}, new effecter[]{new effecter(2, org.example.perso.effect.damage, 1)},1,false),
    competence4c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence5c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence6c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence7c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence8c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence9c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence10c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence11c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),
    competence12c("C", 3, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),

    competence1d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence2d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence3d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence4d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence5d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence6d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence7d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence8d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence9d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence10d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence11d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),
    competence12d("D", 4, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),

    competence1e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence2e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence3e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence4e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence5e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence6e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence7e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence8e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence9e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence10e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence11e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),
    competence12e("E", 5, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),
    competence1f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence2f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence3f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence4f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},1,false),
    competence5f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence6f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},5,false),
    competence7f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence8f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},10,false),
    competence9f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence10f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},15,false),
    competence11f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false),
    competence12f("F", 6, "sous skil mgl", org.example.perso.type.active, new booster[]{new booster(50, org.example.perso.boost.att, 2)}, new effecter[]{new effecter(3, org.example.perso.effect.damage, 1)},20,false);
    private static competence[] listeCompetence;
    private String name;
    private int niveau;
    private String descr;
    private int num;
    private type type;
    @Getter@Setter
    private booster[] boost;
    private boolean lock;
    @Getter@Setter
    private effecter[] effect;
    public static ArrayList<competence> listecompe1 = new ArrayList<>();
    public static ArrayList<competence> listecompe2 = new ArrayList<>();
    public static ArrayList<competence> listecompe3 = new ArrayList<>();
    public static ArrayList<competence> listecompe4 = new ArrayList<>();
    public static ArrayList<competence> listecompe5 = new ArrayList<>();
    public static ArrayList<competence> listecompe6 = new ArrayList<>();


    competence(String name, int num, String descr, type type, booster[] boost, effecter[] effect, int niveau, boolean lock) {
        this.name = name;
        this.num = num;
        this.descr = descr;
        this.type = type;
        this.boost = boost;
        this.effect = effect;
        this.niveau=niveau;
        this.lock=lock;
    }
    public static void tricompe(){

    }

    public static ArrayList triecompe(ArrayList<competence> comp){
        ArrayList<competence> listcomp=new ArrayList<>();
        for(int i=0;i<comp.size();i++){
            competence Compe = comp.get(i);
            int lockComp=Compe.getNiveau();
            if(lockComp==1){
                listcomp.add(Compe);
            } else if (lockComp>1) {
                System.out.println("no");
            }
        }
        return listcomp;
    }
    public static void rangerCompetences() {
        // Parcourir toutes les compétences créées et les ranger dans les bonnes listes
        for (competence comp : competence.values()) {
            int numHeros = comp.getNum(); // Numéro du héros associé à la compétence

            // Ranger la compétence dans la liste appropriée en fonction du numéro de héros
            switch (numHeros) {
                case 1:
                    listecompe1.add(comp);
                    break;
                case 2:
                    listecompe2.add(comp);
                    break;
                case 3:
                    listecompe3.add(comp);
                    break;
                case 4:
                    listecompe4.add(comp);
                    break;
                case 5:
                    listecompe5.add(comp);
                    break;
                case 6:
                    listecompe6.add(comp);
                    break;
                default:
                    // Cas où le numéro de héros n'est pas valide, ne rien faire ou gérer l'erreur selon le besoin.
                    break;
            }
        }

    }

}
