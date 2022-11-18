public class souris {

    final int ESPERANCE_VIE_DEFAUT = 36;
    private int poids;
    private String couleur;
    private int age;
    private int esperance;
    private boolean clonee;

    public souris(int poids, String couleur, int age, int esperance){
        this.poids=poids;
        this.couleur=couleur;
        this.age=age;
        this.esperance=esperance;
        System.out.print("Une nouvelle souris !\n");

        System.out.printf("Test esperance %d \n",this.esperance);

    }

    public souris(int poids, String couleur){
        this.poids=poids;
        this.couleur=couleur;
        this.age=0;
        this.esperance=ESPERANCE_VIE_DEFAUT;
        System.out.print("Une nouvelle souris !\n");

    }

    public souris(souris souris){
        System.out.println("Clonage d'une souris !\n");
        this.poids=souris.poids;
        this.couleur=souris.couleur;
        this.age=souris.age;
        this.esperance=  (int)(0.8* (double)souris.esperance);
        this.clonee = true;

        System.out.printf("Test esperance %d \n",this.esperance);
    }

    public String toString() {

        String output="";
        output+="Une souris "+this.couleur;

        if (this.clonee) {
            output+=" ,clonée,";
        }

        output+=" de "+this.age+ " mois et pesant " +this.poids+" grammes\n";

        return output;
    }

    public void vieillir(){
        System.out.println("in vieillir");
        this.age+=1;
        if (this.age>this.esperance/2) this.couleur="verte";
    }

    public void evolue(){
        System.out.printf("in evolue age %d ;esperance %d\n",this.age,this.esperance);
        while (this.age<this.esperance){

            this.vieillir();
        }

    }

    public static void main(String[] args) {
        souris mike = new souris(50,"violette");
        souris rambo = new souris(1000,"rouge",0,1000);
        souris cloneRambo = new souris(rambo);
        System.out.println(mike);
        System.out.println(cloneRambo);

        cloneRambo.evolue();
        System.out.println(cloneRambo);

    }
}


