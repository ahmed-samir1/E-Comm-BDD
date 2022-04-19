package com.automation.step_definitions;
import com.automation.pages.ProductHover;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ProductHoverMenu {
    loginPage login = new loginPage((ChromeDriver) TestBase.driver);
    ProductHover productHover = new ProductHover((ChromeDriver) TestBase.driver);

    @Given("Log user")
    public void logged_user(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }
    @When("User Choose different category")
    @Then("Category page open successfully")
    public void open_category(){
        productHover.SelectCategory();
        Assert.assertTrue(TestBase.driver.getCurrentUrl().contains("digital-downloads"));
    }
    @Then("Sub-category page open successfully")
    public void open_subCategory(){
        productHover.SelectSubCategory();
        Assert.assertTrue(TestBase.driver.getCurrentUrl().contains("desktops"));
    }



}
