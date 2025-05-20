package seleniumDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class ScreenShotDemo {
    WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
      String filePath= "E:\\screenshot\\demoScreenshot.png";

      ScreenShotDemo obj = new ScreenShotDemo();
      obj.launchBrowser();
      obj.captureScreenShot(filePath);
        filePath= "E:\\screenshot\\afterdemoScreenshot.png";
        obj.performDoubleClick();
        obj.captureScreenShot(filePath);

    }

    public void launchBrowser() {
        System.out.println("Launching browser...");
        // Add code to launch the browser
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
    }

    public void captureScreenShot(String filePAth) throws IOException {
        System.out.println("Capturing screenshot...");
        // Add code to capture screenshot
        // Use TakesScreenshot interface to capture screenshot
        //casting driver to TakesScreenshot Interface
        TakesScreenshot ts= (TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(filePAth));

    }

    public void performDoubleClick() throws InterruptedException, IOException {
        System.out.println("Performing double click...");
        // Add code to perform double click
        WebElement ele_doubleClick = driver.findElement(By.id("my-dropdown-3"));
        Actions action = new Actions(driver);
        // action.moveToElement(ele_doubleClick).doubleClick().build().perform();
        action.doubleClick(ele_doubleClick).perform();
        //screenshot of a element
        File file= ele_doubleClick.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("E:\\screenshot\\doubleclick.png"));
    }
}
