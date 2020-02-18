package lv.rcs.prebootcamp.lesson2;

import java.util.Scanner;

/**
 * 6. Write a Java program that takes a number as input and prints its
 * multiplication table upto 10.
 * Test Data:
 * Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Task6 {

    public static void main(String... args) {
        System.out.println("Please enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + i * number);
        }
    }
}
