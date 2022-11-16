import java.util.Scanner;

public class tp2_3Arrays {
    public static void main(String[] args) {

        // comparer leur taille et boucler comme ça ; sinon ok, linéaire
        Scanner kb = new Scanner(System.in);

        int[][] tableaux = new int[3][];

        for(int i=0 ; i<3 ;i++){
            System.out.printf("Longeur du tableau %d : ",i);
            int longueurCourante = kb.nextInt();

            if(longueurCourante>0) {
                tableaux[i] = new int[longueurCourante];
                int k = 0;
                while(k<longueurCourante) {
                    System.out.printf("%d-ième terme : ",k+1);
                    tableaux[i][k]= kb.nextInt();
                    k++;
                }
            }
        }


        int sum = 0 ;

        for(int i=0; i<tableaux.length ;i++) {
            System.out.printf("T%d : [ ",i);
            for(int j=0; j<tableaux[i].length-1; j++) {
                System.out.printf("%d,",tableaux[i][j]);
                if (tableaux[i][j]%3==0) {
                    sum+=tableaux[i][j];
                }
            }
            if(tableaux[i][tableaux[i].length-1]%3==0) sum+= tableaux[i][tableaux[i].length-1];
            System.out.printf("%d ]\n",tableaux[i][tableaux[i].length-1]);
        }

        System.out.printf("S = %d",sum);
    }
}
