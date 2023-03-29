package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {
    public static void main(String args[]){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        Login_Page lp = new Login_Page(driver);
        Home_page hp = new Home_page(driver);

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

        lp.login("admin","admin");




    }
}
