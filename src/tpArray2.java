public class tpArray2 {
    public static void main(String[] args) {
        double[][] matrice = { {1,2,3}, {3,4,5}, {6,7,8} };

        for(int i=0; i<matrice.length ;i++) {
            for (int j=0; j<matrice[i].length; j++) {
                System.out.print(matrice[i][j] +" ");
            }
            System.out.print("\n");
        }

        double d1=0;

        for(int i=0;i<matrice.length;i++ ) {
            for (int j=0; j<matrice[i].length; j++) {
                if(i==j) {
                    d1 += matrice[i][j];
                    //System.out.println(matrice[i][j]);
                }
            }
        }

        double d2=0;

        for(int i=0;i<matrice.length;i++ ) {
            for (int j=0; j<matrice[i].length; j++) {
                if(i==j) {
                    //System.out.println(matrice[i][matrice[i].length-1-j]);
                    d2 += matrice[i][ matrice[i].length -1 -j];

                }
            }
        }

        // diago tableau ou scalaire ?

        double sum=d1+d2;
        double diff=d1-d2;

        System.out.printf("\nSomme = %f \nDifférence = %f",sum,diff);
    }

}
