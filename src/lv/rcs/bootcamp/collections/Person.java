package lv.rcs.bootcamp.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //reflexive: an object must equal itself
    //symmetric: x.equals(y) must return the same result as y.equals(x)
    //transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
    //consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        //descending order
        return o.getName().compareTo(this.getName());
        //ascending order
        //return this.getName().compareTo(o.getName());
    }
}
