package lv.rcs.lesson8;

public class MethodsExamples {

    public static void main(String[] args) {
        int number = 10;
        System.out.println("skaitlis = " + number);
        example1(number);
        System.out.println("skaitlis = " + number);

        int mainigais1 = 5;
        int mainigais2 = 10;

        mainigais2 = mainigais1;
        mainigais2 = 99;
        System.out.println(mainigais1);
    }

    static void example1(int number) {
        System.out.println("number pirms maiņas:" + number);
        number = 20;
        System.out.println("number pēc maiņas:" + number);
    }
}
