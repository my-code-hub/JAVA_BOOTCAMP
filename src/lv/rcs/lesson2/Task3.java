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
        //example without user input
        int x = 25;
        int y = 5;
        int z = x * y;
        System.out.println(z);

        // example with input from user via console
        // https://www.w3schools.com/java/java_user_input.asp
        Scanner ievads = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input first number: ");
        int a = ievads.nextInt();

        System.out.println("Input second number: ");
        int b = ievads.nextInt();
        System.out.println(a * b);
    }
}
