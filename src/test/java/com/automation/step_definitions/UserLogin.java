package com.automation.step_definitions;
import com.automation.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserLogin {
    loginPage login = new loginPage((ChromeDriver) Hooks.driver);


    @Given("User go to login page")
    public void go_to_login_page()  {
    login.OpenLoginPage();
    }

    @When("User enter valid user data with valid@example.com and P@ssw0rd")
    public void valid_username_password()
    {
        login.UserLogin("Ahmed@gmail.com","123456");
    }

    @And("User click login button")
    public void login_button()
    {
        login.ClickLoginBtn();
    }

    @Then("User login successfully")
    public void success_login()
    {
        String ExpectedMesg = "My account";
        String Actual = login.SuccessLogin.getText();
        Assert.assertEquals(ExpectedMesg, Actual);
    }

}
