import java.util.Scanner;

public class TpValidationAcquis2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = kb.nextInt();

        //log 10, puis somme modulox10^i

        int inverse=0;

        //et si négatif ? string plus rapide ?

        int length =  (int) Math.floor(Math.log10(Math.abs(nombre)));
        System.out.println(length);

        int k=0;
        while(Math.abs(nombre)>0) {
            inverse+= ( nombre%10 )*Math.pow(10,length-k);
            k+=1;
            nombre = (int) nombre /10;
        }

        System.out.printf("\nRésultats : %d",inverse);




    }
}
