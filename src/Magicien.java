public class Magicien extends Personnage {

    private String baguetteMagique;

    public Magicien(String name, int dureeDeVie, String baguetteMagique ) {
        super(name, dureeDeVie);
        this.baguetteMagique=baguetteMagique;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    public void presentation(){
        System.out.printf("Mon nom est %s, et je suis un magicien.\n",this.getName());
    }
}