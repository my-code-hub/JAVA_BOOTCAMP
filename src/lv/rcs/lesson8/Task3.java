package lv.rcs.lesson8;

import java.util.Scanner;

public class Task3 {

    public static void main(String [] args) {
        multiply(5, 5); //25
        multiply(2, 2); //4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two whole numbers");
        int skaitlis1 = scanner.nextInt();
        int skaitlis2 = scanner.nextInt();
        multiply(skaitlis1, skaitlis2);
    }

    static void multiply(int x1, int x2) {
        System.out.println(x1 * x2);
    }
}
