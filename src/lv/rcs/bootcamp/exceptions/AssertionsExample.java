package lv.rcs.bootcamp.exceptions;

public class AssertionsExample {

    public static void main(String[] args) {
        assert true;
        System.out.println("All good!");

        int x = 5;
        int y = 5;

        assert x == y : "This assert failed because boolean is false";
        System.out.println("did I get here?");
    }
}
