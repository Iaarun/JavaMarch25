package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownMenu {
    WebDriver driver;
    public static void main(String[] args) {
        DropDownMenu dropDownMenu = new DropDownMenu();
        dropDownMenu.launchChromeBrowser();
        dropDownMenu.handleDropDownMenu();
    }

    public void launchChromeBrowser() {
        // Code to launch Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void handleDropDownMenu(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        //locate dropdown using name
      WebElement dropDown=  driver.findElement(By.name("my-select"));
      //Use select class to handle dropdown
        Select select = new Select(dropDown);
        //get the first selected option or default selected option
      WebElement firstOption=  select.getFirstSelectedOption();
        System.out.println("First selected option is: "+firstOption.getText());
        //get all options in dropdown
       List<WebElement> allOptions= select.getOptions();
        System.out.println("All options from Dropdown are: ");
        allOptions.stream().forEach(option->{
            System.out.println(option.getText());
        });

        //select option by index
        select.selectByIndex(1);
        select.selectByValue("3");
        select.selectByVisibleText("Open this select menu");
         //print selected option
        WebElement selectedOption= select.getFirstSelectedOption();
        System.out.println("Final Selected option is: "+selectedOption.getText());
        //check if it is multiple select dropdown
        if(select.isMultiple()){
            System.out.println("This is a multiple select dropdown");
        }else
            System.out.println("This is a single select dropdown");
        }
        // works only with multiple select dropdown
        //deselect option by index
      // select.deselectByIndex(1);
        //deselect option by value
      //  select.deselectByValue("3");
        //deselect option by visible text
      //  select.deselectByVisibleText("Open this select menu");


    }



