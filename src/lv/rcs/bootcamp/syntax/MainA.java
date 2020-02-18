package lv.rcs.bootcamp.syntax;

public class MainA {

    public static void main(String[] args) {
        A var1 = new A();
        A var2 = new A();
        A var3 = new A();
        A var4 = new A();
        A var5 = new A();


    }

    static int getNumber(String letter) {
        if (letter.equals("positive")) {
            return 10;
        } else {
            return -1;
        }
    }

    static int getNumber2(String letter) {
        return letter.equals("positive") ? 10 : -1;
    }
}
