package lv.rcs.lesson18.exercises.comparing;

//18.1 equals method:
//    - create class "Person" with properties "name", "age" and "personalId"
//    - create constructor with parameters "name", "age" and "personalId"
//    - create getter methods for all of these properties
//    - override equals method and change it so instances of type Person would only be equal to
//      each other if personalId is equal.
//    - write a program which creates a few instances of Person and checks equality between them.
//      (example where two persons are equal and not equal)
public class Person {

    private String name;
    private int age;
    private String personalId;

    public Person(String name,
                  int age,
                  String personalId) {
        this.name = name;
        this.age = age;
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPersonalId() {
        return personalId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Person) {
            Person person = (Person) other;
            return personalId.equals(person.getPersonalId());
        }
        return false;
    }
}
