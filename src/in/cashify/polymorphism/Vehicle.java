package in.cashify.polymorphism;

public class Vehicle {
    void run(){System.out.println("running");}
}
class Splendor extends Vehicle{
    void run(){System.out.println("running safely with 60km");}

    public static void main(String args[]){
        Vehicle b = new Splendor();//upcasting
        b.run();
    }
}

