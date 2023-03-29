package Webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void main(String args[]) throws IOException {
        WebDriver wd = new ChromeDriver();
        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();

        File sc = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sc, new File("C:\\Users\\sravn\\OneDrive\\Desktop\\sample\\123.png"));




    }
}
