package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendData {
WebDriver driver;

    public static void main(String[] args) {
        SendData sendData = new SendData();
        sendData.launchChromeBrowser();
        sendData.getErrorText();
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
}
