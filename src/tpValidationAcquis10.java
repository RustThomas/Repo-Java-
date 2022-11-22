import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class tpValidationAcquis10 {

    static ArrayList<int[]> maMethode(int[] tableau, int S) {

        ArrayList<int[]> paires = new ArrayList<int[]>();

        HashMap<Integer,Integer> diff = new HashMap<Integer,Integer>();
        for(int i=0; i<tableau.length;i++) {
            int delta = S-tableau[i];
            //System.out.println(delta);


            if(diff.containsKey(tableau[i])) {
                int[] paire = new int[]{tableau[i],diff.get(tableau[i])};
                paires.add(paire);
                System.out.println("("+paire[0]+","+paire[1]+")");
            }
            else diff.put(delta, tableau[i]);
        }
        //System.out.println(diff);
        return paires;
    }

    public static void main(String[] args) {

        int[] nombres = new int[]{2,7,11,15};
        maMethode(nombres, 9);
    }

}
