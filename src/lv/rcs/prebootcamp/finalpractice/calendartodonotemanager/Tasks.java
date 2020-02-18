package lv.rcs.prebootcamp.finalpractice.calendartodonotemanager;

import java.util.ArrayList;
import java.util.Scanner;

class Tasks extends ToDoApp {
    private String  dateOfDeadline; // deadline for tasks
    private boolean statusComplete; // complete flag, true or false
    private int priority; // possibility to set the priority of task in range of [1 low, 2 normal, 3 high]

    private Tasks(int id, String title, String text, String tags, String dateOfCreation, String dateOfDeadline, boolean statusComplete, int priority){
        super(id, title, text, tags, dateOfCreation);
        this.dateOfDeadline = dateOfDeadline;
        this.statusComplete = statusComplete;
        this.priority = priority;
    }

    // ---------------------------------------------------------------------------------
    private String  getDateOfDeadline() { return dateOfDeadline; }
    private boolean getStatusComplete(){ return statusComplete; }
    private int getPriority() { return priority; }

    private void setDateOfDeadline(String dateOfDeadline) { this.dateOfDeadline = dateOfDeadline; }
    private void setStatusComplete(boolean statusComplete) { this.statusComplete = statusComplete; }
    private void setPriority(int priority) { this.priority = priority; }

    // ---------------------------------------------------------------------------------
    void listAllProperties(){
        System.out.println("#" + getId() + "| " + (getStatusComplete()? "Completed": "Active") + " | Deadline: " + getDateOfDeadline() +  " | " + getTitle() + " | Tag: " + getTag() + " | Created: " + getDateOfCreation());
        if (getText().length() >0) { System.out.println(getText()); }
    }

    // ---------------------------------------------------------------------------------
    static Tasks createTaskRecord(int id, Scanner scInput){
        // create new Notepad objects asking a User for info to passing in
        // use same scanner object that is created in Main class

        System.out.println("Creating a new task >>> ");

        System.out.println("Priority status (1-3): ");
        int priority = Integer.parseInt(scInput.nextLine());

        System.out.println("Date of deadline: ");
        String dateDeadline = scInput.nextLine();

        System.out.println("Title: ");
        String title = scInput.nextLine();

        System.out.println("Text: ");
        String text = scInput.nextLine();

        System.out.println("Tag: ");
        String tag = scInput.nextLine();

        System.out.println("Date of creation: ");
        String date = scInput.nextLine();

        return new Tasks(id, title, text, tag, date, dateDeadline, false, priority);
    }


    // ---------------------------------------------------------------------------------
    static void modifyTaskRecord(int id, ArrayList<Tasks> tasksArrayList, Scanner scInput) {
        // modify existent Notepad objects asking a User for info to modify
        // use same scanner object that is created in Main class

        // search for the Record to modify in whole array
        Tasks recToModify = null;
        boolean foundID = false;
        for (Tasks tasks : tasksArrayList) {
            if (tasks.getId() == id) {
                recToModify = tasks;
                foundID = true;
                break;
            }
        }
        if (!foundID ) {
            System.out.println("Record with ID '" + id + "' was not found!");
        }

        final String exitStatement = "Done";

        System.out.println("Enter field code to be modified, when all fieds are finished - print '"+exitStatement+"'.");
        System.out.println("Fields codes: P priority | C completion status | E date of deadline | T title | X text | G tag | D date of creation.");
        System.out.println("Modifying an event with an ID: " + id + " >>> ");


        String userCode = "";

        while(!userCode.equals(exitStatement)){
            userCode = scInput.nextLine(); // read input

            switch (userCode){

                case "T":
                    System.out.println("Modify title: ");
                    recToModify.setTitle(scInput.nextLine());
                    break;

                case "X":
                    System.out.println("Modify text: ");
                    recToModify.setText(scInput.nextLine());
                    break;

                case "G":
                    System.out.println("Modify tag: ");
                    recToModify.setTag(scInput.nextLine());
                    break;

                case "D":
                    System.out.println("Modify date of creation: ");
                    recToModify.setDateOfCreation(scInput.nextLine());
                    break;

                case "E":
                    System.out.println("Modify date of deadline: ");
                    recToModify.setDateOfDeadline(scInput.nextLine());
                    break;

                case "C":
                    System.out.println("Modify completion status (Complete - true, Not complete - false): ");
                    recToModify.setStatusComplete(Boolean.parseBoolean(scInput.nextLine()));
                    break;

                case "P":
                    System.out.println("Modify task priority: ");
                    recToModify.setPriority(Integer.parseInt(scInput.nextLine()));
                    break;

                case exitStatement:
                    break;

                default:
                    System.out.println("Cannot recognize the type! Please enter one from the list: P priority | C completion status | E date of deadline | T title | X text | G tag | D date of creation.");
                    break;
            } // Tasks(id, title, text, tag, date, dateDeadline, false, priority);
        }
    }


    // ---------------------------------------------------------------------------------
    static void deleteTaskRecord(int id, ArrayList<Tasks> tasksArrayList) {
        // delete existent Calender objects asking a User for ID
        // use same scanner object that is created in Main class

        // search for the Record to delete in a whole array

        boolean wasDeleted = false;

        for (int i=0;i<tasksArrayList.size();i++){
            if (tasksArrayList.get(i).getId() == id) {

                tasksArrayList.remove(i);
                System.out.println("A note with ID: " + id + " was deleted!");
                wasDeleted = true;
                break;
            }
        }

        if(!wasDeleted) System.out.println("Record with ID '" + id + "' was not found!");
    }

}
