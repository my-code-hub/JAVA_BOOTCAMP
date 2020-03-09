package lv.rcs.bootcamp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ArraysExample {

    public static void main(String[] args) {
        removeItemFromArrayListExample();
    }

    static void removeItemFromArrayListExample() {
        List<String> stringArray = new ArrayList<>(asList("A", "B", "C", "D", "E", "F", "G"));
        outputArray(stringArray);

        //remove by index
        stringArray.remove(2);
        outputArray(stringArray);

        //bad way, don't ever do this!
        String elementToRemove0 = "G";
        for (int i = 0; i < stringArray.size(); i++) {
            String element = stringArray.get(i);
            if (element.equals(elementToRemove0)) {
                stringArray.remove(i);
            }
        }
        outputArray(stringArray);

        //remove by element (uses equals to find element
        // in array and then removes it)
        stringArray.remove("A");
        outputArray(stringArray);

        //remove during loop
        String elementToRemove = "E";
        Iterator<String> it = stringArray.iterator();
        while (it.hasNext()) {
            String element = it.next();
            if (elementToRemove.equals(element)) {
                it.remove();
            }
        }
        outputArray(stringArray);

        //java 8 way (with lambda)
        String elementToRemove2 = "F";
        stringArray.removeIf(e -> e.equals(elementToRemove2));
    }

    static void outputArray(List<String> array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("===================");
    }
}
