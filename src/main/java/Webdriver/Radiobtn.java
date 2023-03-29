package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

    public static void main(String args[]) throws InterruptedException {

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");
        wd.manage().window().maximize();
        wd.findElement(By.name("cloanamount")).clear();
        wd.findElement(By.name("cloanamount")).sendKeys("30000");
        wd.findElement(By.name("cloanterm")).clear();
        wd.findElement(By.name("cloanterm")).sendKeys("33");
        wd.findElement(By.name("cremainingyear")).clear();
        wd.findElement(By.name("cremainingyear")).sendKeys("8");

        System.out.println("Radio btn 1 is clicked "+ wd.findElement(By.id("cpayoff1")).isSelected());
        System.out.println("Radio btn 1 is clicked "+ wd.findElement(By.id("cpayoff2")).isSelected());
        System.out.println("Radio btn 1 is clicked "+ wd.findElement(By.id("cpayoff3")).isSelected());
        System.out.println("Radio btn 1 is clicked "+ wd.findElement(By.id("cpayoff4")).isSelected());
        Thread.sleep(4000);
        wd.findElement(By.xpath("(//*[contains(text(),'Normal repayment')])[1]")).click();
        wd.findElement(By.xpath("(//*[@value='Calculate'])[1]")).click();
    }
}
