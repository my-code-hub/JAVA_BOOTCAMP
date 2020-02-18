package lv.rcs.bootcamp.syntax;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] values = new String[3];
        values[0] = "Dot";
        values[1] = "Net";
        values[2] = "Perls";

        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("\n-----------");
        // first array
        int elements[] = {1, 2, 3, 4, 5, 6};
        for (int value : elements) {
            System.out.print(value + " ");
        }
// second, larger array
        System.out.println("\n-----------");
        int hold[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int value : hold) {
            System.out.print(value + " ");
        }

// copy all elements from first array to seco
//
        System.arraycopy(elements, 0, hold, 0, elements.length);
        System.out.println("\n-----------");
        for (int value : hold) {
            System.out.print(value + " ");
        }
    }
}
