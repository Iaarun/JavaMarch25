package testNgDemo;

import org.testng.annotations.*;

public class PriorityDemo {

    @Test(priority = 1)
    public void testMethod() {
        System.out.println("This is a test method.");
    }

    @Test(priority = 2)
    public void anotherTestMethod() {
        System.out.println("This is another test method.");
    }

    @Test(priority = 3)
    public void thirdTestMethod() {
        System.out.println("This is the third test method.");
    }
    @Test (priority = 4, enabled = false)
    public void fourthTestMethod() {
        System.out.println("This is the fourth test method.");
    }
    @Test (priority = 5, timeOut = 2000)
    public void fifthTestMethod() throws InterruptedException {
        Thread.sleep(1000); // Simulating a delay
        System.out.println("This is the fifth test method.");
    }
    @Test (priority = 6, invocationCount = 3 )
    public void sixthTestMethod() {
        System.out.println("This method sixth test method.");
    }

}
