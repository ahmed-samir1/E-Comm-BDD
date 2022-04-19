package com.automation.step_definitions;
import com.automation.pages.ChangeCurrency;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserChangeCurrency {

    loginPage login = new loginPage((ChromeDriver) TestBase.driver);
    ChangeCurrency changeCurrency = new ChangeCurrency((ChromeDriver) TestBase.driver);

    @Given("Logged user")
    public void logged_user(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }

    @When("User Change currency from currency menu")
    public void change_currency(){
        changeCurrency.ChangeCurrency();
    }
    @Then("Currency changes successfully")
    public void currency_change_successfully(){
       Assert.assertTrue(changeCurrency.price.getText().contains("€"));
    }
}
