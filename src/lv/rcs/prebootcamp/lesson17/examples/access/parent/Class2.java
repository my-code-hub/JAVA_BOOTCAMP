package lv.rcs.prebootcamp.lesson17.examples.access.parent;

public class Class2 extends Class1 {

    public void test() {
        tryMePublic(); // OK
        tryMeProtected(); // OK
        tryMePackage(); // OK
    }
}
