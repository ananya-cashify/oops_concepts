package in.cashify.toDoExample;

import java.time.LocalDate;

public class Task {

    private int id ;
    private String title;
    private String description;
    private String progress;
    private LocalDate dueDate;


    public Task ( int taskId , String title, String description ,String progress , LocalDate dueDate){
        this.id = taskId;
        this .title = title;
        this.description = description;
        this.progress = progress;
        this.dueDate = dueDate;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description = description;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProgress(){
        return progress;
    }
    public void setProgress(String progress){
        this.progress = progress;
    }
    public LocalDate getDueDate(){
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }
    public String markInComplete() {
        this.progress = "IN PROGRESS";
        return this.progress;
    }


    public String markCompleted() {
        this.progress = "COMPLETED";
        return this.progress;

    }

    public boolean isInProgress() {
        if("In Progress".equalsIgnoreCase(getProgress())){
            return true;
        }else {
            return false;
        }
    }


    public boolean isCompleted() {
        if("Completed".equalsIgnoreCase(getProgress())){
            return true;
        }else {
            return false;
        }
    }

    public boolean isTODO() {
        if("TODO".equalsIgnoreCase(getProgress())){
            return true;
        }else {
            return false;
        }
    }








}

