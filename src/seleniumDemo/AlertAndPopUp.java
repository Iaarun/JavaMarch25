package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopUp {
    WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    AlertAndPopUp alertAndPopUp = new AlertAndPopUp();
    alertAndPopUp.launchChromeBrowser();
    alertAndPopUp.handlInfoAlert();
    }

    public void launchChromeBrowser() {
        // Code to launch Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void handlInfoAlert() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
        // information alert locate using id
      WebElement infoAlert= driver.findElement(By.id("my-alert"));
      infoAlert.click();
      //handle alert using Alert Interface
        // switch to alert only after the alert is displayed on the page
        Thread.sleep(2000);
      Alert alert=  driver.switchTo().alert();
      // get Text from alert
        System.out.println(alert.getText());
        //accept alert
        alert.accept();

        //Handle Confirm alert

      WebElement confirmAlert=  driver.findElement(By.id("my-confirm"));
      confirmAlert.click();
        Thread.sleep(2000);
        Alert alert1=  driver.switchTo().alert();
        System.out.println(alert1.getText());
        //accept alert
      //  alert1.accept();
        //dismiss alert
        alert1.dismiss();

        //Handle Prompt alert
        WebElement promptAlert= driver.findElement(By.id("my-prompt"));
        promptAlert.click();
        Thread.sleep(2000);
        Alert alert2=  driver.switchTo().alert();
        System.out.println(alert2.getText());
        //send data to alert
        alert2.sendKeys("Test Data");
        Thread.sleep(2000);
        //accept alert
        alert2.accept();
        //dismiss alert
        //alert2.dismiss();
        //get text from alert



    }
}
