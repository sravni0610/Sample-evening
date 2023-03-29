package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Presence {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();
        wd.get("http://18.133.94.104:3000/");
        wd.manage().window().maximize();
        String str = "patients";
        String pgsrc = wd.getPageSource();
        System.out.println(pgsrc);

        System.out.println("*******************************");
        if (pgsrc.contains(str)){
            System.out.println("Element is present in the page");
        }

        else {
            System.out.println("Element is not available");
        }

    }
}
