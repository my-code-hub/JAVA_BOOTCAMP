package lv.rcs.lesson5;

public class ArraysDefaultValues {

    public static void main(String[] args) {
        // default values:
        System.out.println("\n\nInteger array default values:");
        int num[] = new int[5];
        for (int val : num)
            System.out.print(val + " ");

        System.out.println("\n\nDouble array default values:");
        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");

        System.out.println("\n\nBoolean array default values:");
        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");

        char burts = 38;
        System.out.println(burts);
        System.out.println("\n\nChar array default values:");
        char chararr[] = new char[5];
        for (char val : chararr)
            System.out.print(val + " ");
    }
}
