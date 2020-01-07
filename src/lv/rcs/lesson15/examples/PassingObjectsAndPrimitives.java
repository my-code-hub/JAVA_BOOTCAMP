package lv.rcs.lesson15.examples;

public class PassingObjectsAndPrimitives {

    public static void main(String[] args) {
        int a = 5;
        example(a, a);
        System.out.println(a);
        System.out.println("--------------------");

        Person person = new Person();
        System.out.println("person.age - " + person.age);
        example2(person);
        System.out.println("person.age - " + person.age);

        System.out.println("--------------------");
        Person person2 = new Person();
        int age = person2.getAge();
        System.out.println("person.getAge() (before)" + age);
        age = 21;
        System.out.println("age: " + age);
        System.out.println("person.age - " + person2.age);
    }

    static void example(int number, int number2) {
        System.out.println(number + " " + number2);
        number = 3;
        System.out.println(number + " " + number2);
    }

    static void example2(Person person) {
        System.out.println("person.age (before) - " + person.age);
        person.age = 10;
        System.out.println("person.age (after) - " + person.age);
    }


}
