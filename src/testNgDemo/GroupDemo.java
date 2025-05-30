package testNgDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupDemo {
    @Test(groups = {"smoke","login"})
    public void testMethod1() {
        System.out.println("This is test method 1.");
    }
    @Test(groups = "smoke")
    public void testMethod2() {
        System.out.println("This is test method 2.");
    }
    @Test(groups = {"regression"})
    public void testMethod3() {
        System.out.println("This is test method 3.");
    }
    @Test(groups = "regression")
    public void testMethod4() {
        System.out.println("This is test method 4.");
    }

    @Test(groups = "regression")
    public void testMethod5() {
        System.out.println("This is test method 5.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is a method that runs before each test method.");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("This is a method that runs after each test method.");
    }
}
