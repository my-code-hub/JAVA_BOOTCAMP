package lv.rcs.prebootcamp.lesson5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        //array declaration and initialization
        int[] numbers = {8, 2, 5};

        //ievads no lietotāja
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet integer: ");
        int userInput = sc.nextInt();

        int i = 0;
        boolean atradaam = false;
        while (i < numbers.length) {
            if (numbers[i] == userInput) {
                atradaam = true;
                break;
            }
            i++; // i = i + 1;
        }

        // the same as atradaam == true
        if (atradaam) {
            System.out.println("Atradām skaitli: " + userInput);
        } else {
            System.out.println("neatradām skaitli: " + userInput);
        }
    }
}
