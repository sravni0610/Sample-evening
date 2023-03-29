package Webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Multisc {
    public static void main(String args[]) throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);

        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");

        wd.manage().window().maximize();

        List<WebElement> link = wd.findElements(By.tagName("a"));

        for(int i=00;i<link.size();i++){
            if(link.get(i).isDisplayed()){

                String linkname = link.get(i).getText();

                link.get(i).click();

                File srcfile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(srcfile,new File("C:\\Users\\sravn\\OneDrive\\Desktop\\sample\\multi\\"+linkname+".png"));

                wd.navigate().back();
                link = wd.findElements(By.tagName("a"));

            }
        }

    }
}
