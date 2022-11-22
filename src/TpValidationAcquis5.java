import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TpValidationAcquis5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = kb.nextLine();

        String[] mots = phrase.split(" ");

        System.out.println(Arrays.toString(mots));

        ArrayList<String> ArrayListMots = new ArrayList<String>(Arrays.asList(mots));

        System.out.println(ArrayListMots);

        HashMap<String,Integer> count = new HashMap<String,Integer>();
        HashMap<String,Integer> doublons = new HashMap<String,Integer>();

        //live remove
        for(int i=0; i<ArrayListMots.size() ;i++) {
            if(count.containsKey(ArrayListMots.get(i)))  {
               // System.out.println("in");
                ArrayListMots.remove(i);
                doublons.put(ArrayListMots.get(i), doublons.get(ArrayListMots.get(i))+1);
            }
            else {
                count.put(ArrayListMots.get(i),i);
            }
        }

        String sansDoublon="";

        for(String s:ArrayListMots) {
            sansDoublon+=s+" ";
        }

        //String listeDoublons="";

        System.out.printf("Chaîne initiale : %s\nChaîne sans doublons : %s\nDoublons : ",phrase,sansDoublon);
        for (String s: doublons.keySet()) {

            int value = doublons.get(s);
            System.out.println(s + " : " + value);
        }
    }

}
