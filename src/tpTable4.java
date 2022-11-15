import java.util.Scanner;

public class tpTable4 {
            public static void main(String[] args) {
                Scanner ip = new Scanner(System.in);

                System.out.print("Bonjour, veuillez renseigner votre adresse mail : ");
                String email = ip.next();

                System.out.print("Parfait, choisissez votre mot de passe : ");
                String mdp = ip.next();

                System.out.print("Des choses se passent...\n\n");

                String emailIp;
                String mdpIp;

                int tentative=0;

                do {

                    System.out.print("Bonjour, veuillez renseigner votre adresse mail : ");
                    emailIp = ip.next();

                    System.out.print("Parfait, entrez votre mot de passe : ");
                    mdpIp = ip.next();

                    if(tentative-4==0){
                        System.out.print("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloqué");
                        break;
                    }

                    if(emailIp.equals(email)==false || mdpIp.equals(mdp)==false){
                        System.out.printf("Identifiants incorrects, réessayez.\nIl vous reste %d tentative.s \n\n",4-tentative);
                        tentative++;
                        continue;
                    }

                    else {
                        System.out.println("Bienvenue dans votre espace client");
                        break;
                    }

                }while(true);
            }
        }


