package in.cashify.inheritance.multiLevel;

public  abstract class parent extends grandparent {
    parent(String property) {
        super(property);
    }



    public abstract void father(String name);

    public abstract void mother(String  name);
}
