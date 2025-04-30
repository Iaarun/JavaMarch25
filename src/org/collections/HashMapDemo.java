package org.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMapDemo demo = new HashMapDemo();
        // demo.hashMapDemo();
        demo.hashMapIterate();
    }

    public void hashMapDemo() {
        // HashMap is a collection that stores key-value pairs
        // HashMap is not synchronized
        // HashMap allows null values and null keys
        // HashMap is not ordered
        // HashMap is not thread-safe
        // HashMap is faster than Hashtable
        // HashMap is implemented using a hash table
        // HashMap is a part of the Java Collections Framework

        //  HashMap<String, HashMap<String , Integer>> map = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();
        //add elements to the map
        map.put("A", "Java");
        map.put("B", "Python");
        map.put("C", "C++");
        map.put("D", "JavaScript");
        map.put("E", "Java");
        map.put("A", "TypScript");
        System.out.println(map);
        //map does not support index based access
        //size of the map
        System.out.println(map.size());
        //check if map is empty
        System.out.println(map.isEmpty());
        //get value from the map
        String val = map.get("A");
        System.out.println(val);
        map.putIfAbsent("F", "Cobol");
        System.out.println(map);
        //check if map contains key
        System.out.println(map.containsKey("G"));
        //check if map contains value
        System.out.println(map.containsValue("Java"));
        //remove element from the map
        System.out.println(map.remove("F"));
        System.out.println(map.remove("E", "Java"));
        //clear the map
        map.clear();
        System.out.println(map);

    }

    public void hashMapIterate() {
        HashMap<String, String> map = new HashMap<>();
        //add elements to the map
        map.put("A", "Java");
        map.put("B", "Python");
        map.put("C", "C++");
        map.put("D", "JavaScript");
        map.put("E", "Java");
        //Iterate over the map using entryset() using enhance for loop
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());

        }
        System.out.println("\n Iterate over keys only");
        //Iterate over key only
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n Iterate over values only");
        //Iterate over values only
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("\n Iterate over map using forEach");
        //Iterate over map using forEach
        map.forEach((x, y) -> {
            System.out.println(x + " : " + y);
        });

        System.out.println("\n Iterate oer map using stream api");
        //Iterate over map using stream api
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });

        System.out.println("\n Iterate over map using Iterator");
        //Iterate over map using iterator
        Iterator<Map.Entry<String, String>> mapIt = map.entrySet().iterator();
        while(mapIt.hasNext()){
            Map.Entry<String, String> entry = mapIt.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


