package in.cashify.toDoExample;

import in.cashify.toDoExample.Messages;
import in.cashify.toDoExample.Todo;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Todo todoList = new Todo();
        Scanner input = new Scanner(System.in);


        String option = "1";

        try {


            in.cashify.toDoExample.Messages.showMessage("Welcome to ToDoList");

            while (!option.equals("7")) {
                Messages.menu();
                //in.cashify.toDoExample.Messages.menu(List.notCompletedCount(), List.completedCount());
                option = input.nextLine();

                switch (option) {
                    case "1":
                        todoList.createNewTask();
                        break;
                    case "2":
                        todoList.getAllProgressTasks();;
                        break;
                    case "3":
                        todoList.getAllCompletedTasks();;
                        break;
                    case "4":
                        todoList.getAllTODOTasks();
                        break;
                    case "5":
                        todoList.listAllTasks();
                        break;
                    case "6":
                        todoList.updatetaskStatus();
                        break;

                    default:
                        Messages.unknownMessage();
                }

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        finally{
            System.out.println("To Do list is completed");

        }
    }
}
