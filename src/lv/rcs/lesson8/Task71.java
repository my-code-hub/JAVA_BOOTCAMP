package lv.rcs.lesson8;

/*
7.1 Implement a method "weather" which has one parameter "degrees" (whole number)
    and returns text.
    if the "degrees" value is higher than 22, then return text "hot",
    if "degrees" value is between 16 - 21 (including), then return text "normal"
    if "degrees" value is between 5 - 15 (including), then return text "cool"
    if "degrees" value is less than 5, return text "cold"
    Write a program which uses this method and outputs the result to user.
    Example of how the method can be used:
    System.out.println(weather(22)); // should print "hot"
 */
public class Task71 {

    public static void main(String[] args) {
        System.out.println(weather(22)); // should print "hot"
        System.out.println(weather(17));
        System.out.println(weather(6));
        System.out.println(weather(1));
    }

    static String weather(int degrees) {
        if (degrees >= 22) {
            return "hot";
        } else if (degrees >= 16 && degrees <= 21) {
            return "normal";
        } else if (degrees >= 5 && degrees <= 15) {
            return "cool";
        } else {
            return "cold";
        }
    }
}
