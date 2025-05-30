package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsAttribute {

    @Test(priority = 2)
    public void setUp(){
        System.out.println("Setting up the test environment.");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "setUp", priority = 1)
    public void testMethod1() {
        System.out.println("Executing test method 1.");
    }

}
