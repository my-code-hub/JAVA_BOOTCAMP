package lv.rcs.lesson8;

/*
8. Implement a method "printNumbers" with two whole numbers as
    parameters (n1 and n2) and prints out all the numbers
   from n1 to n2. This method doesn't return anything, it just
   prints the numbers. If n1 is greater
   than or equal to n2 then it doesn't print anything.
 */
public class Task8 {
    public static void main(String[] args) {
        printNumbers(0, 10);
        printNumbers(5, 10);
        printNumbers(10, 13);
        printNumbers(20, 10);
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
