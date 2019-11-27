package lv.rcs.lesson2;

import java.util.Scanner;

/**
 * 5. Write a Java program to get a number from the user and print
 *     whether it is positive, negative or zero.
 * Test Data
 * Input number: 35
 * Expected Output :
 * Number is positive
 */
public class Task5 {

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        // read more https://www.w3schools.com/java/java_conditions.asp
        if (number > 0) {
            System.out.println("number is positive");
        } else if (number < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }
    }
}
