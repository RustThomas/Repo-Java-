

import java.util.ArrayList;

public class tpfunction1f2 {

    public static boolean isPrefix(String premier, String check) {

        //Et si on dépasse -> erreur out of bound. Gérer ou non.

        //ajouter lowerCase si on ne veut que vérifier les lettres et pas majuscules
        premier = premier.toLowerCase();
        check =check.toLowerCase();

        for (int i = 0; i < check.length(); i++) {
            if(premier.charAt(i)!=check.charAt(i)) return false;
        }
        return true;
    }

    public static void  countAndPos(double[][] tableau, int nombre){
        int count = 0;
        ArrayList< String > pos= new ArrayList< String > (0);

        for(int i=0;i<tableau.length;i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] == nombre) {
                    count++;
                    String coordinates = "("+Double.toString(i)+","+Double.toString(j)+")";
                    pos.add(coordinates.toString());
                }
            }
        }
        System.out.printf("%d apparaît %d fois aux positions :\n",nombre,count);
        //System.out.println(pos);
        for(String coord:pos){
            System.out.println(coord.toString());
        }


    }

    public static int[] posFinal(ArrayList<String> directions) {
        int x = 0;
        int y = 0;

        for (String s : directions) {
            switch (s) {
                case "haut":
                    y += 1;
                    break;

                case "bas":
                    y -= 1;
                    break;

                case "gauche":
                    x -= 1;
                    break;

                case "droite":
                    x += 1;
                    break;
                default  :
                    System.out.println("Nope");
            }
        }


        int[] posFinal = new int[]{x, y};
        return posFinal;
    }


    public static void main(String[] args) {

        System.out.println(isPrefix("banner", "bang"));
        System.out.println(isPrefix("hugging", "hug"));
        System.out.println(isPrefix("hugging", "Hug"));
        //System.out.println(isPrefix("hugging", "hugginger"));

        double[][] test = new double[3][];
        test[0]= new double[]{1,4,2,1};
        test[1]= new double[]{6,3,8,9};
        test[2]= new double[]{1,5,1,0};

        countAndPos( test,1);

        ArrayList<String> directions = new ArrayList<String>();
        directions.add("haut");
        directions.add("haut");
        directions.add("bas");
        directions.add("gauche");
        directions.add("gauche");
        directions.add("droite");
        directions.add("haut");

        int[] posFinal;

        posFinal = posFinal(directions);
        System.out.printf("\nPosition finale : (%d,%d)",posFinal[0], posFinal[1]);


    }
}
