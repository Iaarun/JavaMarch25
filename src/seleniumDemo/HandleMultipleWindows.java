package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Set;

public class HandleMultipleWindows {
    WebDriver driver;

    public static void main(String[] args) {
        HandleMultipleWindows obj = new HandleMultipleWindows();
        obj.launchBrowser();
        obj.handleMultipleWindows();
    }

    public void launchBrowser() {
        System.out.println("Launching browser...");
        // Add code to launch the browser
         driver = new ChromeDriver();
         driver.manage().window().maximize();

    }

    public void handleMultipleWindows(){
        driver.get("https://www.selenium.dev/");
       String homePageTitle=  driver.getTitle();
        System.out.println("Home page title: "+homePageTitle);
        String homepageID= driver.getWindowHandle();
        System.out.println("Home page ID: "+homepageID);
        //control+click on the link to open in  new tab
      WebElement downloadsLInk=  driver.findElement(By.linkText("Downloads"));
        Actions action= new Actions(driver);
        action.moveToElement(downloadsLInk).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        //get all the window handles
       Set<String>allwindowhandles= driver.getWindowHandles();
       /*
       for(String id: allwindowhandles){
           if(!(id.equals(homepageID))){
               driver.switchTo().window(id);
               System.out.println(driver.getCurrentUrl());
           }
       }
       driver.switchTo().window(homepageID);
        System.out.println(driver.getCurrentUrl());
        */


        //SWITCH TO window when you have more than two windows
        ArrayList<String> tabs= new ArrayList<>(allwindowhandles);
      String firstID=  tabs.iterator().next();
     String secondId= tabs.iterator().next();
        System.out.println(secondId);
     driver.switchTo().window(secondId);
        System.out.println(driver.getCurrentUrl());
    }
}
