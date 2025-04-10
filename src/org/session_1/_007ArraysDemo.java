package org.session_1;

import java.util.Arrays;
import java.util.Scanner;

public class _007ArraysDemo {
    public static void main(String[] args) {
        _007ArraysDemo array = new _007ArraysDemo();
        array.twoDimensionArray();

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
        System.out.println("Last element of array is: "+ number[4]);
    }

    public void arrayDemo2(){
        //iterating through array
        int[] number = {10, 20, 30, 40, 50};
      //  int [] num1 = new int[]{10, 20, 30, 40, 50};
        //for loop works on index
    /*    for(int i=0; i<number.length; i++){
            System.out.println("Element at index " + i + " is: " + number[i]);
        }*/

        //enhanced for loop  it works on values
        for(int a:number){
            System.out.println("Element is: " + a);
        }
    }

    public void sumofArray(){
        int num[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
       int size= sc.nextInt();
        num = new int[size];
        System.out.println("Enter "+size +" elements of array: ");

        for(int i=0; i<=num.length-1; i++){
            num[i]=sc.nextInt();
        }

        System.out.println("Elements of array are: ");
        for(int a:num){
            System.out.println(a);
        }
        int sum=0;
        for(int a:num){
            sum= sum+a;
        }
        System.out.println("Sum of array is: " + sum);
    }

    public void twoDimensionArray(){
        int num[][] = new int [3][3];
        num[0][0]=11;
        num[0][1]=111;
        num[0][2]=1111;

        num[1][0]=22;
        num[1][1]=222;
        num[1][2]=2222;

        num[2][0]=33;
        num[2][1]=333;
        num[2][2]=3333;

        System.out.println("Length of array is: "+num[0].length);
         //for rows
        for(int i=0; i<=num.length-1; i++){
            //for columns
          for(int j=0;j<num[i].length;j++){
              System.out.print(num[i][j]+" ");
          }
            System.out.println();
        }
    }
}
