package lv.rcs.prebootcamp.lesson6;

import java.util.Scanner;

public class Task1 {

//    1. Ask user to input positive whole number and print the sum for all numbers
//    from 1 to user's  input number.
//    If user enters negative number, print message "Please enter positive number!"
//    hint: use while loop, int sum (sum += i)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet integer: ");
        int userInput = sc.nextInt();

        if (userInput > 0) {
            int i = 1;
            int sum = 0;
            while (i <= userInput) {
                sum += i;  //the same as sum = sum + i;
                i++;
            }
            System.out.println("Sum is: " + sum);
        } else {
            System.out.println("Please enter positive number!");
        }
    }
}
