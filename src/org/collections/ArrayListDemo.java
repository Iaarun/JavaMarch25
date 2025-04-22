package org.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        demo.listDemo();
    }

    public void listDemo(){
        ArrayList<String>  list = new ArrayList<>();
        list.add("Hello");

        System.out.println(list);
    }
}
