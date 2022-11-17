import java.util.Scanner;
import java.util.HashMap;

public class tpVectorsArrays1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Saisissez un texte : ");

        String texte = kb.next();


        HashMap<Character, Integer> occurences = new HashMap<>();

        //whitespaces?

        //compter les espaces; gérer les espaces ?
        //minuscules ?

        for (int i = 0; i < texte.length(); i++) {
            if (occurences.containsKey(texte.charAt(i))) {


                occurences.replace(texte.charAt(i), occurences.get(texte.charAt(i)) + 1);
            } else {
                occurences.put(texte.charAt(i), 1);

            }

            // aa
            // 1er tour de la boucle a -> 1
            // deuxieme a -> 2

        }

        for (char c : occurences.keySet()) {
            System.out.printf("%c a une fréquence de %d\n", c, occurences.get(c));
        }


    }
}
