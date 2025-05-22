package testNgDemo;

import org.testng.annotations.*;

public class TestClass2 {

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

    @BeforeClass
    public void test3() {
        System.out.println("This is BeforeClass method.");
    }
    @AfterClass
    public void test4() {
        System.out.println("This is AfterClass method.");
    }
}
