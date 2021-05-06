package in.cashify.inheritance.single;

public class design extends color {

    public design(String colorname) {
        super(colorname);
    }

    @Override
    public void black() {
        System.out.println("I am Black");

    }

    @Override
    public void pink() {
                System.out.println("I am Pink");


    }
    @Override
    public void red(){
                System.out.println("I am Red");


    }
    public static void main(String[] args){
        design d = new design ("white");
        d.black();
        d.pink();
        d.red();
    }
}
