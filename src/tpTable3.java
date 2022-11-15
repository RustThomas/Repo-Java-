import java.util.Scanner;

public class tpTable3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Bonjour, veuillez renseigner votre adresse mail : ");
        String email = ip.next();

        System.out.print("Parfait, choisissez votre mot de passe : ");
        String mdp = ip.next();

        System.out.print("Des choses se passent...\n\n");

        String emailIp;
        String mdpIp;

        do {

            System.out.print("Bonjour, veuillez renseigner votre adresse mail : ");
            emailIp = ip.next();

            System.out.print("Parfait, entrez votre mot de passe : ");
            mdpIp = ip.next();

            if(emailIp.equals(email)==false || mdpIp.equals(mdp)==false){
                System.out.print("Identifiants incorrects, réessayez \n");
                continue;
            }

            else {
                System.out.println("Bienvenue dans votre espace client");
                break;
            }

        }while(true);
    }
}
