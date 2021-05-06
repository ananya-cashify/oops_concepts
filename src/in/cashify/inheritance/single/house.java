package in.cashify.inheritance.single;

public class house extends color {


    public house(String colorname) {
        super(colorname);
    }

    @Override
    public void black() {
        System.out.println("I am Black");
    }
    public static void main (String[] args){
        house h = new house ("white");
    }
}
