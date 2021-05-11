package in.cashify.exampleInterface;

public class B  extends A implements  C {
    B(int attendance) {
        super(attendance);
    }

    @Override
     public void name() {

        System.out.println("School is best for Education");

    }

    public static void main(String[] args) {
        B B1 = new B(10);

    }
}
