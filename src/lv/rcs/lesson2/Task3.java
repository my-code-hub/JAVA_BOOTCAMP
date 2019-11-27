package lv.rcs.lesson2;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes two numbers as input and display the
 *    product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output :
 * 25 x 5 = 125
 */
public class Task3 {

    public static void main(String[] args) {
        int x = 25;
        int y = 5;
        System.out.println(x * y);

        // example with input from user via console
        // https://www.w3schools.com/java/java_user_input.asp
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input first number: ");
        int b = scanner.nextInt();
        System.out.println(a * b);
    }
}
