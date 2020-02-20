package lv.rcs.bootcamp.exceptions;

public class AssertionsExample {

    public static void main(String[] args) {
        System.out.println("true: " + (5 != 5));
        System.out.println("false: " + false);

        assert true;
        System.out.println("All good!");

        int x = 5;
        int y = 5;

        assert x == y : "This assert failed because boolean is false";
        System.out.println("did I get here?");

        divide(10, 0);
    }

    public static int divide(int a, int b) {

        System.out.println("b == 0 " + (b == 0));

        assert b != 0 : "b is 0";
        return a / b;
    }
}
