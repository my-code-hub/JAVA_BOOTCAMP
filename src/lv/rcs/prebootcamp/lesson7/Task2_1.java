package lv.rcs.prebootcamp.lesson7;

import java.util.Scanner;

public class Task2_1 {

    // 2.1 ask user to input two whole numbers. Print out sum of all
    // numbers between first and second
    // number that user entered.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli 1: ");
        int skaitlis1 = sc.nextInt();

        System.out.println("Ievadiet skaitli 2: ");
        int skaitlis2 = sc.nextInt();

        if (skaitlis1 < skaitlis2) {
            int sum = 0;
            for (int i = skaitlis1; i <= skaitlis2; i++) {
                //sum = sum + i;
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("skaitlis " + skaitlis1 + " nav mazāks par " + skaitlis2);
        }
    }
}
