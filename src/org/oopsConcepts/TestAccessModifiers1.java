package org.oopsConcepts;
import org.session_1._009AccessModifiers;

public class TestAccessModifiers1 extends _009AccessModifiers {
    public static void main(String[] args) {
        _009AccessModifiers obj = new _009AccessModifiers();
       // obj.test1();
     //   obj.test2();
       TestAccessModifiers1 obj1 = new TestAccessModifiers1();
        obj1.test3();
       // obj1.test2();
      //  obj1.test1(); // This will not work because test1() is private in _009AccessModifiers
      obj.test4();
    }
}
