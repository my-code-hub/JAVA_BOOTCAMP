package lv.rcs.bootcamp.syntax;

public class Examples {

    public static void main(String[] args) {
        final int x = 5;
        int y = x + 5;

        printNumber(x);
        printNumber(5);

        System.out.println("-------------");
        int skaitlis = 10;
        printNumber(++skaitlis);

        System.out.println("-----------");
        System.out.println(isNumber());
        System.out.println(!isNumber());
        System.out.println(isNumber() == true);
        System.out.println(isNumber() == false);
        System.out.println(isNumber() != true);
        System.out.println(isNumber() != false);


        ///casting
        int skaitlis1 = 100;
        long skaitlis2 = 100;

        //explicit cast
        skaitlis1 = (int) skaitlis2;

        skaitlis2 = skaitlis1;

        /////////
    }

    private static boolean isNumber() {
        return true;
    }

    private static void printNumber(int var) {
        System.out.println(var);
    }
}
