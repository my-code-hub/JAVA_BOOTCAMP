package lv.rcs.prebootcamp.finalpractice.todomanager;

import java.util.Scanner;

public class ToDoManager {
    static String[] CATEGORIES = {"Hobbies", "Work", "Family"};

    public static void main(String[] args) {
        Item[] itemArray = new Item[100];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input command (type help to get full list of commands): ");
            String command = sc.nextLine();
            switch (command) {
                case "help":
                    System.out.println("You have following commands available: add, print, edit category, edit description, " +
                            "edit priority, edit status, remove or exit");
                    break;
                case "add":
                    String categoryNames = getCategoryNames();
                    System.out.println("Please input task category " + categoryNames + ": ");
                    String category = sc.nextLine();
                    while (!isValidCategory(category)) {
                        System.out.println("please input valid category " + categoryNames);
                        category = sc.nextLine();
                    }
                    System.out.println("Please input task description: ");
                    String description = sc.nextLine();
                    System.out.println("Please input item priority on the scale from 1 to 4: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    while (priority < 1 || priority > 4) {
                        System.out.println("Please put priority from 1-4");
                        priority = sc.nextInt();
                        sc.nextLine();
                    }
                    Item item = new Item(category, description, priority);
                    boolean isSuccess = false;
                    for (int i = 0; i < itemArray.length; i++) {
                        if (itemArray[i] == null) {
                            itemArray[i] = item;
                            isSuccess = true;
                            break;
                        }
                    }
                    if (isSuccess == false) {
                        System.out.println("List is full!");
                    }
                    break;
                case "print":
                    for (int i = 0; i < itemArray.length; i++) {
                        if (itemArray[i] != null) {
                            System.out.println(i + " | " + itemArray[i]);
                        }
                    }
                    break;
                case "remove":
                    System.out.println("Please write the index of task which you would like to delete: ");
                    int delete = sc.nextInt();
                    sc.nextLine();
                    itemArray[delete] = null;
                    break;
                case "edit category":
                    categoryNames = getCategoryNames();
                    System.out.println("Please write the index of task which you would like to edit: ");
                    int edit = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Please edit category name: ");
                    category = sc.nextLine();
                    while (!isValidCategory(category)) {
                        System.out.println("please input valid category " + categoryNames);
                        category = sc.nextLine();
                    }
                    Item item1 = itemArray[edit];
                    item1.setName(category);
                    break;
                case "edit description":
                    System.out.println("Please write the index of task which you would like to edit: ");
                    edit = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Please edit item description: ");
                    description = sc.nextLine();
                    item1 = itemArray[edit];
                    item1.setDescription(description);
                    break;
                case "edit priority":
                    System.out.println("Please write the index of task which you would like to edit: ");
                    edit = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Please edit item priority on the scale from 1 to 4: ");
                    priority = sc.nextInt();
                    sc.nextLine();
                    while (priority < 1 || priority > 4) {
                        System.out.println("Please put priority from 1-4");
                        priority = sc.nextInt();
                        sc.nextLine();
                    }
                    item1 = itemArray[edit];
                    item1.setPriority(priority);
                    break;
                case "edit status":
                    System.out.println("Please write the index of task which you would like to edit: ");
                    edit = sc.nextInt();
                    sc.nextLine();
                    boolean isDone;
                    isDone = true;
                    item1 = itemArray[edit];
                    item1.setDone(isDone);
                    break;
                case "exit":
                    return;
            }
        }
    }

    static boolean isValidCategory(String input) {
        for (String category : CATEGORIES) {
            if (category.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

    static String getCategoryNames() {
        StringBuilder text = new StringBuilder("(");
        int lastIndex = CATEGORIES.length - 1;
        for (int i = 0; i < CATEGORIES.length; i++) {
            text.append(CATEGORIES[i]);
            if (i != lastIndex) {
                text.append(", ");
            }
        }
        return text.append(")").toString();
    }
}
