import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TpValidationAcquis5doublonsimple {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = kb.nextLine();

        String[] mots = phrase.split(" ");

        //System.out.println(Arrays.toString(mots));

        ArrayList<String> Mots = new ArrayList<String>(Arrays.asList(mots));

        //System.out.println(Mots);

        HashMap<String,Integer> doublons= new HashMap<String,Integer>();

        for(int i=0; i<Mots.size()-1;i++) {
            if(Mots.get(i).equals(Mots.get(i+1))) {
                if(doublons.containsKey(Mots.get(i)) ) doublons.put(Mots.get(i), doublons.get(Mots.get(i)) +1 );
                else doublons.put(Mots.get(i),1);
                Mots.remove(i);



                i--;
            }
        }

        System.out.println(Mots);

        String listString = String.join(" ", Mots);
        System.out.println(listString);
        System.out.println(doublons);
    }

}
