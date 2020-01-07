package lv.rcs.lesson15;

public class OverloadedMethodsProgram {

    public static void main(String[] args) {
        int number = 5;
        OverloadedMethods object = new OverloadedMethods();

        object.outputVariable(number);
        object.outputVariable(5L);
        object.outputVariable(2.2D);
        object.outputVariable(true);
        object.outputVariable("teksts!");
        object.outputVariable(new String[]{"e1", "e2"});
    }
}
