package lv.rcs.lesson8;

public class Task4 {
    //4. Implement a method "getGreatest" with three whole numbers as parameters (x1, x2, x3) and returns the
    //  highest number of those. (hint: you will have to use if / else to compare the numbers, similar as
    //  we did in Lesson 4, task 2)
    //  Example of method usage:
    public static void main(String [] args) {
        System.out.println(getGreatest(1, 2, 3)); //prints 3
        System.out.println(getGreatest(5, 2, 3)); //prints 5
        int result = getGreatest(5, 10, 3);
        System.out.println(result);
    }

    static int getGreatest(int x1, int x2, int x3) {
        if (x1 > x2 && x1 > x3) {
            return x1;
        } else if (x2 > x1 && x2 > x3) {
            return x2;
        } else if (x3 > x1 && x3 > x2) {
            return x3;
        } else {
            return x1;
        }
    }
}
