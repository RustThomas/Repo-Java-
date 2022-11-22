import java.util.Scanner;

public class tpValidationAcquis4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = kb.nextLine();

        String[] mots = chaine.toLowerCase().split(" ");

        String chaineMajuscule="";
        for(String s:mots){
            char majuscule= Character.toUpperCase(s.charAt(0));
            String premiereLettreMaj = majuscule+s.substring(1);
            chaineMajuscule +=premiereLettreMaj+" ";
        }

        System.out.println(chaineMajuscule);



    }
}
