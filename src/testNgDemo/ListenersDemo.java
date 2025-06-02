package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNgDemo.ListenersTestNG.class)
public class ListenersDemo {
    WebDriver driver;

    @BeforeMethod
    public void setDriver(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void getHomepageTitleTest(){
        String homePageTitle=  driver.findElement(By.xpath("//div[@class='page-title']/h2")).getText();
        String expectedTitle = "THIS IS DEMO SITE FOR";
        System.out.println("Home Page Title: " + homePageTitle);
        Assert.assertEquals(homePageTitle, expectedTitle);

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
