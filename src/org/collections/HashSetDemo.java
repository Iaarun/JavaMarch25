package org.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    // HashSet is a collection that contains no duplicate elements
    // HashSet is not synchronized
    // HashSet is not ordered
    // HashSet allows null values
    public static void main(String[] args) {
        HashSetDemo demo = new HashSetDemo();
        demo.linkedHashSetDemo();
        demo.treeSetDemo();
    }

    public void hashSetDemo() {
        HashSet<String> set = new HashSet<>();
        //add elements to the set
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        set.add("Java");
        set.add("TypScript");
        System.out.println(set);// System.out.println(set);
       //size of the set
        System.out.println(set.size());
       //check if set is empty
        System.out.println(set.isEmpty());
        //remove element from the set
        System.out.println(set.remove("Java"));
        System.out.println(set);
        //check if set contains element
        System.out.println(set.contains("Java"));
        //clear the set
        //set.clear();
        HashSet<String> set2 = new HashSet<>();
        set2.add("Physics");
        set2.add("Chemistry");
        set2.add("Biology");

        //add all elements of set2 to set
        set.addAll(set2);
        System.out.println(set);
        //containsAll
        System.out.println(set.containsAll(set2));
        set.removeAll(set2);
        System.out.println(set);
    }

    public void hashsetdemo2(){
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        set.add("TypScript");

        //iterate through the set using for-each loop
        System.out.println("Iterating through the set using for-each loop:");
        for (String s : set) {
            System.out.print(s+" ");
        }

        //iterate through the set using iterator
        System.out.println("\nIterating through the set using iterator:");
        Iterator<String> sit = set.iterator();
        while (sit.hasNext()) {
            System.out.print(sit.next()+" ");
        }
        //iterate through the set using for each with lambda expression
        System.out.println("\nIterating through the set using for each with lambda expression:");
        set.forEach(s -> System.out.print(s+" "));
        //iterate through the set using stream API
        System.out.println("\nIterating through the set using stream API:");
        set.stream().forEach(s -> System.out.print(s+" "));

    }

    public void linkedHashSetDemo(){
        //LinkedHashSet maintains the insertion order
        //LinkedHashSet is a collection that contains no duplicate elements
        //LinkedHashSet is not synchronized
        //LinkedHashSet allows null values
        //LinkedHashSet is faster than HashSet

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        set.add("TypScript");
        // iterate using stream API
        System.out.println("Iterating through the set using stream API:");
        set.stream().forEach(s -> System.out.print(s+" "));
    }

    public void treeSetDemo(){
        //TreeSet is a collection that contains no duplicate elements
        //TreeSet is not synchronized
        //TreeSet is ordered
        //TreeSet allows null values
        //TreeSet is faster than HashSet

        TreeSet<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        set.add("TypScript");

        // iterate using stream API
        System.out.println("\n Iterating through the set using stream API:");
        set.stream().forEach(s -> System.out.print(s+" "));


    }


}
