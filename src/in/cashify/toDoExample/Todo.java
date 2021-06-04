package in.cashify.toDoExample;

import in.cashify.toDoExample.Messages;
import in.cashify.toDoExample.Task;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Todo  {
    ArrayList<Task> List = new ArrayList<Task>();
    Scanner scan = new Scanner(System.in);
    public String Line ="--------------------------------------------------------" +
            "------------------------------------------------------------------------";


    public Todo() {
        super();
        this.List = List;
    }

    public void addTask(int taskID, String title, String description, String status, LocalDate dueDate) {
        this.List.add(new in.cashify.toDoExample.Task(taskID, title, status, description, dueDate));
    }

    public void createNewTask() {
        try {
            System.out.println(" Please Enter below Details to create new Task ");
            System.out.print(">>> Task ID  : ");
            int ID = scan.nextInt();
            scan.nextLine();
            System.out.print(">>> Task Title  : ");
            String title = scan.nextLine();
            System.out.print(">>> Description: ");
            String description = scan.nextLine();
            System.out.print(">>> Status : ");
            String status = scan.nextLine();

            this.List.add(new in.cashify.toDoExample.Task(ID, title, description, status, LocalDate.now()));
            Messages.showMessage("Task is added successfully");

        } catch (Exception e) {
            Messages.showMessage(e.getMessage());

        }

    }

    protected void updatetaskStatus() {

        try {
            System.out.println(" Please Enter Task Id you want to update");
            int ID = scan.nextInt();
            System.out.println(" Please Enter Task Status you want to update");
            String Status = scan.nextLine();

            for (Task tasks : List) {
                if (tasks.getId() == ID) {

                    tasks.setProgress(Status);

                }

            }

        } catch (Exception e) {
            Messages.showMessage(e.getMessage());

        }
    }

        public void getAllProgressTasks(){
        try {
            System.out.println(Line);
            System.out.println(
                    "Total Tasks = " + List.size() +
                            "\t\t (Completed = " + completedCount() + "\t\t" +
                            " In Progress = " + notCompletedCount() +
                            " )");
            System.out.println(Line);
            String displayFormat = "%-20s %-20s %-20s %-20s";

            if (!List.isEmpty()) {
                System.out.println(String.format(displayFormat, "TaskID", "TITLE", "DESCRIPTION", "STATUS", "DUE DATE"));
                System.out.println(String.format(displayFormat, "=======", "=======", "=====", "========", "========="));
                for (in.cashify.toDoExample.Task tasks : List) {
                    if (tasks.isInProgress()) {
                        System.out.println(String.format(displayFormat,
                                tasks.getId(),
                                tasks.getTitle(),
                                tasks.getDescription(),
                                tasks.getProgress(),
                                tasks.getDueDate()
                        ));
                    }

                }
            }
        }
            catch (Exception e){
                Messages.showMessage(e.getMessage());

            }
        }
        public void getAllCompletedTasks() {
            try {
                System.out.println(Line);


                System.out.println(
                        "Total Tasks = " + List.size() +
                                "\t\t (Completed = " + completedCount() + "\t\t" +
                                " In Progress = " + notCompletedCount() +
                                " )");
                System.out.println(Line);


                String displayFormat = "%-20s %-20s %-20s %-20s";

                if (!List.isEmpty()) {
                    System.out.println(String.format(displayFormat, "TaskID", "TITLE", "DESCRIPTION", "STATUS", "DUE DATE"));
                    System.out.println(String.format(displayFormat, "=======", "=======", "=====", "========", "========="));
                    for (in.cashify.toDoExample.Task tasks : List) {
                        if (tasks.isCompleted()) {
                            System.out.println(String.format(displayFormat,
                                    tasks.getId(),
                                    tasks.getTitle(),
                                    tasks.getDescription(),
                                    tasks.getProgress(),
                                    tasks.getDueDate()
                            ));
                        }
                    }
                }
            } catch (Exception e) {
                Messages.showMessage(e.getMessage());

            }
        }

        public void getAllTODOTasks () {
        try {
            System.out.println(Line);
            System.out.println(
                    "Total Tasks = " + List.size() +
                            "\t\t (Completed = " + completedCount() + "\t\t" +
                            " In Progress = " + notCompletedCount() +
                            " )");
            System.out.println(Line);
            String displayFormat = "%-20s %-20s %-20s %-20s";

            if (!List.isEmpty()) {
                System.out.println(String.format(displayFormat, "TaskID", "TITLE", "DESCRIPTION", "STATUS", "DUE DATE"));
                System.out.println(String.format(displayFormat, "=======", "=======", "=====", "========", "========="));
                for (in.cashify.toDoExample.Task tasks : List) {
                    if (tasks.isTODO()) {
                        System.out.println(String.format(displayFormat,
                                tasks.getId(),
                                tasks.getTitle(),
                                tasks.getDescription(),
                                tasks.getProgress(),
                                tasks.getDueDate()
                        ));
                    }
                }
            }
        }

        catch(Exception e){
                Messages.showMessage(e.getMessage());

            }

        }

        public void listAllTasks() {
            try {
                System.out.println(Line);
                System.out.println(
                        "Total Tasks = " + List.size() +
                                "\t\t (Completed = " + completedCount() + "\t\t" +
                                " In Progress = " + notCompletedCount() +
                                " )");
                System.out.println(Line);
                String displayFormat = "%-20s %-20s %-20s %-20s";

                if (!List.isEmpty()) {
                    System.out.println(String.format(displayFormat, "TaskID", "TITLE", "DESCRIPTION", "STATUS", "DUE DATE"));
                    System.out.println(String.format(displayFormat, "=======", "=======", "=====", "========", "========="));
                    for (in.cashify.toDoExample.Task tasks : List) {

                        System.out.println(String.format(displayFormat,
                                tasks.getId(),
                                tasks.getTitle(),
                                tasks.getDescription(),
                                tasks.getProgress(),
                                tasks.getDueDate()
                        ));

                    }
                }
            }

        catch(Exception e) {
            Messages.showMessage(e.getMessage());

        }


    }

    private int notCompletedCount() {
        return (int) List.stream()
                .filter(task -> task.isInProgress())
                .count();

    }

    private int completedCount() {
        return (int) List.stream()
                .filter(task -> task.isInProgress())
                .count();
    }
}








