package com.automation.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
    public loginPage(ChromeDriver driver) {
            this.driver= driver;
            PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
        }

        @FindBy(className="ico-login")
        WebElement LoginBt;
        @FindBy(id="Email")
        WebElement Email;
        @FindBy(id="Password")
        WebElement Password;
        @FindBy(className= "ico-account")
        public WebElement SuccessLogin;

        public  void OpenLoginPage(){
            LoginBt.click();
        }
        public void UserLogin(String email, String password){
            Email.sendKeys(email);
            Password.sendKeys(password);

        }

        public void ClickLoginBtn()
        {
            Password.sendKeys(Keys.ENTER);
        }


    }

