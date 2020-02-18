package lv.rcs.prebootcamp.lesson3;

import java.util.Scanner;

public class ConditionalMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter integer:");
        int a = scanner.nextInt();

        System.out.println("please enter integer:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
