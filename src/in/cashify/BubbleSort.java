package in.cashify;

public class BubbleSort {

    static void bubble (int a[]){
        int n = a.length-1;
        int temp =0;

        for (int i = 0;i< n ; i++)
        {
            for (int j = 1;j< n-i;j++){
                if (a[j-1] > a[j]) {

                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]= temp;

                }
            }

        }


    }
    public static void main (String[] args){
        int a[] ={36 , 25 , 17 , 49};

        System.out.println("Before bubble sort");
        for (int i = 0; i <a.length ; i++){
            System.out.println(a[i]+ " ");
        }
        System.out.println(" ");

        bubble(a);
        System.out.println("After bubble sort");
        for (int i = 0; i <a.length ; i++){
            System.out.println(a[i]+ " ");
        }

    }
}
