package lv.rcs.lesson8;

import java.util.Scanner;

/*
8. Implement a method "printNumbers" with two whole numbers as
   parameters (n1 and n2) and prints out all the numbers
   from n1 to n2. This method doesn't return anything, it
   just prints the numbers. If n1 is greater
   than or equal to n2 then it doesn't print anything.

8.1 Modify previous task so that program asks numbers n1 and n2 from user and then calls the method
    "printNumbers" with the numbers that user entered.
 */
public class Task81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli 1: ");
        int number1 = sc.nextInt();

        System.out.println("Ievadiet skaitli 2: ");
        int number2 = sc.nextInt();

        printNumbers(number1, number2);
    }

    static void printNumbers(int n1, int n2) {
        if (n1 >= n2) {
            System.out.println(n1 + " is greater or equal than " + n2);
            return;
        }
        for (int i = n1; i <= n2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
