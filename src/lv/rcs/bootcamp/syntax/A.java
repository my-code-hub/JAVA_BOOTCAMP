package lv.rcs.bootcamp.syntax;

public class A {

    static {
        System.out.println("static init block!");
    }

    public A() {
        System.out.println("Constructor!");
    }

    {
        System.out.println("init block!");
    }
}
