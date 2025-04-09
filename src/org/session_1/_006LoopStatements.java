package org.session_1;

public class _006LoopStatements {
    public static void main(String[] args) {
        _006LoopStatements loop = new _006LoopStatements();

        loop.sumofNumbers();

    }

    public void forloopdemo(){
        /* for(initialization; condition; increment/decrement){
            code to be executed
         }*/
        for(int i=1; i<=10; i=i+1 ){
            System.out.println(2*i);
        }

    }

    public void whileLoopDemo(){
        /*
        initiaization;
        while(condition){
            code to be executed
            increment/decrement;
         }*/
        int i=1;
        while(i<=10){
            System.out.println(2*i);
            i++;
        }
    }

    public void sumofNumbers(){
        int sum=0;
    /*    for(int i=1; i<=10; i++){
            sum= sum+i;
        }
        System.out.println( "Sum of first 10 numbers is: " + sum);*/

        int i=1;
        while(i<=10){
            sum= sum+i;
            i++;
        }
        System.out.println( "Sum of first 10 numbers is: " + sum);
    }
}
