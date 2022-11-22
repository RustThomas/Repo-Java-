import java.util.ArrayList;

public class Guerrier extends Personnage implements EntiteVolante {
    //    private Arme arme;
    private ArrayList<Arme> armes;

    public Guerrier(String name, int dureeDeVie) {
        super(name,dureeDeVie);
    }

    public Guerrier(String name,int dureeDevie,ArrayList<Arme> armes){
        this(name,dureeDevie);
        this.armes=armes;
    }

    public ArrayList<Arme> getArmes() {
        return armes;
    }

    public void setArme(ArrayList<Arme> arme) {
        this.armes = arme;
    }

    public void addArme(Arme arme){
        this.armes.add(arme);
    }


    @Override
    public void presentation(){
        System.out.printf("Mon nom est %s, et je suis un un guerrier.\n",this.getName());
    }

    public void voler(){
        System.out.println("I believe I can fly..");
    }
}