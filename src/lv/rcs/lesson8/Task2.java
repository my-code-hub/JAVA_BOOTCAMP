package lv.rcs.lesson8;

public class Task2 {

    public static void main(String [] args) {
        greetPerson("John");
        greetPerson("Jane");
    }

    static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
