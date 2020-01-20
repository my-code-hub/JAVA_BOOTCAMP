package lv.rcs.other.arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        //create an array of size 10. By default all elements
        //are initialized to null. This array can hold objects of type Peron
        //(or more precisely, it will hold references to those objects)
        Person [] persons = new Person[10];

        //create new instance of class Person
        Person john = new Person("John Doe");

        //insert this object (reference to this object) in our persons array at index 2
        persons[1] = john;

        //get the second element from this array and check if it is not null
        Person person = persons[1];
        if (person != null) {
            //print out the full name of the person object if it
            System.out.println(person.getFullName());

            //change the full name of this object
            person.setFullName("John Foo");

            //output the full name of the person again
            System.out.println(person.getFullName());
        }

        //output the name of the object "john" again. You will see that
        //the output is "John Foo". That is because variable john and person hold reference
        //to the same object in memory.
        System.out.println(john.getFullName());


        //now lets remove this object from array
        //(the second element is null now and doesn't point to our person object anymore)
        persons[1] = null;
    }
}
