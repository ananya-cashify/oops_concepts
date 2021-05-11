package in.cashify.exampleInterface;

public abstract  class A {

    A(int attendance){
       System.out.println("A is available" +attendance) ;
    }

    abstract void name();
    public void marks(int marks){
        System.out.println("Total marks" +marks) ;

    }

}
