package lv.rcs.lesson2;

/**
 * 2. Write a Java program to print the result of the following operations.
 * Test Data:
 * a. -5 + 8 * 6
 * b. (55+9) % 9
 * c. 20 + -3*5 / 8
 * d. 5 + 15 / 3 * 2 - 8 % 3
 * Expected Output :
 * 43
 * 1
 * 19
 * 13
 */
public class Task2 {

    // https://introcs.cs.princeton.edu/java/11precedence/
    public static void main(String[] args) {
        int a = 5, b = 8, c = 6;
        int result = a + b * c;
        System.out.println(result);
        result = (55 + 9) % 9;
        System.out.println(result);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}
