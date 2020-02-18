package lv.rcs.prebootcamp.additional.linda;

import java.util.ArrayList;
import java.util.Scanner;

//TODO code formatting
//TODO create a new class Commands which has public static final String PRINT_LIST command (read about static variables)
//and replace the switch  / case values

public class ToDoListManagement {

    public static void main(String[] args) {
        //Create "TO-DO list management" application which allows the user to:
        //     1. Add multiple items to the list
        //     2. view the list
        //     3. Remove item from list
        //     4. Edit any item in the list
        //    izveidot klasi TodoList, kas saturētu visas šīs metodes
        //    Izveidot klasi Item, kas saturētu laukus "text" un "done" (true or false)
        //    tad pievienot komandu "printUncompleted" (vai tamlīdzīģu nosaukumu), kas izvadītu elementus, kas nav izdarīti
        //    un arī pievienot metodi "done [INDEX]" lai var atķeksēt izdarītos elementus
        ArrayList<Item> toDoList = new ArrayList<Item>(); //TODO diamond operators
        toDoList.add(new Item("Buy milk"));
        toDoList.add(new Item("Go to the gym"));
        Scanner sc = new Scanner(System.in);
        String input = null;
        int i = 0;
        while (i == 0) { //TODO why not just while (true)?
            System.out.println(" Please input command: ");
            input = sc.nextLine();
            String[] inputString = input.split("\\s+");
            String command = inputString[0];
            switch (command) {
                case "printList":
                    ToDoList.printList(toDoList);
                    break;
                case "add":
                    String item = input.substring(command.length() + 1);
                    ToDoList.add(toDoList, item);
                    break;
                case "edit":
                    int editIndex = Integer.parseInt(inputString[1]);
                    if (editIndex > 0 && editIndex <= toDoList.size()) {
                        String editString = new String(); //TODO
                        for (int j = 2; j < inputString.length; j++) {
                            editString = editString + inputString[j] + " ";
                        }
                        ToDoList.edit(toDoList, editString, editIndex - 1);
                    } else {
                        System.out.println("Please input action number from To Do list!");
                        ToDoList.printList(toDoList);
                    }
                    break;
                case "remove":
                    int removeIndex = Integer.parseInt(inputString[1]);
                    if (removeIndex > 0 && removeIndex <= toDoList.size()) {
                        ToDoList.remove(toDoList, removeIndex - 1);
                    } else {
                        System.out.println("Please input action number from To Do list!");
                        ToDoList.printList(toDoList);
                    }
                    break;
                case "done":
                    int doneIndex = Integer.parseInt(inputString[1]);
                    if (doneIndex > 0 && doneIndex <= toDoList.size()) {
                        ToDoList.done(toDoList, doneIndex - 1);
                    } else {
                        System.out.println("Please input action number from To Do list!");
                        ToDoList.printList(toDoList);
                    }
                    break;
                case "printUncompleted":
                    ToDoList.printUncompleted(toDoList);
                    break;
                case "exit":
                    i = 1;
                    break;
                default:
                    System.out.println("Please input only valid commands!");
                    break;
            }
        }
        sc.close();
    }
}
