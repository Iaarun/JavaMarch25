package testNgDemo;

import org.testng.annotations.*;

public class ParallelExecutionDemo {

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) {
        System.out.println("Setting up tests for browser: " + browser);
        // Add setup code here, e.g., initializing WebDriver

    }

    // Example test method
    @Test
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod3() {
        System.out.println("Executing Test Method 3");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }
    @Test
    public void testMethod4() {
        System.out.println("Executing Test Method 4");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down after test execution");
        // Add teardown code here, e.g., closing WebDriver
    }

}
