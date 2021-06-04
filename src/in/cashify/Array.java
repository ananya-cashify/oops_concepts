package in.cashify;

public class Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
              //  System.out.print("o ");
                System.out.print(a[i]+ "o");

            } else {
               // System.out.print("e ");
                System.out.print(a[i]+ "e");


            }
        }
        //System.out.println(a[i-1]);

    }
}
