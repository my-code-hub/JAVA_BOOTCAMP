package lv.rcs.prebootcamp.lesson15.excersises.p1;

// Change access modifier for this class so it would be accessible only inside of this package.
// (so we can only create object of type B in InnerApp class, but not BaseApp class)
class B {

    B() {
        System.out.println("class B() constructor called!");
    }
}
