import java.util.Scanner;


public class tpArray1 {
    public static void main(String[] args) {
//

        Scanner input = new Scanner(System.in);
        int length;

        do {
            System.out.print("Saisissez le nombre de notes supérieur à 0 : ");
            length = input.nextInt();
        } while (length <= 0);

        // 1. Permettre à l'utilisateur de définir le nombres des notes à stocker
//        - La valeur doit toujours être > 0

        double notes[] = new double[length];
        int k;

// 2. Permettre à l'utilisateur d'entrer les notes du tableau à partir du clavier
//        - Les valeurs ne doivent être qu'entre 0 et 20

        for (int i = 0; i < length; i++) {
            do {
                System.out.printf("Entrez la %d-ième note : ", i);
                k = input.nextInt();

            } while (k < 0 || k > 20);
            notes[i] = k;
        }
// 3. Calculer et afficher la moyenne
        double somme = 0;
        for (int i = 0; i < length; i++) {
            somme += notes[i];
        }

        double moyenne = somme / length;

        System.out.printf("La moyenne est %.2f/20 ", moyenne);
    }
}