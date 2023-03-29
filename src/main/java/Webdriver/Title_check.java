package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_check {

    public static void main(String argss[]){


        WebDriver wd = new ChromeDriver();
        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();
        String exp_title = "OrangeHRM";
        String act_title = wd.getTitle();

        System.out.println("Title of the page is "+act_title);

        if(exp_title.equals(act_title)){
            System.out.println("Titles matched");
        }
        else {
            System.out.println("Titles didnot match");
        }

        wd.close();

    }
}
