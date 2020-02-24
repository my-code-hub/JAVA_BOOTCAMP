package lv.rcs.bootcamp.collections;

import java.util.Comparator;

public class DescendingNumbersComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
