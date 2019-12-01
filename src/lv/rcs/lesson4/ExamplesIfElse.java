package lv.rcs.lesson4;

public class ExamplesIfElse {

    public static void main(String... args) {

//        https://www.w3schools.com/java/java_conditions.asp
//        https://www.programiz.com/java-programming/if-else-statement
//        https://www.javatpoint.com/java-if-else
//        https://www.tutorialspoint.com/java/if_else_statement_in_java.htm
//        https://www.tutorialspoint.com/java/java_basic_operators.htm

        int a = 5;
        int b = 5;

        boolean result = (a == 3);
        //general format
        //expressions (comparing, computinge etc.)
        System.out.println("a == 3 " + result);
        System.out.println("(a == 3 || a == 6) " + (a == 3 || a == 6));
        System.out.println("(a == 5 && b == 5) " + (a == 5 && b == 5));

        int c = 3;
        if (c == 3) {
            System.out.println("c ir 3!");
        }

        if (c > 0) {
            System.out.println("c lielaks par 0");
            if (c > 1) {
                System.out.println(" un lielāks par 1");
                if (c > 2) {
                    System.out.println(" un arī par 2 lielāks ");
                    if (c > 3) {
                        System.out.println("un arī par 3 lielāks");
                    } else {
                        System.out.println("nav lielāks par 3");
                    }
                } else {
                    System.out.println("Nav lielāks par 2");
                }
            } else {
                System.out.println("nav lielāks par 1");
            }
        } else {
            System.out.println("c nav lielaks par 0");
        }

        if (c > 0) {

        } else if (c > 1) {

        } else if (c > 2) {

        } else {

        }




            //if else (using expressions)
        //     don't forget to mention variable scope!
        //    (with number comparisons, booleans, combining operators, etc.)
        //see relational and logical operators - https://www.tutorialspoint.com/java/java_basic_operators.htm


        //see WorkOrHoliday example


    }
}
