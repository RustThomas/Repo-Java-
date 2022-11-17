import java.util.Scanner;
import java.util.ArrayList;

public class tpVectorArrays4 {
    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<String>();

        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Saisissez un langage (q pour terminer, autre touche+Entrée sinon) : ");
            String language = kb.next();
            liste.add(language);
            if(language.equals("q")) break;
             //on suppose pas besoin que nom soit unique; sinon check si dedans,
             //peut etre hashmap?

        }while(!kb.next().equals("q"));

        System.out.println(liste);

        ArrayList<String> toDeleteListe = new ArrayList<String>();

        do {
            System.out.print("Saisissez un langage à supprimer (q pour terminer, autre touche+Entrée sinon) : ");
            String language = kb.next();
            if(language.equals("q")) break;
            //optionnel
            if(!liste.contains(language)) System.out.printf("%s n'est pas dans la liste ! ", language);
            else toDeleteListe.add(language);
            //on suppose pas besoin que nom soit unique; sinon check si dedans,
            //peut etre hashmap?

        }while(!kb.next().equals("q"));

        for(String s:toDeleteListe) {
            liste.remove(s);
        }

        System.out.println(liste);

    }
}
