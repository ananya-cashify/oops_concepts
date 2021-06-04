package in.cashify.ExceptionClass;

public class ExceptionClass {

    static void throwException1() throws RuntimeException{
        System.out.println("Exception1 is thrown");
        throwException2();

    }

    static void throwException2(){
        System.out.println("Exception2 is thrown");
        throw new RuntimeException();

    }

    static int divide(int a, int b){
        return a/b;
    }


    public static void main(String[] args){
//throwException1();
        try{
            int c = divide(5,0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally block executed");
        }

    }
}
