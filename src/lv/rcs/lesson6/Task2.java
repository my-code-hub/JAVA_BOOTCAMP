package lv.rcs.lesson6;

import java.util.Scanner;

//2. Ask user to input two whole numbers (first and second) and print out all numbers
//    between first and second.
//   (including first and second number).
//   If first number is greater than second, then print message "First number has to be less than second."
//   and exit program.
//
//   hint: you will need Scanner (for user input), while loop (to print out numbers).
//         To exit program, you have to use return; statement. Example:
//         if (...) {
//             return; //this line stops program execution.
//         }
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli 1: ");
        int skaitlis1 = sc.nextInt();

        System.out.println("Ievadiet skaitli 2: ");
        int skaitlis2 = sc.nextInt();

        if (skaitlis1 < skaitlis2) {
            int i = skaitlis1;
            while (i <= skaitlis2) {
                System.out.println(i++);
                // the same as:
                //System.out.println(i);
                //i++; // i = i + 1;
            }
        } else {
            System.out.println(skaitlis1 + " is less than " + skaitlis2);
        }
    }
}
