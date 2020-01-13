package lv.rcs.lesson18.examples;

public class Strings {

    //https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
    public static void main(String[] args) {

        String name = " name";
        String name2 = name + " is John ";
        System.out.println(name2);

        ////trim
        name2.trim();
        System.out.println(name2);
        String name3 = name2.trim();
        System.out.println(name3);

        //substring
        String string1 = "word1 word2";
        System.out.println(string1.substring(6));

        //split
        String [] words = string1.split(" ");

        //uppercase
        System.out.println(string1.toUpperCase());

        //lowercase
        System.out.println(string1.toLowerCase());

        //startsWith
        System.out.println(string1.startsWith("word1"));

        //replaceAll
        System.out.println(string1.replaceAll("w", "c"));
    }
}
