package lv.rcs.lesson5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] numbers = {8, 2, 5};
        int i = 0;
        while(i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet integer: ");
        int userInput = sc.nextInt();

        numbers[0] = userInput;
        i = 0;
        while(i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
