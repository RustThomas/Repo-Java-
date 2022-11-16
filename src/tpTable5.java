import java.util.Random;
import java.util.Scanner;

public class tpTable5 {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(99);
        n+=1;

        Scanner ip = new Scanner(System.in);

        do {
            System.out.print("Entrez un entier entre 1 et 100 : ");
            int guess = ip.nextInt();

            if (guess==n){
                System.out.println("Trop fort !!!");
                break;
            }

            else if (guess>n) {
                System.out.println("Plus petit ^^");

            }

            else {
                System.out.println("Plus grand ^^");

            }


        }while(true);
    }

}
