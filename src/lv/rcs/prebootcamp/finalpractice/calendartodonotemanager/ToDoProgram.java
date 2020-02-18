package lv.rcs.prebootcamp.finalpractice.calendartodonotemanager;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoProgram {

    public static void main(String[] args) {

        // all data will be placed in ArrayLists

        ArrayList<Notepad> notepadArrayList = new ArrayList<>();
        ArrayList<Calendar> calendarArrayList = new ArrayList<>();
        ArrayList<Tasks> tasksArrayList = new ArrayList<>();

        // all commands to interact with a User

        final String exitStatement = "Exit";
        final String createStatement = "Create";
        final String modifyStatement = "Modify";
        final String deleteStatement = "Delete";
        final String listAllStatement = "List";


        // welcome and description message
        System.out.println("------------------------------------------------------ Welcome to the ToDo app! ------------------------------------------------------");
        System.out.println("You can choose to create three types of objects: a note / an event in calendar / a task. For exit please type '"+exitStatement+"'");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("To create a new record please type '"+createStatement+"' and an object type. For a note - N, for an event - C, for a task - T. Example '"+createStatement+" N'.");
        System.out.println("To modify an existing record please type '"+modifyStatement+"', an object type and a record ID number. Example '"+modifyStatement+" N 3'.");
        System.out.println("To delete an existing record please type '"+deleteStatement+"', an object type and a record ID number. Example '"+deleteStatement+" N 3'.");
        System.out.println("To list existing records please type '" +listAllStatement+"'. Example '"+listAllStatement+" N'. To list all the records use type 'A'. Example '"+listAllStatement+" A'.");


        // interaction cycle with User
        Scanner scInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println();
        System.out.println("Please type a command:");

        // -------------------------------------------------------------------
        // run until User type "Exit!"
        // -------------------------------------------------------------------
        boolean keepWorking = true;
        while (keepWorking){
            System.out.print(">>> ");

            // ------------ read user input into array -----------------------
            String[] userCommandInput = (scInput.nextLine()).split(" ");

            String userCommand = userCommandInput[0];


            // ----------- Action switch -------------------------------------
            switch (userCommand){


                case exitStatement: // -------------------- Exit ------------------------------------
                    // Exit the program
                    keepWorking = false;
                    break;

                case createStatement: // --------------- Create -------------------------------------
                    // Create certain type of a record

                    if(userCommandInput.length<=1) {
                        System.out.println("Please enter command with a type of record you want to create!");
                        break;

                    }else{
                        switch (userCommandInput[1]) {
                            case "N":
                                // create a note
                                notepadArrayList.add(
                                        Notepad.createNotepadRecord(
                                                notepadArrayList.size()>0? notepadArrayList.get(notepadArrayList.size()-1).getId()+1 :1,
                                                scInput
                                        )
                                );
                                break;

                            case "C":
                                // create an event
                                calendarArrayList.add(
                                        Calendar.createCalenderRecord(
                                                calendarArrayList.size()>0? calendarArrayList.get(calendarArrayList.size()-1).getId()+1 :1,
                                                scInput
                                        )
                                );
                                break;

                            case "T":
                                // create a task
                                tasksArrayList.add(
                                        Tasks.createTaskRecord(
                                                tasksArrayList.size()>0? tasksArrayList.get(tasksArrayList.size()-1).getId()+1 :1,
                                                scInput
                                        )
                                );
                                break;

                            default:
                                System.out.println("Cannot recognize the type! Please enter one from the list: / N notepad / C event in calendar / T task /");
                                break;
                        }
                    }
                    break;

                case modifyStatement: // -------------------------- Modify ------------------------------
                    //
                    if(userCommandInput.length<=1) {
                        System.out.println("Please enter command with a type of record you want to modify!");
                        break;
                    }else if(userCommandInput.length<=2){
                        System.out.println("Please enter an ID number of the record you want to modify!");
                        break;

                    }else{
                        switch (userCommandInput[1]) {
                            case "N":
                                // modify a notepad record
                                Notepad.modifyNotepadRecord(
                                        (int) Float.parseFloat(userCommandInput[2]),
                                        notepadArrayList,
                                        scInput);
                                break;

                            case "C":
                                // modify a calender record
                                Calendar.modifyCalenderRecord(
                                        (int) Float.parseFloat(userCommandInput[2]),
                                        calendarArrayList,
                                        scInput);
                                break;

                            case "T":
                                // modify a task record
                                Tasks.modifyTaskRecord(
                                        (int) Float.parseFloat(userCommandInput[2]),
                                        tasksArrayList,
                                        scInput);
                                break;

                            default:
                                System.out.println("Cannot recognize the type! Please enter one from the list: / N notepad / C event in calendar / T task /");
                                break;
                        }
                    }
                    break;


                    case deleteStatement: // --------------------- Delete -------------------------------
                    //
                        if(userCommandInput.length<=1) {
                            System.out.println("Please enter command with a type of record you want to delete!");
                            break;
                        }else if(userCommandInput.length<=2){
                            System.out.println("Please enter an ID number of the record you want to delete!");
                            break;

                        }else{
                            switch (userCommandInput[1]) {
                                case "N":
                                    // delete a notepad record
                                    Notepad.deleteNotepadRecord(
                                            (int) Float.parseFloat(userCommandInput[2]),
                                            notepadArrayList);
                                    break;

                                case "C":
                                    // delete an event record
                                    Calendar.deleteCalenderRecord(
                                            (int) Float.parseFloat(userCommandInput[2]),
                                            calendarArrayList);
                                    break;

                                case "T":
                                    // delete a task record
                                    Tasks.deleteTaskRecord(
                                            (int) Float.parseFloat(userCommandInput[2]),
                                            tasksArrayList);
                                    break;

                                default:
                                    System.out.println("Cannot recognize the type! Please enter one from the list: / N notepad / C event in calendar / T task /");
                                    break;
                            }
                        }
                    break;


                    case listAllStatement: // --------------------- List --------------------------------
                    //
                    if(userCommandInput.length<=1) {
                        System.out.println("Please enter command with a type of record you want to list!");
                        break;

                    }else{
                        switch (userCommandInput[1]) {
                            case "N":
                                // list a notepad array
                                for (Notepad notepad : notepadArrayList) { notepad.listAllProperties(); }
                                break;

                            case "C":
                                // list a calender array
                                for (Calendar calendar : calendarArrayList) { calendar.listAllProperties(); }
                                break;

                            case "T":
                                // list a task array
                                for (Tasks tasks : tasksArrayList) { tasks.listAllProperties(); }
                                break;

                            case "A":
                                // list all records
                                System.out.println("Notepad:");
                                for (Notepad notepad : notepadArrayList) { notepad.listAllProperties(); }
                                System.out.println("Calender:");
                                for (Calendar calendar : calendarArrayList) { calendar.listAllProperties(); }
                                System.out.println("Tasklist:");
                                for (Tasks tasks : tasksArrayList) { tasks.listAllProperties(); }
                                break;

                            default:
                                System.out.println("Cannot recognize the type! Please enter one from the list: / N notepad / C event in calendar / T task /");
                                break;
                        }
                    }
                    break;

                    default: // --------------- default from action command

                        System.out.println("Cannot recognize the command! Please enter one from the list:");
                        System.out.println("/ " + exitStatement + " / " + createStatement + " (N, C, T) / " + modifyStatement  + " (N, C, T) ID / " + deleteStatement  + " (N, C, T) ID / " + listAllStatement+" (N, C, T, A) /");

            } // ----------- end of main Switch --------------------------------


        } // ------------- end of while -----------------------------------

        // save all input

    } // ------------- end of Main class -----------------------------
} // --------------- end of Program -----------------------------
