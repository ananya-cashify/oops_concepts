package in.cashify.inheritance.hierarchial;

public class Student_B extends teacher{
    Student_B(String Subject) {
        super(Subject);
    }

    @Override
    public void Lecture1(Boolean Present) {

    }

    @Override
    public void Lecture2(Boolean Present) {

    }

    @Override
    public void Lecture3(Boolean Present) {
        System.out.println( "Is Student A present in Lecture 1"  +Present);


    }

    @Override
    public void Lecture4(Boolean Present) {
        System.out.println( "Is Student A present in Lecture 2"  +Present);

    }

    @Override
    public void Lecture5(Boolean Present) {

    }

    public static void main (String [] args){
        Student_B B1 =new Student_B("Maths");
        Student_B  B2 =new Student_B("English");
        B1.Lecture3(Boolean.TRUE);
        B1.Lecture4(Boolean.FALSE);


    }
}
