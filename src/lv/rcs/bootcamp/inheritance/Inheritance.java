package lv.rcs.bootcamp.inheritance;

public class Inheritance {

    public static void main(String[] args) {
        A var1 = new A();
        var1.saySomething();

        B var2 = new B();
        var2.saySomething();

        A var3 = var2;
        var3.saySomething();
    }
}
