import java.util.Scanner;

public class tpTable2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Entrer un nombre entier : ");
        int nombre = ip.nextInt();

        int k=nombre;
        int factorielle=1;
        System.out.printf("Factorielle de %d : ", nombre);
        while(k>1) {
            System.out.printf("%dx",k);
            factorielle*=k;
            k--;
        }
        System.out.printf("1 = %d",factorielle);


    }
}
