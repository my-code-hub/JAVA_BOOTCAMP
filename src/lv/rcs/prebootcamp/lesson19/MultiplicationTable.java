package lv.rcs.prebootcamp.lesson19;

public class MultiplicationTable {

    //18.3 Create new two dimensional array with size 5 x 5.
    // This will be your matrix for multiplication
    // table. Fill the array with multiplication table numbers.
    // Print out the multidimensional array.
    // Result should look something like this:
    //     1 | 2 | 3 | 4 | 5 |
    //     2 | 4 | 6 | 8 | 10 |
    //     3 | 6 | 9 | 12 | 15 |
    //     4 | 8 | 12 | 16 | 20 |
    //     5 | 10 | 15 | 20 | 25 |
    public static void main(String[] args) {
        int x = 5;
        String result = x == 5 ? "x ir 5" : "x nav 5";
        System.out.println(result);

        int size = 5;
        int[][] array2 = new int[size][size];

        System.out.println();

        //i is row number
        for (int i = 0; i < array2.length; i++) {
            //j is column number
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (i + 1) * (j + 1); //we could also have separate variables for this
//                System.out.println("array2[" + i + "][" + j + "] is " + array2[i][j]);
                System.out.print(array2[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
