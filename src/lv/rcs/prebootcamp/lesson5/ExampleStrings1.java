package lv.rcs.prebootcamp.lesson5;

public class ExampleStrings1 {

    // explain about null
    public static void main(String [] args) {
        String s1 = "This is a string";
        System.out.println(s1);

        String s2 = new String("This is also a string");
        System.out.println(s2);

        String s3 = "Shirt size: ";
        String s4 = "M";

        String s5 = s3 + s4 + ", Qty: " + 4;
        System.out.println(s5);

        System.out.println("this is a string " + true);

        //List of all string methods (under methods):
        //https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
    }
}
