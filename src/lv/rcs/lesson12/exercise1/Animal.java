package lv.rcs.lesson12.exercise1;

//1. create class "Animal" with properties "type", "name" and "age"
//    * create constructor with parameters "name" and "age" for
//    setting the properties
//    * create three objects each with different names and ages
//    (two objects of type "cat" and one "dog")
//    * create a method "makeSound" which prints "wuff!" if the
//    animal type is "dog" or "meow!" if
//      the animal type is "cat"
class Animal {

    String type;
    String name;
    int age;

    Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        if ("cat".equals(type)) {
            System.out.println("meow!");
        } else if (type.equals("dog")) {
            System.out.println("wuff!");
        }
    }
}
