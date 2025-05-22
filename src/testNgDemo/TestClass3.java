package testNgDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 {

    @Test
    public void testMethod() {
        System.out.println("This is a test method.");
    }

    @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method.");
    }

   @BeforeMethod
    public void test1() {
        System.out.println("This is BeforeMethod method.");
    }
    @AfterMethod
    public void test2() {
        System.out.println("This is AfterMethod method.");
    }
}
