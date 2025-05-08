package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class BasicFunctions {
    WebDriver driver;
    public static void main(String[] args) {
            BasicFunctions basicFunctions = new BasicFunctions();
            basicFunctions.launchChromeBrowser();
            basicFunctions.basicDrvingFunctions();
            basicFunctions.closeBrowser();

    }

    public void launchChromeBrowser() {
        // Code to launch Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void basicDrvingFunctions() {
        // Code to perform basic driving functions
        driver.get("https://www.saucedemo.com/");
        // getTitle() method returns the title of the current page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        // getCurrentUrl() method returns the URL of the current page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        // getPageSource() method returns the source code of the current page
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);
        // getWindowHandle() method returns the window handle of the current window
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window handle is: " + windowHandle);
        //launch multiple tabs
        driver.switchTo().newWindow(WindowType.TAB);
        // getWindowHandles() method returns the window handles of all open windows
      Set<String> allId= driver.getWindowHandles();
        System.out.println("All window handles are: " + allId);

    }

    public void closeBrowser() {

        // driver.close(); // Close the current window
       // driver.close();
        // Code to close the browser
      //  driver.quit();
    }
}
