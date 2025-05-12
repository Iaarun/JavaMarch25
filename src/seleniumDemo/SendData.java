package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SendData {
WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        SendData sendData = new SendData();
        sendData.launchChromeBrowser();
        sendData.findElementUsingXpath();
        //sendData.closeBrowser();
    }
    public void launchChromeBrowser() {
        // Code to launch Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

      public void loginApp(){
        driver.navigate().to("https://www.saucedemo.com/");
        //locate username field using id
        WebElement username= driver.findElement(By.id("user-name"));
        //send data to username field
          username.sendKeys("standard_user");
        //locate password field using name
       WebElement passwordField=  driver.findElement(By.name("password"));
       passwordField.sendKeys("secret_sauce");
       //locate login button using class name
       WebElement login_Btn=   driver.findElement(By.name("login-button"));
       //click on login button
         // login_Btn.click();
          login_Btn.submit();

      }

      public void getErrorText(){
          driver.navigate().to("https://www.saucedemo.com/");
          //locate username field using id
          WebElement username= driver.findElement(By.id("user-name"));
          //send data to username field
          username.sendKeys("standard_user");
          //locate password field using name
          WebElement passwordField=  driver.findElement(By.name("password"));
          passwordField.sendKeys("secret_sauce1234");
          //locate login button using class name
          WebElement login_Btn=   driver.findElement(By.name("login-button"));
          //click on login button
          // login_Btn.click();
          login_Btn.submit();
          //locate error message using xpath
        WebElement error=  driver.findElement(By.xpath("//h3[@data-test='error']"));
        //getText() method returns the text of the element
         String errorMessage= error.getText();
          System.out.println("Error message is: " + errorMessage);

      }

      public void findElementUsingLinkTextAndPartialLinkText() throws InterruptedException {
        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/");
        //locate link using link text
         WebElement dropDownMenu= driver.findElement(By.linkText("Dropdown menu"));
            //click on link
          dropDownMenu.click();
          Thread.sleep(2000);
          driver.navigate().back();
       WebElement canvas=   driver.findElement(By.partialLinkText("in canvas"));
       canvas.click();

      }

      public void findMultipleElementsUsingA(){
          driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/");
          //all links using tag name
         List<WebElement> allLinks= driver.findElements(By.tagName("a"));
            System.out.println("Total number of links are: " + allLinks.size());
            //print all links
           for(WebElement link:allLinks){
               System.out.println("Link text :"+ link.getText()+" and link is: "+link.getAttribute("href"));
           }

      }

      public void findElementUsingXpath(){
        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/");
        //locate link using xpath
        WebElement incanvas= driver.findElement(By.xpath("//a[contains(@href,'in-canvas')]"));
        //click on link
          //getText() method returns the text of the element
          String text= incanvas.getText();
          System.out.println("Text is: " + text);
          incanvas.click();


      }
}
