public class tpValidationAcquis9 {

    static boolean maMethode(String s) {
        char[] c = s.toCharArray();
        for(int i=0;i<c.length-1;i++) {
            if(c[i]==c[i+1]) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(maMethode("terrific"));
        System.out.println(maMethode("chats"));
        System.out.println(maMethode("chats !!"));
    }
}