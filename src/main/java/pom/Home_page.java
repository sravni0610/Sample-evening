package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

    WebDriver driver;


    public Home_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}