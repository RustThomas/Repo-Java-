import java.util.Scanner;
import java.util.Arrays;


public class tp2_2Arrays {
    public static void main(String[] args) {

        int len = 5 ;
        int[] tableau = new int[len];

        Scanner keyboard = new Scanner(System.in);

        for (int i=0 ; i<len ; i++){
            System.out.print("Entrez un entier : ");
            tableau[i]=keyboard.nextInt();
        }

        System.out.print(Arrays.toString(tableau));

        System.out.print("Entrez un entier à chercher : ");
        int cible = keyboard.nextInt();

        int count = 0 ;
        int frequenceCible = 0;

        for(int i:tableau) {
            if (i==cible) frequenceCible+=1;
        }

        if (frequenceCible==0) System.out.printf("%d n'est pas dans le tableau.", cible);

        else {
            System.out.printf("%d existe et se trouve %d fois dans le tableau", cible, frequenceCible);
        }

    }
}
