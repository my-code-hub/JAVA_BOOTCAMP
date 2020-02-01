package lv.rcs.finalpractice.calendartodonotemanager;

import java.util.ArrayList;
import java.util.Scanner;

class Notepad extends ToDoApp {

    private Notepad(int id, String title, String text, String tags, String dateOfCreation){
        super(id, title, text, tags, dateOfCreation);
    }

    // ---------------------------------------------------------------------------------
    void listAllProperties(){
        System.out.println("#" + getId() + "| " + getTitle() + " | Tag: " + getTag() + " | Created: " + getDateOfCreation());
        System.out.println(getText());
    }


    // ---------------------------------------------------------------------------------
    static Notepad createNotepadRecord(int id, Scanner scInput){
        // create new Notepad objects asking a User for info to passing in
        // use same scanner object that is created in Main class

        System.out.println("Creating a new note >>> ");

        System.out.println("Title: ");
        String title = scInput.nextLine();

        System.out.println("Text: ");
        String text = scInput.nextLine();

        System.out.println("Tag: ");
        String tag = scInput.nextLine();

        System.out.println("Date: ");
        String date = scInput.nextLine();

        return new Notepad(id, title, text, tag, date);
    }


    // ---------------------------------------------------------------------------------
    static void modifyNotepadRecord(int id, ArrayList<Notepad> notepadArrayList, Scanner scInput) {
        // modify existent Notepad objects asking a User for info to modify
        // use same scanner object that is created in Main class

        // search for the Record to modify in whole array
        Notepad recToModify = null;
        boolean foundID = false;
        for (Notepad notepad : notepadArrayList) {
            if (notepad.getId() == id) {
                recToModify = notepad;
                foundID = true;
                break;
            }
        }
        if (!foundID ) {
            System.out.println("Record with ID '" + id + "' was not found!");
        }

        final String exitStatement = "Done";

        System.out.println("Enter field code to be modified, when all fieds are finished - print '"+exitStatement+"'.");
        System.out.println("Fields codes: T title | X text | G tag | D date.");
        System.out.println("Modifying a note with an ID: " + id + " >>> ");

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
                    System.out.println("Modify date: ");
                    recToModify.setDateOfCreation(scInput.nextLine());
                    break;

                case exitStatement:
                    break;

                default:
                    System.out.println("Cannot recognize the type! Please enter one from the list: T title | X text | G tag | D date.");
                    break;
            }
        }
    }


    // ---------------------------------------------------------------------------------
    static void deleteNotepadRecord(int id, ArrayList<Notepad> notepadArrayList) {
        // delete existent Notepad objects asking a User for ID
        // use same scanner object that is created in Main class

        // search for the Record to delete in a whole array

        boolean wasDeleted = false;

        for (int i=0;i<notepadArrayList.size();i++){
            if (notepadArrayList.get(i).getId() == id) {

                notepadArrayList.remove(i);
                System.out.println("A note with ID: " + id + " was deleted!");
                wasDeleted = true;
                break;
            }
        }

        if(!wasDeleted) System.out.println("Record with ID '" + id + "' was not found!");

    }


    // ---------------------------------------------------------------------------------

}
