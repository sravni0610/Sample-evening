package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mortgagepage {

    private static WebElement element = null;
    WebDriver driver;

    public static WebElement loaonamt(WebDriver driver){

        element = driver.findElement(By.id("cloanamount"));

        return element;
    }


    public static WebElement loanterm(WebDriver driver){
        element = driver.findElement(By.id("cloanterm"));

        return element;

    }

}
