//package lv.rcs.additional.irina;
//
//import java.util.ArrayList;
//​
//public class ToDoList {
//​
//    private ArrayList<Item> toDoList = new ArrayList<Item>();
//​
//    public void setToDoList(int index, String someTask) {
//        Item task = new Item(someTask);
//        toDoList.add(index, task);
//    }
//​
//    ArrayList<Item> getToDoList() {
//        return toDoList;
//    }
//​
//    void printList() {
//        if(!toDoList.isEmpty()) {
//            for(int i = 0, j = 1; i < toDoList.size(); i++, j++) {
//                System.out.println(j + " " + toDoList.get(i).getText());
//            }
//        }else {
//            System.out.println("There are no tasks in the list.");
//        }
//    }
//​
//    void addingToDoList(String[] userInputArray) {
//        setToDoList(toDoList.size(), concatenatingTheTask(1, userInputArray));
//        printList();
//    }
//​
//    void removingTheTask(int index) {
//        toDoList.remove(index);
//        printList();
//    }
//​
//    void editingTheTask(int index, String[] userInputArray) {
//        toDoList.remove(index);
//        setToDoList(index, concatenatingTheTask(2, userInputArray));
//        printList();
//    }
//​
//    void makingTaskDone(int index) {
//        toDoList.get(index).setDone(true);
//        System.out.println("Task " + (index + 1) + " " + toDoList.get(index).getText() + " is set to DONE.");
//    }
//​
//    void printUncompletedTasks() {
//        if(!toDoList.isEmpty()) {
//            int k = 0;
//            for(int i = 0, j = 1; i < toDoList.size(); i++, j++) {
//                if(!toDoList.get(i).getDone()){
//                    System.out.println(j + " " + toDoList.get(i).getText());
//                    k++;
//                }
//            }
//            if(k == 0) {
//                System.out.println("All task are done!");
//            }
//        }else {
//            System.out.println("There are no tasks in the list.");
//        }
//    }
//​
//    String concatenatingTheTask(int taskStartIndex, String[] userInputArray) {
//        String task = "";
//        for(int i = taskStartIndex; i < userInputArray.length; i++) {
//            if(i == userInputArray.length - 1) {
//                task += userInputArray[i];
//                break;
//            }
//            task += userInputArray[i] + " ";
//        }
//        return task;
//    }
//}
