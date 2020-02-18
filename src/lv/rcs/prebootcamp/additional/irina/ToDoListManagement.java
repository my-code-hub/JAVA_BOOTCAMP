//package lv.rcs.additional.irina;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//​
//public class ToDoListManagement {
//    public static void main(String[] args) {
//        //100. Create "TO-DO list management" application which allows the user to:
//        //     1. Add multiple items to the list, for example:
//        //     2. view the list
//        //     3. Remove item from list
//        //     4. Edit any item in the list
//        //          edit 3 buy milk and eggs
//        //
//        //     Description: Once the program is launched, it creates list (ArrayList should be used) in memory
//        //        for user and user can interact with program via command line (be entering commands and
//        //        pressing enter). Program needs to support the following commands:
//        //
//        //        (note: for all examples below, let's assume we already have two items in our TODO list:
//        //                1 Buy milk
//        //                2 Go to the gym)
//        //
//        //        1) printList - command has no arguments, it just prints the list to the user.
//        //            Example input:
//        //                printList
//        //
//        //            Example output:
//        //                1 Buy milk
//        //                2 Go to the gym
//        //
//        //        2) add [TEXT] - command adds new item at the end of the list and prints the list.
//        //            Example input:
//        //                add Mow the lawn
//        //            Example output:
//        //                1 Buy milk
//        //                2 Go to the gym
//        //                3 Mow the lawn
//        //
//        //        3) remove [INDEX] - removes element from list and prints the list.
//        //            Example input:
//        //                remove 2
//        //            Example output:
//        //                1 Buy milk
//        //
//        //        4) edit [INDEX] [TEXT] - modifies element in the list and prints the list.
//        //            Example input:
//        //                edit 1 Buy milk and eggs!
//        //            Example output:
//        //                1 Buy milk and eggs!
//        //                2 Go to the gym
//        //
//        //    bonus:
//        //
//        //    izveidot klasi TodoList, kas saturētu visas šīs metodes
//        //    Izveidot klasi Item, kas saturētu laukus "text" un "done" (true or false)
//        //    tad pievienot komandu "printUncompleted" (vai tamlīdzīģu nosaukumu), kas izvadītu elementus, kas nav izdarīti
//        //    un arī pievienot metodi "done [INDEX]" lai var atķeksēt izdarītos elementus
//​
//        Scanner sc = new Scanner(System.in);
//        ToDoList example = new ToDoList();
//​
//        System.out.println("Available commands: " +
//                "\n- PrintList(Prints the TODO List)" +
//                "\n- Add 'Some Task'(Write the task you want to be added to your TODO list)" +
//                "\n- Remove '2'(Write the number of the task you want to remove)" +
//                "\n- Edit '3' 'Edited task'(Edit preferred task)" +
//                "\n- Done 'Task number' (Adds a tick sign to task)" +
//                "\n- Uncompleted (Prints uncompleted tasks only)" +
//                "\nIf you wish to finish working with TODO List, type in 'end'." +
//                "\nPlease, enter the command:");
//​
//        String userInput = sc.nextLine();
//        while (!userInput.toLowerCase().equals("end")){
//            String[] userInputArray = userInput.split("\\s+");
//            String command = userInputArray[0];
//            switch (command.toLowerCase()) {
//                case "printlist":
//                    example.printList();
//                    break;
//                case "add":
//                    if(checkingForCorrectInput(userInputArray, 2)) {
//                        example.addingToDoList(userInputArray);
//                    }
//                    break;
//                case "remove":
//                    if(checkingForCorrectInput(userInputArray, 2)) {
//                        int digitIndicator = checkingForCorrectDigitInput(userInputArray[1], example.getToDoList());
//                        if (digitIndicator == 0) {
//                            break;
//                        }
//                        example.removingTheTask(digitIndicator - 1);
//                    }
//                    break;
//                case "edit":
//                    if(checkingForCorrectInput(userInputArray, 3)) {
//                        int digitIndicator = checkingForCorrectDigitInput(userInputArray[1], example.getToDoList());
//                        if (digitIndicator == 0) {
//                            break;
//                        }
//                        example.editingTheTask(digitIndicator - 1, userInputArray);
//                    }
//                    break;
//                case "done":
//                    if(checkingForCorrectInput(userInputArray, 2)) {
//                        int digitIndicator = checkingForCorrectDigitInput(userInputArray[1], example.getToDoList());
//                        if (digitIndicator == 0) {
//                            break;
//                        }
//                        example.makingTaskDone(digitIndicator - 1);
//                    }
//                    break;
//                case "uncompleted":
//                    example.printUncompletedTasks();
//                    break;
//                default:
//                    System.out.println("Entered command does not exist!");
//            }
//            System.out.println("Type in next command: ");
//            userInput = sc.nextLine();
//        }
//​
//    }
//​
//    static boolean checkingForCorrectInput(String[] userInputArray, int lengthNeeded) {
//        if(userInputArray.length >= lengthNeeded){
//            return true;
//        }else {
//            System.out.println("Entered command is not full!");
//            return false;
//        }
//    }
//​
//    static int checkingForCorrectDigitInput(String mustBeDigit, ArrayList<Item> toDoList) {
//        try {
//            int index = Integer.parseInt(mustBeDigit);
//            if(index > 0 && index <= toDoList.size()) {
//                return index;
//            }else {
//                System.out.println("Value entered does not correspond to any existing task number!");
//                return 0;
//            }
//        }catch (Exception ex) {
//            System.out.println("Value entered after the command is not a digit!");
//            return 0;
//        }
//    }
//}
