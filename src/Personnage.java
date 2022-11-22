
public abstract class Personnage {
    private String name;
    private int dureeDeVie;

    public Personnage(String name, int dureeDeVie) {
        this.name = name;
        this.dureeDeVie = dureeDeVie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public abstract void presentation();
}