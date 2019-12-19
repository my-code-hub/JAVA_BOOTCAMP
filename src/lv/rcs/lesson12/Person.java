package lv.rcs.lesson12;

class Person {

    // these will have value of null by default
    String name;
    String surname;
    //default value
    int age;

    Person() {
        System.out.println("Person()");
        age = 10;
    }

    Person(int age) {
        System.out.println("Person(int age)");
        this.age = age;
    }

    Person(String personName,
           String personSurname, int personAge) {
        name = personName;
        surname = personSurname;
        age = personAge;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name + " "
                + surname + " and I'm " + age + " years old.");
    }

    void incrementAge() {
        System.out.println("incrementAge()");
        age++;
    }
}
