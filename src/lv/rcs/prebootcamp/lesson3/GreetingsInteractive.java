package lv.rcs.prebootcamp.lesson3;

import java.util.Scanner;

public class GreetingsInteractive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = scanner.next();

        System.out.println("please enter your age:");
        int age = scanner.nextInt();

        System.out.println("Hello, my name is " + name + " I am " + age + " years old");

        scanner.close();
    }
}
