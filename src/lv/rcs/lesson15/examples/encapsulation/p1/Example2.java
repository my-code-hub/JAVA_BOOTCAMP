package lv.rcs.lesson15.examples.encapsulation.p1;

public class Example2 {
    //default / package access modifier
    String prop1 = "default";
    // public access modifier
    public String prop2 = "public";

    //encapsulated
    private String prop3 = "private";

    //can be called inside of the same package and class
    void method1() {
        System.out.println("package access!");
    }

    // can be called from anywhere
    public void method2() {
        System.out.println("public access!");
    }

    // can be called inside the class
    private void method3() {
        System.out.println("private access!");
    }
    
    //example of getter method
    public String getProp3() {
        return prop3;
    }

    //example of setter method
    public void setProp3(String value) {
        prop3 = value;
    }
}
