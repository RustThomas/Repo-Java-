

public class patient {

    private String name;
    private double taille;
    private double poids;

    private double imc;

    public patient(String name, double taille, double poids) {
        this.name = name;
        this.taille = taille;
        this.poids = poids;
        this.imc = poids/(Math.pow(taille,2));
    }

    //Getters
    public void donnees(){
        System.out.printf("Patient : %s \nTaille : %.2f m \nPoids : %.2f kg \nIMC : %.2f \n",this.name,this.taille,this.poids,this.imc);
    }

    public void getPoids() {
        System.out.println(this.poids+" kg");
    }

    public void getTaille() {
        System.out.println(this.taille+" m");
    }

    //Setters?

    public static void main(String[] args) {
        patient patient1 = new patient("Jackie Chan",1.75,70);
        patient1.donnees();
        patient1.getPoids();
        patient1.getTaille();
    }

}
