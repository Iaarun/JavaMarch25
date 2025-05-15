package seleniumDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class FramesDragAndDrop {
    WebDriver driver;
    public static void main(String[] args) {
                    FramesDragAndDrop framesDragAndDrop = new FramesDragAndDrop();
                    framesDragAndDrop.launchChromeBrowser();
                    framesDragAndDrop.handleTooltip();
    }
    public void launchChromeBrowser() {
        // Code to launch Chrome browser
         driver = new ChromeDriver();
         driver.manage().window().maximize();
    }

    public void handlingFrames(){
        driver.navigate().to("https://jqueryui.com/droppable/");
        //using index to switch to frame
     //   driver.switchTo().frame(0);
        // using webelement to switch to frame
     WebElement pageframe=   driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
      driver.switchTo().frame(pageframe);
      WebElement drop= driver.findElement(By.id("droppable"));
      System.out.println(drop.isDisplayed());
      //come out of frame
        driver.switchTo().defaultContent();
      // is logo displayed
      WebElement logo=  driver.findElement(By.xpath("//h2[@class='logo']"));
        System.out.println(logo.isDisplayed());
        //driver.switchTo().parentFrame();
    }

    public void dragAndDrop(){
        driver.navigate().to("https://jqueryui.com/droppable/");
        //using index to switch to frame
        driver.switchTo().frame(0);
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.id("droppable"));
        //drag and drop
        Actions action = new Actions(driver);
    //    action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
        action.dragAndDrop(drag, drop).perform();

    }

    public void handleSlider(){
        driver.navigate().to("https://jqueryui.com/slider/");
        //using index to switch to frame
        driver.switchTo().frame(0);
        WebElement slider= driver.findElement(By.xpath("//div[@id='slider']/span"));

         Actions action = new Actions(driver);
        //move slider to right
        action.clickAndHold(slider).moveByOffset(500,0).release().build().perform();
        action.clickAndHold(slider).moveByOffset(-400,0).release().build().perform();
    }

    public void handleTooltip(){
        driver.navigate().to("https://jqueryui.com/tooltip/");
        //using index to switch to frame
        driver.switchTo().frame(0);
        WebElement age= driver.findElement(By.xpath("//input[@id='age']"));
        //using actions class to move to element
        Actions action = new Actions(driver);
        //mouse hover on element
      //  action.moveToElement(age).perform();
       WebElement tooltip=  driver.findElement(By.xpath("//div[@role='tooltip']"));
        //get tooltip text
        System.out.println("Tooltip text is: "+tooltip.getText());
      //  action.click(age).sendKeys(Keys.DOWN).sendKeys(Keys.SHIFT,"test").build().perform();
      //  action.click(age);
      //  action.KeyDown(Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
     //   action.click(age).KeyDown(Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();

     //   Dimension size= age.getSize();





    }
}
