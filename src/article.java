public class article {
    private int numeroReference;
    private String nom;
    private double prix;
    private int quantite;

    public article(int numeroReference,String nom, double prix, int quantite){
        this.numeroReference=numeroReference;
        this.nom=nom;
        this.prix=prix;
        this.quantite=quantite;
    }

    public int getNumeroReference() {
        return numeroReference;
    }

    public void setNumeroReference(int numeroReference) {
        this.numeroReference = numeroReference;
    }

    @Override
    public String toString() {
        return "article{" +
                "numeroReference=" + numeroReference +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }

    public String getNom() {
        return this.nom;
    }

    public double getPrix(){
        return this.prix;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite){
        this.quantite=quantite;
    }
}
