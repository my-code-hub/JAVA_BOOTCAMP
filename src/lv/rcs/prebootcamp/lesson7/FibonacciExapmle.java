package lv.rcs.prebootcamp.lesson7;

import java.util.Scanner;

public class FibonacciExapmle {

    // 1. ask user to input positive arbitrary whole number and print Fibonacci sequence till that number.
    //    For example, if user inputs number 10 the output should be:
    //    0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34
    //
    //    hint: use for loop and multiple variables to remember sum and previous values
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli: ");
        int limit = sc.nextInt();
        int sum = 0, prev1 = 1, prev2;

        for (int i = 1; i <= limit; i++) {
            System.out.print(sum + " ");
            if (i != limit) {
                System.out.print(" + ");
            }
            prev2 = prev1;
            prev1 = sum;
            sum = prev1 + prev2;
        }
    }
}
