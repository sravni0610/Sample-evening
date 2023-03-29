package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dropdown {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.amazon.co.uk/");
        wd.manage().window().maximize();
        WebElement drop = wd.findElement(By.id("searchDropdownBox"));

        List<WebElement> dropd = drop.findElements(By.tagName("option"));

        System.out.println(dropd.size());

        for(int i=0;i<dropd.size();i++){
            System.out.println(dropd.get(i).getText());
        }

        wd.findElement(By.id("searchDropdownBox")).sendKeys("Books");
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("HarryPotter");
        wd.findElement(By.id("nav-search-submit-button")).click();

    }
}
