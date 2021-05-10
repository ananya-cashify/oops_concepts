package in.cashify.polymorphism;

public class School {
    static int grace_mark = 50;

    School (int Rank){
        System.out.println ("My Rank is"+Rank);
    }

    public void student (int totalSubject){

        System.out.println ("Total Subjects present in school are "+totalSubject);

    }
    public void student (int totalSubject , int marks){
        System.out.println ("Total Subjects present in school are "+totalSubject);
        System.out.println ("Total Subjects marks  are "+marks);
        int Total_Marks = marks  + grace_mark;

    }
    public void student (int totalSubject , int marks , String name){
        System.out.println ("Total Subjects present in school are "+totalSubject);
        System.out.println ("Total Subjects marks  are "+marks);
        System.out.println ("His name is  " +name);


    }
}
