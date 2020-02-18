package lv.rcs.bootcamp.inheritance;

public class B extends A {

    @Override
    public void saySomething() {
        super.saySomething();
        System.out.println("Class B!");
    }

}
