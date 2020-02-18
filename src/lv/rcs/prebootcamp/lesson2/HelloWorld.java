package lv.rcs.prebootcamp.lesson2;

//comment 1
public class HelloWorld { //comment 2

    public static void main(String...args) {
        /* multi line
           comment
         */
        System.out.println("");
        int var1;
        double var2;
        char var3;
        float var4;
        String var5;
        var1 = 1;
        var2 = 10.55;
        var3 = 's';
        var4 = 5.5f;
        var5 = "John Doe!";
        System.out.println(var5.substring(0, 4));

        int mainigais = 1;
        System.out.println(mainigais);

        byte var6 = 5;
        short var7 = 7;

//        System.out.println("var1 "
//                 +
//                var1);

        boolean var8 = true;
        boolean var9 = false;

        if (var8) {
            System.out.println("var8 is true");
        } else {
            System.out.println("var8 is false");
        }
        System.out.println(var9);

        String str1 = "text 1";
        String str2 = "text 2";
        System.out.println(str1 + str2);


        // declare and initialize two integer variables (with identifiers x and y) with positive value;
        // sum the variables and store them in a new variable result
        // then print out the result (using System.out.println())
        int x = 50;
        int y = 25;
        int res = x + y;
        String str3 = "text ";
        System.out.println(str3 + res);


        // Declare and initialize three integer variables with values 5, 10, 15 and
        // calculate the average value and store the result in variable with identifier "result".
        // then print out the result (using System.out.println())
        int a = 4, b = 10, c = 15;
        int result = (a + b + c) / 3;
        System.out.println("average is" + result);
    }
}
