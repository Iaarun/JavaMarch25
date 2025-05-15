package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleWebTable {
    WebDriver driver;

    public static void main(String[] args) {
        HandleWebTable handleWebTable = new HandleWebTable();
        handleWebTable.launchChromeBrowser();
        handleWebTable.handleWebTable();
    }

    public void launchChromeBrowser() {
        // Code to launch Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void handleWebTable() {
        driver.navigate().to("https://www.moneycontrol.com/markets/indian-indices/");
        // locate table using xpath
         WebElement table = driver.findElement(By.xpath("//table[@id='indicesTable']"));
        //get the no columns
         List<WebElement> columns = table.findElements(By.tagName("th"));
        // print number of columns
        System.out.println("Number of columns: " + columns.size());

        // get the no rows
      List<WebElement> rows=  table.findElements(By.tagName("tr"));
        // print number of rows
        System.out.println("Number of rows: " + rows.size());

        //print header names
        for(int i=1;i<=columns.size();i++){
            String headerName= table.findElement(By.xpath("//table[@id='indicesTable']/thead/tr/th["+i+"]")).getText();
            System.out.print(headerName+" ");
        }

        //print names of all the companies
        for(int i=1;i<rows.size();i++){
            String companyName= table.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr["+i+"]/td[1]")).getText();
            System.out.println(companyName);
        }
        System.out.println("-----------------------------------");
        // print all the data in the table
        for (int i = 1; i < rows.size(); i++) {
            for (int j = 1; j < columns.size(); j++) {
                String cellData = table.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.print(cellData + " ");
            }
            System.out.println();
        }




        // List<WebElement> rows = table.findElements(By.tagName("tr"));
        // get number of columns
        // List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
        // print number of rows and columns
        // System.out.println("Number of rows: " + rows.size());
        // System.out.println("Number of columns: " + columns.size());
    }
}
