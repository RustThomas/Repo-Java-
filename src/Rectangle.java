public class Rectangle {
    private double longueur;
    private double largeur;

    // getters : accesseurs
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }
    // setters : manipulateurs
    public void setLongueur(double nouvelleValeur){
        if(nouvelleValeur>0){
            longueur=nouvelleValeur;
        }else {
            System.out.println("La longueur doit toujours être un nombre positif");
        }
    }

    public void setLargeur(double nouvelleValeur){
        if(nouvelleValeur>0){
            largeur=nouvelleValeur;
        }else{
            System.out.println("La largeur doit toujours être un nombre positif");
        }
    }
    public double calculSurface(){
        return longueur*largeur;
    }

    public double calculPerimetre(){
        return 2*(longueur+largeur);
    }

    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
//       rect.longueur=250.5;
//       rect.largeur=120.7;
        rect.setLongueur(250);
        rect.setLargeur(120);
        System.out.printf("Longueur : %.1f\n",rect.getLongueur());
        System.out.printf("Largeur : %.1f\n",rect.getLargeur());
        System.out.printf("Surface : %.1f\n",rect.calculSurface());
        System.out.printf("Perimetre : %.1f\n",rect.calculPerimetre());
    }
}