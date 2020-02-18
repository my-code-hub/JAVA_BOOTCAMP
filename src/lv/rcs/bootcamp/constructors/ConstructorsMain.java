package lv.rcs.bootcamp.constructors;

public class ConstructorsMain {

    public static void main(String[] args) {

      //  A a = new A();

       // B b = new B();



        ImmutableObject o1 = new ImmutableObject("object 1");
        ImmutableObject o2 = new ImmutableObject("object 2");

        System.out.println(o1.getText());
        System.out.println(o2.getText());
    }
}
