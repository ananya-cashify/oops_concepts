package in.cashify.ExceptionClass;

public class StaticBlock {

        //This will execute before constructor
        {
            System.out.println("This is non static Block");
        }

        //This will execute only once and will execute first
        static {
            System.out.println("This is static block");
        }

        public StaticBlock() {
            System.out.println("I am "+this.getClass().getSimpleName() + " Constructor");
        }

        public static void main(String[] args) {
            StaticBlock blockClass = new StaticBlock();
            StaticBlock blockClass1 = new StaticBlock();
        }
    }


