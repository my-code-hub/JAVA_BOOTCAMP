package lv.rcs.lesson4;

public class BooleanExamples {

    public static void main(String...args) {
        boolean a = true;
        boolean b = false;

        boolean c = a || b;

        System.out.println("true is " + a);
        System.out.println("F || F : " + (false || false));
        System.out.println("T || F : " + (true || false));
        System.out.println("F || T : " + (false || true));
        System.out.println("T || T : " + (true || true));

        System.out.println("F && F : " + (false && false));
        System.out.println("T && F : " + (true && false));
        System.out.println("F && T : " + (false && true));
        System.out.println("T && T : " + (true && true));

        System.out.println("T || F || T : " + (true || false || true));
        System.out.println("T && T && F : " + (true && true && false));
        System.out.println("T || F && T : " + ((true || false) && true));
    }
}
