package lv.rcs.bootcamp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

    public static void main(String[] args) {
        autoboxing(10);
        int number = 5;
        autoboxing(number);

        System.out.println("===============");
        listExample();

        System.out.println("==============");
        setExample();

        System.out.println("==============");
        mapExample();

        System.out.println("==============");
        iteratorExample();
    }

    static void autoboxing(Integer number) {
        System.out.println("number:" + number);
    }

    static void listExample() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(11);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("numbers.get(0): " + numbers.get(0));
        System.out.println("numbers.contains(10):" + numbers.contains(10));

        System.out.println("========= sorting list ========");
        //sorting in natural order
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
        //choose custom sort
        numbers.sort(new DescendingNumbersComparator());
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n=============================");
    }

    static void setExample() {
        Person john = new Person("John", 20);

        if (john.equals(john)) {
            System.out.println("john is equal to himself!");
        }

        Set<Person> persons = new HashSet<>();
        persons.add(john);
        persons.add(new Person("Jane", 25));
        persons.add(new Person("Jane", 25));
        persons.add(john);

        for (Person person : persons) {
            System.out.println("name: " + person.getName());
        }

        System.out.println("persons.contains(john): " + persons.contains(john));

        //sorting set
        System.out.println("======= sorting set ===========");
        Set<Person> personsSorted = new TreeSet<>(persons);
        for (Person person : personsSorted) {
            System.out.print("name: " + person.getName() + " ");
        }
        System.out.println("\n=================");
    }

    static void mapExample() {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("Riga", 632000);
        cityPopulation.put("x", 123123123);
        cityPopulation.put("y", 918263326);

        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (Integer value : cityPopulation.values()) {
            System.out.print("value: " + value + " ");
        }

        for (String key : cityPopulation.keySet()) {
            System.out.print("key: " + key + " ");
        }

        System.out.println("Riga has population of " + cityPopulation.get("Riga"));
    }

    static void iteratorExample() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() "
                    + iterator.next());
        }

        //removing elements with iterator
        iterator = numbers.iterator();
        System.out.println("numbers.size(): " + numbers.size());
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("numbers.size(): " + numbers.size());
    }
}
