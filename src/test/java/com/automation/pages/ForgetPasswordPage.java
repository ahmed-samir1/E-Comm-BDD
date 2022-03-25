package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {
    WebDriver driver;
    public ForgetPasswordPage(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
    }

    @FindBy(className="ico-login")
    WebElement LoginBt;
    @FindBy(css="a[href=\"/passwordrecovery\"]")
    WebElement ForgetPasswordBt;
    @FindBy(id="Email")
    WebElement Email;
    @FindBy(name="send-email")
    WebElement RecoverBt;
    @FindBy(className="content")
    public WebElement RecoverSuccessfullyMesg;


    public  void OpenLoginPage(){
        LoginBt.click();
    }

    public void ClickForgetPassword(){
        ForgetPasswordBt.click();
    }

    public void EnterUserEmail(String email){
        Email.sendKeys(email);
    }

    public void ClickRecoverPass(){
        RecoverBt.click();
    }

}
