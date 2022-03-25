package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
    }
    @FindBy(className="ico-register")
    WebElement RegisterBt;
    @FindBy(id="FirstName")
    WebElement FirstName;
    @FindBy(id="LastName")
    WebElement LastName;
    @FindBy(id="Email")
    WebElement Email;
    @FindBy(id="Password")
    WebElement Password;
    @FindBy(id="ConfirmPassword")
    WebElement ConfirmPassword;
    @FindBy(id="register-button")
    WebElement RegisterBtn;
    @FindBy(className= "result")
    public WebElement SuccessMessage;
    @FindBy(className="ico-logout")
    WebElement logout;

    public  void OpenRegistrationPage(){
        RegisterBt.click();
    }

    public void Registration(String firstName, String lastName, String email, String password)
    {
        FirstName.sendKeys(firstName);
        LastName.sendKeys(lastName);
        Email.sendKeys(email);
        Password.sendKeys(password);
        ConfirmPassword.sendKeys(password);

    }

    public void ClickRegBtn(){
        RegisterBtn.click();
    }

    public void Logout(){
        logout.click();
    }

}
