package lv.rcs.lesson8;

//6. Implement a method "isPositive" which has one parameter
//   (whole number) and returns true if it is
//   positive or zero and false, if it is negative.
//   Write a program which uses this method and outputs
//   the result to user.
public class Task6 {

    public static void main(String[] args) {
        System.out.println(isPositive(-15));

        int number = 20;
        boolean result = isPositive(number);
        System.out.println("20 is positive?: " + result);
    }

    static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // the same as previous example, but shorter
    static boolean isPositiveExample2(int number) {
        return number >= 0;
    }
}
