package com.automation.step_definitions;
import com.automation.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserRegisteration {

    RegisterPage register = new RegisterPage((ChromeDriver) TestBase.driver);

    @Given("User go to registration page")
    public void click_on_register_link(){
       register.OpenRegistrationPage();
    }

    @When("User enter the user data")
    public void enter_user_data(){
        register.Registration("Ahmed","Mohamed","Ahmed@gmail.com","123456");
    }

    @When("User click register button")
    public void click_register_button() {
     register.ClickRegBtn();
    }

    @Then("User Register Successfully")
    public void successful_registration() throws InterruptedException {
        String ExpectedMesg = "Your registration completed";
        String Actual = register.SuccessMessage.getText();
        Assert.assertEquals(ExpectedMesg, Actual);
        register.Logout();

    }



}
