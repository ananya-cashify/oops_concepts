package in.cashify.inheritance.multiLevel;

public class child  extends parent{
    String car;
    child(String property) {
        super(property);
        this.car = car;


    }

    @Override
    public void father(String name) {

        System.out.println("My father's name is " +name );

    }

    @Override
    public void mother(String  name) {
        System.out.println("My father's name is " +name );

    }

    public static void main (String [] args){
        child m = new child ("Car");
        child f = new child ("Bike");
        m.mother("Archana");
        f.father("Dinesh");
    }

}
