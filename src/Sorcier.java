public class Sorcier extends Magicien implements EntiteVolante {

    private String batonMagique;

    public Sorcier(String name, int dureeDeVie, String baguetteMagique, String batonMagique) {
        super(name, dureeDeVie, baguetteMagique);
        this.batonMagique = batonMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    public void presentation(){
        System.out.printf("Mon nom est %s, et je suis un sorcier.\n",this.getName());
    }

    public void voler(){
        System.out.println("Je peux aussi voler à l'aide de mon baton");
    }
}