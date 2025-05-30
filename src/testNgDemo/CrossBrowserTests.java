package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CrossBrowserTests {
    WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void launchBrowser(String browserName){

        if(browserName.equalsIgnoreCase("chrome")){
            System.out.println("Launching Chrome browser");
           driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("edge")){
            System.out.println("Launching Edge browser");
            driver = new EdgeDriver();
        }  else {
            System.out.println("Browser not supported");
        }

        driver.manage().window().maximize();

    }
    @Test
    public void getHomePageTitle(){
        String expectedtitle= "Swag Labs..";
          driver.get("https://www.saucedemo.com/v1/inventory.html");
        String homepageTitle=  driver.getTitle();
        System.out.println("Home page title is: " + homepageTitle);
        /*
        if(homepageTitle.equals(expectedtitle)){
            Assert.assertTrue(true);
        } else {
            Assert.fail("Home page title is not matching");
        }*/
        Assert.assertEquals(homepageTitle,expectedtitle,"Error in home page title");

        //click on  product link
        String expectedPrice ="29.99";
        driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
        String actualPrice=  driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
       Assert.assertEquals(actualPrice,expectedPrice, "Price is not matching for the product");


    }

    @Test
    public void getHomePageTitleSoftAssert(){
        // Using Soft Assert
        SoftAssert softassert= new SoftAssert();
        String expectedtitle= "Swag Labs..";
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        String homepageTitle=  driver.getTitle();
        System.out.println("Home page title is: " + homepageTitle);
        /*
        if(homepageTitle.equals(expectedtitle)){
            Assert.assertTrue(true);
        } else {
            Assert.fail("Home page title is not matching");
        }*/
        softassert.assertEquals(homepageTitle,expectedtitle,"Error in home page title");

        //click on  product link
        String expectedPrice ="29.99";
        driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
        String actualPrice=  driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
        softassert.assertEquals(actualPrice,expectedPrice, "Price is not matching for the product");
        softassert.assertAll();//

    }

    @AfterClass
    public void closeBrowser(){
        if(driver != null){
            driver.quit();
            System.out.println("Browser closed successfully");
        } else {
            System.out.println("No browser to close");
        }
    }
}
