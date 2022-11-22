import java.util.HashMap;
import java.util.Scanner;

public class program {

    Scanner kb = new Scanner(System.in);

    //hashmap
    public static void rechercher(int ref, HashMap Stock){
        System.out.println(Stock.get(ref));
    }

    public void ajouter(article Article,HashMap Stock ){
        if(!Stock.containsKey(Article.getNumeroReference())) {
            Stock.put(Article.getNumeroReference(), Article);
        }
    }
    public void enlever(int ref, HashMap Stock){
        //on pourrait vérifier que Key existe
        Stock.remove(ref);
    }

    public void modifier(int ref, HashMap<Integer,article> Stock){
        boolean continuer=true;
        do{
            System.out.print(" Que souhaitez vous modifier ? Tapez quantite ou prix");
            String choice = kb.next();
            if(choice=="prix") {
                System.out.print("Entrez le nouveau prix");
                double nouveauPrix = kb.nextDouble();
                Stock.get(ref).setPrix(nouveauPrix);

            }
            else if(choice=="quantite"){
                int nouvelleQuantité = kb.nextInt();
                Stock.get(ref).setQuantite(nouvelleQuantité);
            }

            System.out.println("Avez-vous terminé O/N ?");
            String reponse= kb.next();

            if(reponse=="O") continuer=false;

        }while(continuer=true);
    }

    public void rechercheParNom(String nom, HashMap<Integer,article> Stock) {
        for(int key : Stock.keySet()){
            if(Stock.get(key).getNom()==nom) System.out.println(Stock.get(key));

        }
    }

    public void rechercheParPrix(double a, double b, HashMap<Integer,article> Stock) {
        for(int key : Stock.keySet()){
            if(Stock.get(key).getPrix()>=a && Stock.get(key).getPrix()<=b ) {
                System.out.println(Stock.get(key));
            }

        }
    }

    public void afficherArticles(HashMap<Integer,article> Stock) {
        for(int key : Stock.keySet()) {
            System.out.println(Stock.get(key));
        }
    }



    public static void main(String[] args) {
        HashMap<Integer, article> stock = new HashMap<Integer, article>();
        Scanner kb2 = new Scanner(System.in);

        boolean leave = false;
        do{
            System.out.println("Options 1-8 ?");
            int choix = kb2.nextInt();

            switch(choix) {
                case(1):
                    System.out.println("Référence : ");
                    int reference=kb2.nextInt();
                    rechercher(reference,stock);
                    break;
                default:
                    System.out.println("Choix invalide");
            }


        }while(leave==false);

    }
}
