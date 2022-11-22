import java.util.HashMap;
import java.util.Scanner;

public class TpValidationAcquis3 {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //enlever espaces ?

        System.out.print("Premier mot : ");
        String premierMot = kb.nextLine().toLowerCase().replaceAll("\\s", "");
        //premierMot = premierMot.replaceAll("\\s", "");
        char[] lettres1 = premierMot.toCharArray();

        System.out.print("\nDeuxième mot : ");
        String secondMot = kb.nextLine().toLowerCase().replaceAll("\\s", "");
        //secondMot = secondMot.replaceAll("\\s", "");
        char[] lettres2 = secondMot.toCharArray();

        HashMap<Character,Integer> count1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> count2 = new HashMap<Character,Integer>();

        for(char c:lettres1){
            if(count1.containsKey(c)) count1.put(c, count1.get(c)+1);
            else count1.put(c,1);
            //System.out.println("in");
        }

        for(char c:lettres2){
            if(count2.containsKey(c)) count2.put(c, count2.get(c)+1);
            else count2.put(c,1);
        }

        boolean isAnagram = true;

        for(char c:count1.keySet()) {
            System.out.printf("c : %c , c1(c) = %d , c2(c) = %d \n",c,count1.get(c), count2.get(c));
            if(count2.get(c)!=count1.get(c))  {

                isAnagram = false;
                break;
            }
        }

        System.out.printf("Anagram : %b",isAnagram);
    }
}
