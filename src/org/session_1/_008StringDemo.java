package org.session_1;

public class _008StringDemo {
    public static void main(String[] args) {
        _008StringDemo str = new _008StringDemo();
     //   str.stringDemo();
         str.stringDemo2();
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

      char ch=  str1.charAt(1);
        System.out.println(ch);
       //indexof   lastindexof

        System.out.println(str1.indexOf('H')) ;
        System.out.println(str1.lastIndexOf('H')) ;
        if(str1.indexOf('l')- str1.lastIndexOf('l')==0) {
            System.out.println("l is present only once");
        }else{
            System.out.println("l is present more than once");
        }
    }

    public void stringDemo2(){
        String str1="Java";
        String str2="JAVA";
        if(str1.equals(str2)) {
            System.out.println("Both are same");
        }else {
            System.out.println("Both are not same");
        }

        if(str1.equalsIgnoreCase(str2)) {
            System.out.println("Both are same");
        }else {
            System.out.println("Both are not same");
        }
        //compareTo
        //compareToIgnoreCase
        if (str1.compareTo(str2)==0){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }

        //compareToIgnoreCase
        if (str1.compareToIgnoreCase(str2)==0){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }

        String str3 = "Hello World";
        System.out.println(str3.substring(5));
        System.out.println(str3.substring(3,9));

        System.out.println(str3.replace('l','L'));

       char[] chararr=  str3.toCharArray();
       for(char ch: chararr){
           System.out.print(ch+" ");
       }

    }

}





