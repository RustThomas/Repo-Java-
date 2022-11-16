public class tp2_1Arrays {
    public static void main(String[] args) {
        int[] tableau = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7};

        //deuxieme tableau référence

        //parcours 1 : chercher max
        //parcours 2 : compter
        //parcours 3 : prendre max

        int range =  tableau[0];

        //test si taille tableau plus grand que 1 etc
        //if lenght = 1... ou vide...

        for (int i=1; i< tableau.length;i++) {
            if (tableau[i]>range) {
                range=  tableau[i];
            }
        }

        //faire plus simple ?
        // cas ou negatif

        int[] freq = new int[range+1];
 //       for (int i=0; i<range ; i++) {
        //freq[i]=0;
 //       }

        for (int i=0 ; i < tableau.length ; i++) {
            freq[tableau[i]]+=1;
        }

        int mostFreq = tableau[0];

        for (int i=0 ; i<tableau.length ;i++) {
            if ( freq[tableau[i]] > mostFreq ) {
                mostFreq = tableau[i] ;
            }
        }

        System.out.printf("Entier %d , Fréquence %d", mostFreq, freq[mostFreq]);
    }
}
