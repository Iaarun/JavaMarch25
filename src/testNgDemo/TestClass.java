package testNgDemo;

import org.testng.annotations.*;

public class TestClass {

    @Test
    public void testMethod() {
        System.out.println("This is a test method.");
    }

   @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method.");
    }

    @BeforeSuite
    public void test1() {
        System.out.println("This is BeforeSuite method.");
    }

    @AfterSuite
    public void test2() {
        System.out.println("This is AfterSuite method.");
    }

    @BeforeClass
    public void test3() {
        System.out.println("This is BeforeClass method.");
    }
    @AfterClass
    public void test4() {
        System.out.println("This is AfterClass method.");
    }

    @BeforeTest
    public void test5() {
        System.out.println("This is BeforeTest method.");
    }
    @AfterTest
    public void test6() {
        System.out.println("This is AfterTest method.");
    }
    @BeforeMethod
    public void test7() {
        System.out.println("This is BeforeMethod method.");
    }
    @AfterMethod
    public void test8() {
        System.out.println("This is Aftermethod.");
    }
}
