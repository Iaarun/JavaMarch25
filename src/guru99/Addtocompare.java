package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addtocompare {

    WebDriver driver;
    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void clickonAddtoCompare(){
           driver.navigate().to("https://live.techpanda.org/index.php/checkout/cart/");
           driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
           driver.findElement(By.xpath("(//a[@class='link-compare'][normalize-space()='Add to Compare'])[1]")).click();
           driver.navigate().back();
              driver.findElement(By.xpath("(//a[@class='link-compare'][normalize-space()='Add to Compare'])[2]")).click();
    }
}
