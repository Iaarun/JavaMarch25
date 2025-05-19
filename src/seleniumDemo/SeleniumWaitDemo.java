package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
imlicit wait-
 explicit wait
 fluent wait
 */
public class SeleniumWaitDemo {
    WebDriver driver;

    public static void main(String[] args) {
        SeleniumWaitDemo seleniumWaitDemo = new SeleniumWaitDemo();
        seleniumWaitDemo.launchBrowser();
        seleniumWaitDemo.fluentWaitHandling();
    }

    public void launchBrowser() {
        System.out.println("Launching browser...");
        // Add code to launch the browser
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

    }

    public void testImplicitWait() {
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
      WebElement validatetext= driver.findElement(By.xpath("//p[contains(text(),'Done')]"));
        System.out.println(validatetext.getText());
        // Add code to perform implicit wait
    }
    public void testExplicitWait() {
        // Add code to perform explicit wait
        // polling time is 500 ms
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Done')]")));
        WebElement validatetext= driver.findElement(By.xpath("//p[contains(text(),'Done')]"));
        System.out.println(validatetext.getText());
    }

    public void fluentWaitHandling() {
        System.out.println("Performing fluent wait...");
        // Add code to perform fluent wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(50));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Done')]")));
        WebElement validatetext= driver.findElement(By.xpath("//p[contains(text(),'Done')]"));
        System.out.println(validatetext.getText());


    }

    public void closeBrowser() {
        System.out.println("Closing browser...");
        // Add code to close the browser
        driver.quit();
    }
}
