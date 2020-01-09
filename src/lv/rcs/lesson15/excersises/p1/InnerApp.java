package lv.rcs.lesson15.excersises.p1;

public class InnerApp {

    public static void main(String[] args) {

        //1. create new instance of class A using default constructor
        A object = new A();

        //2. output the value of property "a" via the getter method
        //Note: if you did everything right, then the code below shouldn't be compiling:
//        A object2 = new A();
        System.out.println(object.getA());

        //3. output the value of property "b" via the getter method
        //Note: if you did everything right, then the code below shouldn't be compiling:
        // A object2 = new A();
        // System.out.println(object2.b);
        System.out.println(object.getB());

        //4. output the value of property c
        System.out.println(object.getC());
        //modify the value of property c to "Updated C!"
        object.setC("Updated C!");
        //output the value of property c
        System.out.println(object.getC());

        //5. output property value "d"
        System.out.println(object.d);
        // update property "d" to value "InnerApp"
        object.d = "InnerApp";
        // output property value "d"
        System.out.println(object.d);

        //6. call method "local()"
        object.local();

        //7. call method "famous()"
        object.famous();

        //8. can you call method "secret" on this object? Why not?
        //because it's private

        //9.create new instance of class B using default constructor
        // why can you do it in this class, but couldn't do it in class "BaseApp"?
        B b = new B();
    }
}
