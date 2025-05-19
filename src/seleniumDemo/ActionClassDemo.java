package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ActionClassDemo actionClassDemo = new ActionClassDemo();
        actionClassDemo.launchBrowser();
       actionClassDemo.performDoubleClick();
    }

    public void launchBrowser() {
        System.out.println("Launching browser...");
        // Add code to launch the browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
    }

    public void performLeftClick() throws InterruptedException {
      WebElement ele_leftClick= driver.findElement(By.id("my-dropdown-1"));
      //left click
      ele_leftClick.click();
      Thread.sleep(2000);
        Actions actions= new Actions(driver);
        actions.moveToElement(ele_leftClick).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).click().perform();
        Thread.sleep(2000);
    }

    public  void performRightClick() throws InterruptedException {
        System.out.println("Performing right click...");
        // Add code to perform right click
        WebElement ele_rightClick = driver.findElement(By.id("my-dropdown-2"));
        Actions action = new Actions(driver);
        action.moveToElement(ele_rightClick).contextClick().build().perform();
    }

    public void performDoubleClick() throws InterruptedException {
        System.out.println("Performing double click...");
        // Add code to perform double click
        WebElement ele_doubleClick = driver.findElement(By.id("my-dropdown-3"));
        Actions action = new Actions(driver);
       // action.moveToElement(ele_doubleClick).doubleClick().build().perform();
        action.doubleClick(ele_doubleClick).perform();
    }
}
