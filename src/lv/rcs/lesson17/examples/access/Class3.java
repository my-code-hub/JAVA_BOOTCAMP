package lv.rcs.lesson17.examples.access;

import lv.rcs.lesson17.examples.access.parent.Class1;

public class Class3 extends Class1 {

    public void test() {
        Class1 c = new Class1();
        // ERROR, because only public methods are allowed to be
        // called on class instance, whereever you are
       // c.tryMeProtected();
      //  c.tryMePackage(); //ERROR

        tryMeProtected(); // OK
        tryMePublic(); // OK
       // tryMePackage(); // ERROR
    }
}
