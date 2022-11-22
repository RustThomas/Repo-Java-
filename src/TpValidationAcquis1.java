import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class TpValidationAcquis1 {

    //déclaration par utilisateur?
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Entrez un tableau [a,b...,c] : ");
        String tableau = kb.next();

        String[] string = tableau.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] entiers = new int[string.length];

        for(int i=0; i<string.length;i++){
            entiers[i]= Integer.valueOf(string[i]);
        }

        //int[] entiers = new int[]{1,2,121321,-13221};
        int maxIndex=0;
        int minIndex=0;
        for(int i=1;i<entiers.length;i++) {
            if(entiers[i]>entiers[maxIndex]) maxIndex=i;
            //else if avant, Christian conseille if if
            if(entiers[i]<entiers[minIndex]) minIndex=i;

        }
        System.out.print("[");
        for(int i=0;i<entiers.length;i++) {
            System.out.print(" "+entiers[i]);
            if (i==maxIndex) System.out.print("(PG)");
            else if (i==minIndex) System.out.print("(PP)");

            //sortir de la boucle si on ne veut pas faire n tests
            if(i<entiers.length-1) System.out.print(" ,");


        }
        System.out.print(" ]\n");
        System.out.printf("Plus grand : %d à la position %d\nPlus petit : %d à la position %d\n", entiers[maxIndex],maxIndex, entiers[minIndex],minIndex);
    }

}
