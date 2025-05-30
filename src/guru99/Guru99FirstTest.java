package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Guru99FirstTest {
    WebDriver driver;
    public static void main(String[] args) {
        Guru99FirstTest obj = new Guru99FirstTest();
        obj.launchBrowser("chrome");
        obj.launchURL("https://live.techpanda.org/index.php/");
        obj.getHomepageTitle();
        obj.clickOnMobileLink();
        obj.getMobilePageTitle();
        obj.selectValueInSortByDropDown("Name");
        obj.validateListisSorted();
      //  obj.closeBrowser();

    }

    public void launchBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            // Add code to launch Firefox browser
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")){
            // Add code to launch Edge browser
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser name");

        }

        driver.manage().window().maximize();

    }

    public void closeBrowser(){
        System.out.println("Closing browser...");
        driver.quit();
    }

    public void launchURL(String url){
        System.out.println("Launching URL: " + url);
        driver.get(url);
    }

    public void getHomepageTitle(){
      String homePageTitle=  driver.findElement(By.xpath("//div[@class='page-title']/h2")).getText();
      String expectedTitle = "THIS IS DEMO SITE FOR";
        System.out.println("Home Page Title: " + homePageTitle);
        if(expectedTitle.trim().equalsIgnoreCase(homePageTitle.trim())) {
            System.out.println("Home Page Title is not matched");
        } else {
            System.out.println("Home Page Title is not matched");
        }

    }

    public void clickOnMobileLink(){
        System.out.println("Clicking on Mobile link...");
        driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
      //  driver.findElement(By.linkText("Mobile")).click();
    }

    public void getMobilePageTitle(){
        String mobilePageTitle=  driver.findElement(By.xpath("//div[@class='page-title category-title']/h1")).getText();
       String expectedMobilePageTitle = "MOBILE";
        System.out.println("Mobile Page Title: " + mobilePageTitle);
        if(expectedMobilePageTitle.equalsIgnoreCase(mobilePageTitle)) {
            System.out.println("Mobile Page Title is matched");
        } else {
            System.out.println("Mobile Page Title is not matched");
        }
    }

    public void selectValueInSortByDropDown(String value){
        System.out.println("Selecting value in Sort By dropdown...");
         WebElement sortByDropDown= driver.findElement(By.xpath("//select[@title='Sort By']"));
        Select select= new Select(sortByDropDown);
        select.selectByVisibleText(value);

    }

    public void  validateListisSorted(){
        ArrayList<String> phoneNames= new ArrayList<>();
        String expectederrorMessage = "Some of the products cannot be ordered in requested quantity.";
        String actualErrorMessage = driver.findElement(By.xpath("//li[@class='error-msg']/ul/li/span")).getText();
     List<WebElement> names= driver.findElements(By.xpath("//h2[@class='product-name']/a"));
       for(WebElement ele:names){
           phoneNames.add(ele.getText());
       }
        System.out.println("Phone names list : " + phoneNames);

     boolean isSorted=  phoneNames.stream().sorted().toList().equals(phoneNames);

     if (isSorted) {
         System.out.println("Products are sorted by name");
     } else {
         System.out.println("Products are not sorted by name");
     }
        if(actualErrorMessage.equalsIgnoreCase(expectederrorMessage)){
            System.out.println("Error message is not matched");
        } else {
            System.out.println("Error message is not matched");
        }
    }





}
