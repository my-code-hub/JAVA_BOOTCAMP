package lv.rcs.lesson2;

/*
    1. Write a Java program which:
      * has single line comments
      * block comments
      * that declares all types of primitive variables
      * initializes all variables (any value you want)
      * prints out each variable
 */
public class Task1 {

    public static void main(String[] args) {
        /*  this is
            block comment */

        // https://www.w3schools.com/java/java_data_types.asp
        // https://www.geeksforgeeks.org/variables-in-java/
        byte myByte = 127;          // byte value (whole number)
        short shortVal = 32000;      // short (whole number)
        int myNum = 5;               // Integer (whole number)
        long myLong = 1000323;       // long (whole number, but bigger than integer)
        double myDouble = 20.20;     // Floating point number
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean

        System.out.println(myByte + ", " + shortVal + ", " + myNum + ", " + myLong + ", "
                + myDouble + ", " + myFloatNum + ", " + myLetter + ", " + myBool);

    }
}
