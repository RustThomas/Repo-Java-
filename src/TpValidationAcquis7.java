public class TpValidationAcquis7 {
    public static void main(String[] args) {

        char[] tableau = new char[]{'a','b','c','d','E'};

        char[] majMin = new char[tableau.length];

        for(int i=0 ; i<tableau.length; i++) {
            if(i%2==0) majMin[i]=Character.toUpperCase(tableau[i]);
            else majMin[i]=Character.toLowerCase(tableau[i]);
        }

        System.out.println(majMin);

    }
}
