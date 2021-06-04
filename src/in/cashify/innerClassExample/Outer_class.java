package in.cashify.innerClassExample;

public class Outer_class

{

    abstract class AnonymousInner {
        public abstract void mymethod();
    }

    public class Outer_class1 {

        public void main(String args[]) {
            AnonymousInner inner = new AnonymousInner() {
                public void mymethod() {
                    System.out.println("This is an example of anonymous inner class");
                }
            };
            inner.mymethod();
        }
    }


}
