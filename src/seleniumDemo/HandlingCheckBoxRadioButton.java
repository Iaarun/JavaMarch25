package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingCheckBoxRadioButton {

WebDriver driver;

    public static void main(String[] args) {
        HandlingCheckBoxRadioButton handlingCheckBoxRadioButton = new HandlingCheckBoxRadioButton();
        handlingCheckBoxRadioButton.launchChromeBrowser();
        handlingCheckBoxRadioButton.selectMultipleCheckbox();
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
}
