package org.collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
     //   demo.listDemo();
        demo.findMaxinArray();
    }

    public void listDemo(){
        //default size is 10
        //load factor is 0.75
        // array list  is the ordered collection of elements
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        list2.add(256);

        ArrayList<String>  list = new ArrayList<>(10);
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Java");
        list.add("TypScript");

        System.out.println(list);
         //Wrapper classes
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        //adding elements
        list.add(5,"C#");
        System.out.println(list);
        //removing elements

        //return true if element is removed
        System.out.println(list.remove("C###"));
        //return data if element is removed
        System.out.println(list.remove(5));

        // contains
        System.out.println(list.contains("Java#"));

        //indexOf
        System.out.println(list.indexOf("Java"));
        //lastIndexOf
        System.out.println(list.lastIndexOf("Java"));
        //isEmpty
        System.out.println(list.isEmpty());
        //set    to replace the element
        list.set(5, "Ruby");
        System.out.println(list);


        // combine two lists
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Physics");
        list2.add("Chemistry");
        list2.add("Biology");

        list.addAll(1,list2);
        System.out.println(list);
        // containsAll
        System.out.println(list2.containsAll(list));
        // removeAll
        list.removeAll(list2);
        System.out.println(list);

        //subList
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 4));
        System.out.println(subList);


    }

    //iterate through the list
    public void iterateList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
       // iterate using for loop
        System.out.println("Iterating using for loop");
       for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println( "\nIterating using  enhance for loop");
       for (String str:list){
           System.out.print(str+" ");
       }

        System.out.println("\n Iterate using while loop");

       int i=0;
       while (i<list.size()){
           System.out.print(list.get(i)+" ");
           i++;
       }

        System.out.println("\n Iterate using iterator");

        Iterator<String> li = list.iterator();
        System.out.println(li.next());
         while(li.hasNext()){
             System.out.print(li.next()+" ");
         }

        System.out.println("\n Iterate forward using list iterator");

        ListIterator<String> lit = list.listIterator(list.size());

//        while(lit.hasNext()){
//            System.out.print(lit.next()+" ");
//        }
        System.out.println("\n Iterate backward using list iterator");

        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }

        System.out.println("\n Iterate using foreach with Lambda");

        list.forEach((var)->{
            System.out.print(var+" ");
        });

        System.out.println("\n Iterate using Stream API");
        list.stream().forEach(var-> {
            System.out.print(var+" ");
        });

    }

    public void findMaxinArray(){
        int [] arr= {21,54,23,74,64,82,45};
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Max value is "+max);

     int max1=   Arrays.stream(arr).max().getAsInt();
        System.out.println("Max value is "+max1);
     double avg=    Arrays.stream(arr).average().getAsDouble();
        System.out.println("Average is "+avg);

    }
}
