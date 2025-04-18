package org.session_1;

public class _009AccessModifiers {

    private String UID;

    public static void main(String[] args) {
        _009AccessModifiers obj = new _009AccessModifiers();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();

    }
    private void test1(){
        System.out.println("This is private method");
    }

    void test2(){
        System.out.println("This is default method");
    }

    protected void test3(){
        System.out.println("This is protected method");
    }
    public void test4(){

        System.out.println("This is public method");

    }

}
