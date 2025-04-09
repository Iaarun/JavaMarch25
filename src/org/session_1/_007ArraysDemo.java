package org.session_1;

import java.util.Arrays;

public class _007ArraysDemo {
    public static void main(String[] args) {
        _007ArraysDemo array = new _007ArraysDemo();
        array.arrayBasic();

    }

    public void arrayBasic(){
        int[]number;
        number= new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
     //   number[5]=60;


        System.out.println("Length of array is: "+number.length);
        System.out.println(Arrays.toString(number));

        System.out.println("First element of array is: "+number[0]);
        System.out.println("Last element of array is: "+number[4]);
    }
}
