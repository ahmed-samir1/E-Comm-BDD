package com.automation.step_definitions;
import com.automation.pages.SelectTag;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectDifferentTags {
    loginPage login = new loginPage((ChromeDriver) Hooks.driver);
    SelectTag selectTag = new SelectTag((ChromeDriver) Hooks.driver);
    @Given("User login")
    public void User_log(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }

    @When("User Choose any category")
    public void choose_category(){
        selectTag.selectProduct();
    }

    @When("User choose awesome tag")
    public void choose_Tag(){
        selectTag.selectTag();
    }

    @Then("Related products appear successfully")
    public void related_tag_products(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("awesome"));
    }
}
