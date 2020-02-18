package lv.rcs.prebootcamp.additional;

import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi komandu: ");
        String userInput = sc.nextLine();
        String[] words = userInput.split(" ");
        String command = words[0];
        String item = userInput.substring(command.length() + 1);

        if ("add".equals(command)) {
            //add new item to the list
            System.out.println("adding new item to the list");
            System.out.println("item: " + item);
        }


//        do {
//
//        } while("exit".equals(command));
    }
}
