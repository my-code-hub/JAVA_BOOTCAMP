package lv.rcs.finalpractice.calendartodonotemanager;

import java.util.ArrayList;
import java.util.Scanner;

class Calendar extends ToDoApp {

    private String dateOfEvent; // deadline for tasks, happening time for calendar
    private String time; // time of event for calendar
    private String location; // location of event in calendar

    private Calendar(int id, String title, String text, String tags, String dateOfCreation, String dateOfEvent, String time, String location) {
        super(id, title, text, tags, dateOfCreation);
        this.dateOfEvent = dateOfEvent;
        this.time = time;
        this.location = location;
    }


    // ---------------------------------------------------------------------------------
    private String getDateOfEvent() {
        return dateOfEvent;
    }

    private String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    private void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    private void setTime(String time) {
        this.time = time;
    }

    private void setLocation(String location) {
        this.location = location;
    }


    // ---------------------------------------------------------------------------------
    void listAllProperties() {
        System.out.println("#" + getId() + "| Date: " + getDateOfEvent() + " at " + getTime() + " | " + getTitle() + " | Location: " + getLocation() + " | Tag: " + getTag() + " | Created: " + getDateOfCreation());
        if (getText().length() > 0) {
            System.out.println(getText());
        }
    }


    // ---------------------------------------------------------------------------------
    static Calendar createCalenderRecord(int id, Scanner scInput) {
        // create new Notepad objects asking a User for info to passing in
        // use same scanner object that is created in Main class

        System.out.println("Creating a new event >>> ");

        System.out.println("Date of event: ");
        String dateEvent = scInput.nextLine();

        System.out.println("Time of event: ");
        String time = scInput.nextLine();

        System.out.println("Title: ");
        String title = scInput.nextLine();

        System.out.println("Text: ");
        String text = scInput.nextLine();

        System.out.println("Location of event: ");
        String location = scInput.nextLine();

        System.out.println("Tag: ");
        String tag = scInput.nextLine();

        System.out.println("Date of creation: ");
        String date = scInput.nextLine();

        return new Calendar(id, title, text, tag, date, dateEvent, time, location);
    }


    // ---------------------------------------------------------------------------------
    static void modifyCalenderRecord(int id, ArrayList<Calendar> calenderArrayList, Scanner scInput) {
        // modify existent Notepad objects asking a User for info to modify
        // use same scanner object that is created in Main class

        // search for the Record to modify in whole array
        Calendar recToModify = null;
        boolean foundID = false;
        for (Calendar calendar : calenderArrayList) {
            if (calendar.getId() == id) {
                recToModify = calendar;
                foundID = true;
                break;
            }
        }
        if (!foundID) {
            System.out.println("Record with ID '" + id + "' was not found!");
        }

        final String exitStatement = "Done";

        System.out.println("Enter field code to be modified, when all fieds are finished - print '" + exitStatement + "'.");
        System.out.println("Fields codes: E date of event | M time | T title | X text | L location | G tag | D date of creation.");
        System.out.println("Modifying an event with an ID: " + id + " >>> ");

        String userCode = "";

        while (!userCode.equals(exitStatement)) {
            userCode = scInput.nextLine(); // read input

            switch (userCode) {
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
                    System.out.println("Modify date of event: ");
                    recToModify.setDateOfEvent(scInput.nextLine());
                    break;

                case "M":
                    System.out.println("Modify time of event: ");
                    recToModify.setTime(scInput.nextLine());
                    break;

                case "L":
                    System.out.println("Modify location of event: ");
                    recToModify.setLocation(scInput.nextLine());
                    break;

                case exitStatement:
                    break;

                default:
                    System.out.println("Cannot recognize the type! Please enter one from the list: E date of event | M time | T title | X text | L location | G tag | D date of creation.");
                    break;
            } //Calendar(id, title, text, tag, date, dateEvent, time, location);
        }
    }


    // ---------------------------------------------------------------------------------
    static void deleteCalenderRecord(int id, ArrayList<Calendar> calenderArrayList) {
        // delete existent Calender objects asking a User for ID
        // use same scanner object that is created in Main class

        // search for the Record to delete in a whole array

        boolean wasDeleted = false;

        for (int i = 0; i < calenderArrayList.size(); i++) {
            if (calenderArrayList.get(i).getId() == id) {

                calenderArrayList.remove(i);
                System.out.println("A note with ID: " + id + " was deleted!");
                wasDeleted = true;
                break;
            }
        }

        if (!wasDeleted) System.out.println("Record with ID '" + id + "' was not found!");

    }


    // ---------------------------------------------------------------------------------
}
