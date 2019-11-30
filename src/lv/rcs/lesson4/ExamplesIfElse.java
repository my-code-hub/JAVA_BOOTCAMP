package lv.rcs.lesson4;

public class ExamplesIfElse {

    public static void main(String... args) {

//        https://www.w3schools.com/java/java_conditions.asp
//        https://www.programiz.com/java-programming/if-else-statement
//        https://www.javatpoint.com/java-if-else
//        https://www.tutorialspoint.com/java/if_else_statement_in_java.htm
//        https://www.tutorialspoint.com/java/java_basic_operators.htm

        //general format
        //expressions (comparing, computinge etc.)
        int a = 5;
        int b = 5;

        boolean result = (a == 3);
        System.out.println("a == 3 " + result);
        System.out.println("(a == 3 || a == 6) " + (a == 3 || a == 6));
        System.out.println("(a == 5 && b == 5) " + (a == 5 && b == 5));

        boolean result2 = a == 3 || a == 6;
        if (result2) {
            //here
        }
        if (result2) {
            //here
        }

        if (a == 5 && b == 5) {
            System.out.println("a and b is 5");
        }

        if (true) {

        } else {

        }

        if (true) {

        } else if (true) {

        } else {

        }

        if (false) {
            System.out.println("block 1");
        } else if (false) {
            System.out.println("block 2");
        } else if (false) {
            System.out.println("block 3");
        }




            //if else (using expressions)
        //     don't forget to mention variable scope!
        //    (with number comparisons, booleans, combining operators, etc.)
        //see relational and logical operators - https://www.tutorialspoint.com/java/java_basic_operators.htm


        //see WorkOrHoliday example


    }
}
