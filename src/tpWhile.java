import java.util.Scanner;


public class tpWhile {
        public static void main(String[] args) {

            Scanner keyboardInput=new Scanner(System.in);
            System.out.print("Veuillez définir un code PIN : ");
            int codePin=keyboardInput.nextInt();

            System.out.println("Après quelques minutes, l'appareil s'est verrouillé...");
            int codePinATester;
            int tentative=0;
            do{//a tester = 1111, codePin=1111
                System.out.print("Veuillez entrer le code de déverrouillage : ");
                codePinATester=keyboardInput.nextInt();// 1111
                if(codePinATester==codePin){//1111 == 1111 => true
                    System.out.println("Félicitations, appareil déverrouillé....");
                }else{
                    tentative+=1;
                    System.out.println("Code PIN incorrect.Veuillez recommencer.\n");
                }
                if (tentative>1 && tentative <5) {
                    if (tentative==4){
                        System.out.printf("Il vous reste %d tentative.\n", 5 - tentative);
                    }

                    else {
                        System.out.printf("Il vous reste %d tentatives.\n", 5 - tentative);
                    }
                }

                if (tentative==5){
                    System.out.print("Vous avez saisi 5 fois des mauvais codes. Votre appareil est bloqué.\n");
                    break;
                }
            } while (codePinATester!=codePin);

        }

}

// branch test 123