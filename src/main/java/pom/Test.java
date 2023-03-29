package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String args[]){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        String url = "https://www.calculator.net/payment-calculator.html";

        driver.get(url);
        driver.manage().window().maximize();
        Mortgagepage.loaonamt(driver).clear();
        Mortgagepage.loaonamt(driver).sendKeys("89839");

    }
}
