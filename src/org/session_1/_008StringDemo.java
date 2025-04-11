package org.session_1;

public class _008StringDemo {
    public static void main(String[] args) {
        _008StringDemo str = new _008StringDemo();
     //   str.stringDemo();
         str.stringFunctionsDemo();
        //   str.stringBuilderDemo();
    }

    public void stringDemo() {
        //using String literal
        String str1 = "Hello";
        String str2 = "Hello";

        //using new keyword
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        if (str3 == str4) {
            System.out.println("str1 and str2 are same");

        }else{
            System.out.println("str3 and str4 are not same");
        }
        //immutable string
      str3=  str3.concat(" World"); ;
        System.out.println(str3);
    }

    public void stringBufferDemo() {
        //using StringBuffer
        StringBuffer str1 = new StringBuffer("Hello");

        //mutable string
        str1.append(" World");
        System.out.println(str1);
    }

    public void stringFunctionsDemo(){
        String str1= " Hello World ";
        System.out.println("String  length: "+str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1);
        System.out.println(str1.toUpperCase());
        //trim removes leading and trailing spaces
    //   String str2 = str1.trim();
        System.out.println(str1.trim());
    //    System.out.println(str1);
          
    }

}





