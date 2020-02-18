package lv.rcs.prebootcamp.lesson12;

public class ObjectsExamples {

    public static void main(String[] args) {
        //creating new object of type Person
        Person p1 = new Person();
        System.out.println("p1.age: " + p1.age);
        p1.sayHello();

        Person p2 = new Person();
        System.out.println("p2.age: " + p2.age);

        Person p3 = new Person(20);
        System.out.println("p3.age: " + p3.age);
        p3.sayHello();

        //change age for p2
        p2.age = 30;
        System.out.println("p2.age: " + p2.age);
        p2.sayHello();

        Person p4 = new Person("John", "Doe", 50);
        System.out.println("p4.name: " + p4.name);
        System.out.println("p4.surname: " + p4.surname);
        System.out.println("p4.age: " + p4.age);

        p4.surname = "Lapiņš";
        System.out.println("p4.surname: " + p4.surname);
        p4.sayHello();
        p4.incrementAge();
        p4.sayHello();

        //default values
        int number;
        // int number = null; // won't work
        Person p10 = null;

        //System.out.println(number); can't do this
        System.out.println("p10 is: " + p10);
    }
}
