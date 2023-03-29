package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();
        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();
        Actions action = new Actions(wd);
        WebElement pim = wd.findElement(By.id("menu_pim_viewPimModule"));
        WebElement conf = wd.findElement(By.id("menu_pim_Configuration"));
        WebElement empllist = wd.findElement(By.id("menu_pim_viewEmployeeList"));
        action.moveToElement(pim).moveToElement(empllist).moveToElement(conf).build().perform();
        wd.findElement(By.id("menu_admin_pimCsvImport")).click();
    }
}
