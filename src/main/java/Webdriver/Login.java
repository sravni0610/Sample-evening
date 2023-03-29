package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String args[]){


        //System.setProperty("webdriver.chrome.driver","C:\\Users\\sravn\\OneDrive\\Documents\\Chrome\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();
        //wd.findElement(By.linkText("Forgot your password?")).click();
        wd.findElement(By.partialLinkText("Forgot")).click();
        //wd.close();





    }
}
