package in.cashify.inheritance.exampleInheritance;

import in.cashify.inheritance.hierarchial.Student_C;

public class Student_A extends Teacher implements Student_A1, Student_A2{
    Student_A(String Subject) {
        super(Subject);
    }

    @Override
    public void marks() {
        System.out.println ("Marks1");

    }

    @Override
    public void marks1() {
        System.out.println ("Marks2");

    }
    public static void main (String [] args){
        Student_A A11 = new Student_A ("English");
        A11.marks();
        A11.marks1();
    }
}
