package lv.rcs.lesson15.excersises.p1;

//1. Change access modifier for this class so the class would be accessible from any package
class A {

    //2. encapsulate this property so it's accessible only via getter method.
    // This getter method should be accessible from class BaseApp and class InnerApp
    // it shouldn't be possible to change this value from BaseApp
    public int a = 5;

    //3. change access modifier and encapsulate this property so it's only accessible in scope of
    // this package via getter method and can't be modified
    public int b = 2;

    //4. change access modifier for this property so it can be accessed from any class in any package
    // (via getter method), but changed only via setter method only inside of this package
    private String c = "c";

    // change access modifier for this property so it can be accessed and modified
    // from any class in any package directly (without any getter/setter methods)
    private String d = "d";

    // create method "secret" which can only be used inside of this object. Calling this method
    // should print out message "secret()". Then create a default constructor for this class
    // (make sure the constructor also has access modifier which is accessible from anywhere)
    // and call this "secret" method inside the constructor.

    //Create method "local" with package scope. (it should output message "local()".

    //create publicly accessible method "famous" which outputs text "famous()"

    //Bonus!:
    // create three overloaded constructors (choose any parameters you like) each with different
    // access modifier
}
