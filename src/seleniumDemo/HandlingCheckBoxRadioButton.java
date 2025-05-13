package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class HandlingCheckBoxRadioButton {

WebDriver driver;

    public static void main(String[] args) {
        HandlingCheckBoxRadioButton handlingCheckBoxRadioButton = new HandlingCheckBoxRadioButton();
        handlingCheckBoxRadioButton.launchChromeBrowser();
        handlingCheckBoxRadioButton.checkIfImageIsDisplayed();
        //handlingCheckBoxRadioButton.closeBrowser();
    }
    public void launchChromeBrowser() {
        // Code to launch Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void CheckBox(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
      WebElement cbox2= driver.findElement(By.id("my-check-2"));
      //check if checkbox is selected
        System.out.println("Is checkbox selected: "+cbox2.isSelected());
      cbox2.click();
        System.out.println("Is checkbox selected: "+cbox2.isSelected());
    }

    public void selectMultipleCheckbox(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        //locate all checkboxes on page
      List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
      checkboxes.forEach(checkbox->{
          //check if it is selected
          System.out.println("Name of checkbox is: "+checkbox.getAttribute("id"));
          if(!checkbox.isSelected()){
              checkbox.click();
          }
      });
    }

    public void findingElementsUsingRelativeLocator(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
       WebElement password= driver.findElement(By.name("my-password"));
      WebElement userName= driver.findElement(RelativeLocator.with(By.tagName("input")).above(password));
      userName.sendKeys("testuser");
    }

    public void radioButton(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        //locate radio button using id
        WebElement radioButton= driver.findElement(By.id("my-radio-2"));
        //check if radio button is selected
        System.out.println("Is radio button selected: "+radioButton.isSelected());
        //click on radio button
        radioButton.click();

    }

    public void disabledInputField(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        //locate disabled input field using id
      WebElement disableInput=  driver.findElement(By.name("my-disabled"));
      //check if field is enabled
       if (disableInput.isEnabled()){
           disableInput.sendKeys("testuser");
       }else{
           System.out.println("Field is disabled");
       }
    }

    public void checkIfImageIsDisplayed() {
        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        //locate image using id
        WebElement image = driver.findElement(By.xpath("//img[contains(@src, 'hands-on-icon.png')]"));
        //check if image is displayed
        if (image.isDisplayed()) {
            System.out.println("Image is displayed");
        } else {
            System.out.println("Image is not displayed");

        }
    }
    }

