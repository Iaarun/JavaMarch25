package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        LaunchBrowser launchBrowser = new LaunchBrowser();
      //  launchBrowser.launchEdgeBrowser();
        launchBrowser.launchChromeBrowser();
      //  launchBrowser.launchFirefoxBrowser();

    }

    public void launchChromeBrowser(){
        //Before selenium 4.11 user need to set the system property for browserDriver
    //    String chromeDriverPath = "E:\\projectjars\\chromedrivers\\chromedriver-win64\\chromedriver.exe";
    //    System.setProperty("webDriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //launch application
        driver.get("https://www.saucedemo.com/");

    }

    public void launchFirefoxBrowser() {
        //Before selenium 4.11 user need to set the system property for browserDriver
        WebDriver driver = new FirefoxDriver();
    }

    public void launchEdgeBrowser() {
        //Before selenium 4.11 user need to set the system property for browserDriver
        WebDriver driver = new EdgeDriver();
    }
}
