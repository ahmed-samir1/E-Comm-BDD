package com.automation.step_definitions;
import com.automation.pages.ForgetPasswordPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ForgetPassword {

    ForgetPasswordPage RecoverPass = new ForgetPasswordPage((ChromeDriver) Hooks.driver);
    @When("User goes to login page")
    public void go_to_login_page(){
        RecoverPass.OpenLoginPage();
    }

    @When("User click on forget password button")
    public void click_forget_password(){
        RecoverPass.ClickForgetPassword();
    }

    @When("User enter valid user email")
    public void enter_valid_email(){
        RecoverPass.EnterUserEmail("Ahmed@gmail.com");
    }

    @When("User click recover button")
    public void click_recover_btn(){
        RecoverPass.ClickRecoverPass();
    }

    @Then("User recover password successfully")
    public void recover_pass_successfully()  {
        String ExpectedMesg = "Email with instructions has been sent to you.";
        String Actual = RecoverPass.RecoverSuccessfullyMesg.getText();
        Assert.assertEquals(ExpectedMesg, Actual);
    }



}
