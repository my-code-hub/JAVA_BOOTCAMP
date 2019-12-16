package lv.rcs.lesson8;

import java.util.Scanner;

/*
8.2 Implement a method "printNumbersFromLowestToHighest" with two whole numbers as parameters (n1 and n2)
   and prints out all the numbers from lowest to highest. For example:
   printNumbersFromLowestToHighest(10, 5); // this method call will print out numbers 5, 6, 7, 8, 9, 10
   printNumbersFromLowestToHighest(5, 10); // this method call will also print out numbers 5, 6, 7, 8, 9, 10
   printNumbersFromLowestToHighest(3, 1);  // this method call will print out numbers 1, 2, 3

 */
public class Task82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli 1: ");
        int number1 = sc.nextInt();

        System.out.println("Ievadiet skaitli 2: ");
        int number2 = sc.nextInt();

        printNumbersFromLowestToHighest(number1, number2);
        System.out.println(); //izvadam tukšu jaunu rindu
        printNumbersFromLowestToHighest2(number1, number2);
    }

    static void printNumbersFromLowestToHighest(int n1, int n2) {
        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
        } else if (n2 < n1) {
            for (int i = n2; i <= n1; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("both numbers are equal: " + n1);
        }
    }

    //variants 2
    static void printNumbersFromLowestToHighest2(int n1, int n2) {
        int counter, limit;
        if (n1 < n2) {
            counter = n1;
            limit = n2;
        } else {
            counter = n2;
            limit = n1;
        }
        for (int i = counter; i <= limit; i++) {
            System.out.print(i + " ");
        }
    }
}
