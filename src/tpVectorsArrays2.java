import java.util.Scanner;

public class tpVectorsArrays2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Saisissez un texte : ");

        String texte = kb.next();

        System.out.printf("\nVotre chaîne : %s \n",texte);
        System.out.print("Résultat : ");

        String reverse= "";


        for(int i=texte.length()-1;i>=0;i--) {
            char c= texte.charAt(i);
            reverse+= c;

            System.out.print(c);
        }

        System.out.printf("\n%s",reverse);
    }
}
