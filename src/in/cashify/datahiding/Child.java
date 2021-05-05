package in.cashify.datahiding;

public class Child extends Parent{
    int i =20;

    public static void main (String [] args){

        Child C = new Child ();
        Parent P = new Child ();


        System.out.println(C.i);
        System.out.println(P.i);



    }
}
