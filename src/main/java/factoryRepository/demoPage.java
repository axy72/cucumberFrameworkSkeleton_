package factoryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoPage {

    @FindBy(id="name")
    WebElement txt_username;

    @FindBy(id="password")
    WebElement txt_password;

    @FindBy(id="login")
    WebElement btn_login;

    WebDriver driver;

    public demoPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
    public void enterUsername(String uname){
        txt_username.sendKeys(uname);
    }

    public void enterPassword(String pass){
        txt_password.sendKeys(pass);
    }

    public void clickOnLogin(){
        btn_login.click();
    }
}
