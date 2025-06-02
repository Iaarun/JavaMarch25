package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
//(retryAnalyzer = RetryAnalyzer.class)
    @Test
    public void testMethod1() {
        System.out.println("Executing test method 1.");
        // Simulating a failure
        Assert.assertTrue(false, "Test method 1 failed");
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing test method 2.");
       Assert.assertTrue(false);
    }

    @Test
    public void testMethod3() {
        System.out.println("Executing test method 3.");
        // Simulating a failure
        Assert.assertTrue(true, "Test method 3 failed due to an assertion error.");
    }
    @Test
    public void testMethod4() {
        System.out.println("Executing test method 4.");
        // Simulating a failure
        Assert.assertTrue(true, "Test method 4 failed due to an assertion error.");
    }
}
