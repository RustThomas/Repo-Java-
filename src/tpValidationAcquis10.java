import java.util.ArrayList;
import java.util.HashMap;

public class tpValidationAcquis10 {

    final ArrayList<int[]> maMethode(int[] tableau, int S) {

        ArrayList<int[]> paires = new ArrayList<int[]>();

        HashMap<Integer,Integer> diff = new HashMap<Integer,Integer>();
        for(int i=0; i<tableau.length;i++) {
            int delta =S-tableau[i];


            if(diff.containsKey(delta)) {
                int[] paire = new int[]{tableau[i],diff.get(delta)};
                paires.add(paire);
            }
            else diff.put(delta, tableau[i]);
        }

        return paires;
    }

}
