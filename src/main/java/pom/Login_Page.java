package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    WebDriver driver;

    @FindBy(id = "txtUsername")
    public WebElement userid;

    @FindBy(id="txtPassword")
    public WebElement pwd;

    @FindBy(id="btnLogin")
    public WebElement loginbtn;


    public void login(String id,String pswd){
        userid.sendKeys(id);
        pwd.sendKeys(pswd);
        loginbtn.click();
    }


    public Login_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
