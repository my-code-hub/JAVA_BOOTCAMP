package lv.rcs.lesson8;

public class Task5 {

    //5. Write a method "isEqual" which has two parameters (whole numbers) and returns true if they are
    //   equal and false if they are not. Write a program which uses this method and outputs
    //   the result to user.
    public static void main(String [] args) {
        System.out.println(isEqual(10, 10));
        System.out.println(isEqual(1, 2));
        System.out.println(isEqual(1, -5));
        System.out.println(isEqual(-5, -5));
    }

    static boolean isEqual(int n1, int n2) {
        if (n1 == n2) {
            return true;
        } else {
            return false;
        }
    }

    //variants 2
    static boolean isEqual2(int n1, int n2) {
        return n1 == n2;
    }

    //variants 3
    static boolean isEqual3(int n1, int n2) {
        if (n1 == n2) {
            return true;
        }
        return false;
    }
}
