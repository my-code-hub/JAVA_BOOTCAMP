package lv.rcs.lesson15.examples;

public class MethodOverloading {

    public static void main(String[] args) {
        long number = 51872563817653187L;
        int number2 = 10;
        example(number2);
    }

    static void example(long x) {
        System.out.println("example(long x) " + x);
    }

    static void example(int x) {
        System.out.println("example(int x) " + x);
    }

    static void example(int x, int y) {
        System.out.println("example(int x) " + x);
    }
}
