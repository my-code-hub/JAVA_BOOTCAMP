package lv.rcs.bootcamp.constructors;

public class ExamplesMain {

    public static void main(String[] args) {
        Person p1 = new Person("Janis");
        Person p2 = new Person("Peteris");
        Person p3 = new Person("Janis");
        Person p4 = p1;
        Person p5 = p3;

        Object p6 = p5;

        System.out.println("p1 == p2 = " + (p1 == p2));
        System.out.println("p1 == p3 = " + (p1 == p3));
        System.out.println("p1 == p4 = " + (p1 == p4));
        System.out.println("p5 == p3 = " + (p5 == p3));

        System.out.println("============================");

        System.out.println("p1 == p2 = " + p1.equals(p2));
        System.out.println("p1 == p3 = " + p1.equals(p3));
        System.out.println("p1 == p4 = " + p1.equals(p4));
        System.out.println("p5 == p3 = " + p5.equals(p3));


        System.out.println("========================");
        String s1 = "test";
        String s2 = "test";
        String s3 = new String("test");
       // String s3 = "test";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


        //overloaded operator
        System.out.println(5 + 5);

        System.out.println("hello, " + "world!");

    }



}
