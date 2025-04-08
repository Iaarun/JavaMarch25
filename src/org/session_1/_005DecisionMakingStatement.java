package org.session_1;

import java.util.Scanner;

public class _005DecisionMakingStatement {
    public static void main(String[] args) {
        _005DecisionMakingStatement dm = new _005DecisionMakingStatement();
       // dm.ifStatement();
      //  dm.ifElseStatement();
      //  dm.ladderStatement();
        dm.switchStatement();
    }

    public  void ifStatement(){
        // if(condition){
        //  code to be executed if condition is true
        // }

        int a = 10;
        int b = 20;
        if (a<b){
            System.out.println("B is greater than A");
        }

    }

    public void ifElseStatement(){
        /*
         if(condition){
          code to be executed if condition is true
         }else{
         code to be executed if condition is false
        }*/

        int a = 30;
        int b = 20;
        if (a<b){
            System.out.println("B is greater than A");
        }else{
            System.out.println("A is greater than B");
        }
    }

    public void ladderStatement (){
        /*
         if(condition1){
          code to be executed if condition1 is true
         }else if(condition2){
          code to be executed if condition2 is true
         }else{
          code to be executed if both condition1 and condition2 are false
         }
        */

        int a = 10;
        int b = 20;
        if (a<b){
            System.out.println("B is greater than A");
        }else if(a==b){
            System.out.println("A is equal to B");
        }else{
            System.out.println("A is greater than B");
        }
    }

    public void switchStatement(){
        /*
         switch(expression){
          case value1:
           code to be executed if expression matches value1
           break;
          case value2:
           code to be executed if expression matches value2
           break;
          default:
           code to be executed if expression doesn't match any case
         }
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week (1-7): ");
        int dayoftheweek= sc.nextInt();

        switch (dayoftheweek)  {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
                break;
        }
    }
}
