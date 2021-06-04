package in.cashify.toDoExample;

public class Messages {
    public static void menu() {
        System.out.println("/n");
        System.out.println("<<<<<<<<<<<<<<<<<<<< My ToDo List menu >>>>>>>>>>>>>>>>>>>>");
        System.out.println("Please Pick an option from the below menu");
        System.out.println("(1) Press 1 to create new Task");
        System.out.println("(2) Press 2 to list all In Progress Task");
        System.out.println("(3) Press 3 to list all Completed Task");
        System.out.println("(4) Press 4 to Print all TODO tasks ");
        System.out.println("(5) Press 5 to print all task Details ");
        System.out.println("(6) Press 6 to update task Details on the basis of taskID ");
    }
    public static void showMessage(String message) {
        System.out.println(">>> " + message);
    }
    public static void unknownMessage() {

        System.out.println(">>> Wrong Input: Please type a number from given choices ");

    }

}
