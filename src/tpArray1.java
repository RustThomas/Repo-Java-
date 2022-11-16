import java.util.Scanner;


public class tpArray1 {
    public static void main(String[] args) {
//
        // 1. Permettre à l'utilisateur de définir le nombres des notes à stocker
//        - La valeur doit toujours être > 0

        Scanner input = new Scanner(System.in);
        int length;

        do {
            System.out.print("Saisissez le nombre de notes supérieur à 0 : ");
            length = input.nextInt();
        } while (length <= 0);



        double notes[] = new double[length];


// 2. Permettre à l'utilisateur d'entrer les notes du tableau à partir du clavier
//        - Les valeurs ne doivent être qu'entre 0 et 20

        for (int i = 0; i < length; i++) {
            int note;
            do {
                System.out.printf("Entrez la %d-ième note (entre 0 et 20) : ", i+1);
                note = input.nextInt();

            } while (note < 0 || note > 20);
            notes[i] = note;
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