package com.automation.step_definitions;
import com.automation.pages.FilterColor;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWithColor {
    loginPage login = new loginPage((ChromeDriver) TestBase.driver);
    FilterColor filterColor = new FilterColor((ChromeDriver) TestBase.driver);

    @Given("The Logged user")
    public void Logged_user(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }
    @When("User Choose shoes category")
    public void choose_Shoes(){
        filterColor.SelectShoes();
    }
    @When("User Choose blue color shoes")
    public void choose_Blue_Shoes(){
        filterColor.SelectColor();
    }
    @Then("Required product color appears successfully")
    public void Blue_Choose_appears_successfully(){
        Assert.assertTrue(TestBase.driver.getCurrentUrl().contains("specs=16"));

    }

}
