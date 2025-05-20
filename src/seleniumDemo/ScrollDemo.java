package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {
    WebDriver driver;

    public static void main(String[] args) {
        ScrollDemo obj = new ScrollDemo();
        obj.launchBrowser();
        obj.scrollToBottom();
    }
    public void launchBrowser() {
        System.out.println("Launching browser...");
        // Add code to launch the browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
    }

    public void randonscroll(){
        System.out.println("Performing random scroll...");
        // Add code to perform random scroll
        // Scroll down by 500 pixels
        //caste driver to javascript executor
       JavascriptExecutor js= ((JavascriptExecutor) driver);
       js.executeScript("window.scrollBy(0, 500);");
        // Scroll up by 500 pixels
       // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -500);");
    }

    public void scrollToElement() {
        System.out.println("Performing scroll to element...");
        // Add code to perform scroll to element
        //locate the element which you want to scroll
     WebElement news= driver.findElement(By.xpath("//h2[contains(text(),'News')]"));
      JavascriptExecutor js=  ((JavascriptExecutor) driver);
      js.executeScript("arguments[0].scrollIntoView(true);", news);

    }

    public void scrollToBottom() {
        System.out.println("Performing scroll to bottom...");
        // Add code to perform scroll to bottom
        // Scroll to the bottom of the page
      JavascriptExecutor js=  ((JavascriptExecutor) driver);
      js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
