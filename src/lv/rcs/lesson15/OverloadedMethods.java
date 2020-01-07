package lv.rcs.lesson15;

//15.1 Create class "OverloadedMethods" with package access and create/implement six overloaded methods
//    called "outputVariable" each with one parameter for these data
//    types: int, long, double, boolean, String, String []. Each of this method should output the
//    parameter value and also it's data type. For example:
//        output(5);     //int value - 5
//    Create class "OverloadedMethodsProgram" and call all of these methods with arbitrary values.
//    Bonus:
//        Create three constructors (default constructor and two overloaded constructors). Choose
//        any parameter data types you want. Output all parameters in each of the constructor.
//        In class "OverloadedMethodsProgram" use each of the construct to instantiate new object.
public class OverloadedMethods {

    void outputVariable(int parameter) {
        System.out.println("int value - " + parameter);
    }

    void outputVariable(long parameter) {
        System.out.println("long value - " + parameter);
    }

    void outputVariable(double parameter) {
        System.out.println("double value - " + parameter);
    }

    void outputVariable(boolean parameter) {
        System.out.println("boolean value - " + parameter);
    }

    void outputVariable(String parameter) {
        System.out.println("String value - " + parameter);
    }

    void outputVariable(String[] parameter) {
        System.out.print("String[] value - ");
        for (int i =0; i < parameter.length; i++) {
            System.out.print(parameter[i] + " ");
        }
        System.out.println();
    }
}
