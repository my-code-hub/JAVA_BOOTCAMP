package lv.rcs.bootcamp.constructors;

public class B extends A {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("initialization block");
    }

    public B() {
        super();
        System.out.println("B()");
    }

    public B(String text) {
        this();
    }
}
