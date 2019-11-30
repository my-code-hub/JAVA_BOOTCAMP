package lv.rcs.lesson3;

import java.util.Scanner;

public class BasicMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter integer:");
        int a = scanner.nextInt();

        System.out.println("please enter float:");
        float b = scanner.nextFloat();

        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("Subtracting " + a + " and " + b + " result is " + (a - b));
        System.out.println("Multiplying " + a + " and " + b + " result is " + (a * b));
        System.out.println("Dividing " + a + " and " + b + " result is " + (a / b));

        float sum = a + b;
        System.out.println("Square of " + a + " and " + b + " is " + sum * sum);
    }
}
