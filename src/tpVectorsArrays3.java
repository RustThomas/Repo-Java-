import java.util.Scanner;

public class tpVectorsArrays3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Saisissez un texte : ");

        String texte = kb.next().replaceAll("\\s+","");
        boolean palindrome = true;

//        for(int i=texte.length()-1;i>=0;i--) {
//            if(texte.charAt(i)!=)
    //}
        for(int i=0; i<=texte.length()/2;i++) {
            //System.out.printf("%c %c \n",texte.charAt(i),texte.charAt(texte.length()-1-i));
            if(texte.charAt(i) != texte.charAt(texte.length()-1-i)) {
                palindrome = false ;
                break;
            }
        }

        //on peut mettre dans la boucle ou non, un test en moins

        if (palindrome) {
            System.out.printf("Résultat : %s est un palindrome",texte);
        }
        else {
            System.out.printf("Résultat : %s n'est pas un palindrome",texte);
        }
    }
}
