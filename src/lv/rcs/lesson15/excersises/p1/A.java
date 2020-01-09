package lv.rcs.lesson15.excersises.p1;

//1. Change access modifier for this class so the class would be accessible from any package
public class A {

    //2. encapsulate this property so it's accessible only via getter method.
    // This getter method should be accessible from class BaseApp and class InnerApp
    // it shouldn't be possible to change this value from BaseApp
    private int a = 5;

    public int getA() {
        return a;
    }

    //3. change access modifier and encapsulate this property so it's only accessible in scope of
    // this package via getter method and can't be modified
    private int b = 2;

    int getB() {
        return b;
    }

    //4. make this property accessible from any class in any package
    // (via getter method), but changed only via setter method only inside of this package
    private String c = "c";

    void setC(String c) {
        this.c = c;
    }

    public String getC() {
        return c;
    }

    // change access modifier for this property so it can be accessed and modified
    // from any class in any package directly (without any getter/setter methods)
    public String d = "d";

    // create method "secret" which can only be used inside of this object. Calling this method
    // should print out message "secret()". Then create a default constructor for this class
    // (make sure the constructor also has access modifier which is accessible from anywhere)
    // and call this "secret" method inside the constructor.

    public A() {
        secret();
    }

    private void secret() {
        System.out.println("secret()");
    }

    //Create method "local" with package scope. (it should output message "local()".)
    void local() {
        System.out.println("local()");
    }

    //create publicly accessible method "famous" which outputs text "famous()"
    public void famous() {
        System.out.println("famous()");
    }

    //Bonus!:
    // create three overloaded constructors (choose any parameters you like) each with different
    // access modifier
    public A(long number) {
        System.out.println("A(long number) " + number);
    }

    A(String text) {
        System.out.println("A(String number) - " + text);
    }

    private A(long number, long number2) {
        System.out.println("A(long number, long number2)");
    }
}
