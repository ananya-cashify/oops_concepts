package in.cashify.polymorphism;

public class Vehicle {
    void run(){System.out.println("running");}
}

interface Honda1{
    void run ();
}

class Splendor extends Vehicle implements Honda1 {
    public void run() {
        System.out.println("running safely with 60km"); }

    public static void main(String args[]){
        Vehicle b = new Splendor();//upcasting
        b.run();
    }
}
