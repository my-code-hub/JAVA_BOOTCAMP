package lv.rcs.lesson8;

public class Methods {

    public static void main(String[] args) {
        // why are the needed and where are they used?
        // structure of method:
        // https://www.geeksforgeeks.org/methods-in-java/
        //https://www.w3schools.com/java/java_methods.asp

        //methods which don't return anything - void (methods that outputs text)
        example1();

        //methods which return something
        //(String, int, char, double, array or any type)
        int skaitlis1 = example2();
        System.out.println(skaitlis1);
        System.out.println(example2());
        if (example2() == 5) {
            System.out.println("example2() atgriež skaitli 5!");
        }
        if (skaitlis1 == 5) {
            System.out.println("skaitlis1 ir 5!");
           // return;
        }

        if (example3()) {
            System.out.println("example3() returned true!");
        }

        //method which returns boolean (true if number is 1)
        System.out.println(isNumber1(5));
        System.out.println(isNumber1(1));

        //methods with arguments (parameter vs argument)
        System.out.println(isNumber1(skaitlis1));

        //method which concatenates two strings
        System.out.println(returnText());
        System.out.println(concatenateTwoStrings("Hello", "world2!"));

        String teksts = "text";
        System.out.println(teksts.toUpperCase());
        System.out.println(teksts);

    }

    // method which doesn't return anything
    static void example1() {
        System.out.println("Hello, World!");
        System.out.println("my name is Ritvars!");
        int x = 0;
        System.out.println("x is " + x);
    }

    static int example2() {
        return 5;
    }

    static boolean example3() {
        return true;
    }

    static boolean isNumber1(int skaitlis) {
        if (skaitlis == 1) {
            return true;
        } else {
            return false;
        }
    }

    static String returnText() {
        return "hello world 1!";
    }

    static String concatenateTwoStrings(String text1, String text2) {
//        String result = text1 + " " + text2;
//        return result;
        return text1 + " " + text2;
    }
}
