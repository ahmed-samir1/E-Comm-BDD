package com.automation.step_definitions;

import com.automation.pages.AddToCart;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class addToCart {
    loginPage login = new loginPage((ChromeDriver) TestBase.driver);
    AddToCart addToCart = new AddToCart((ChromeDriver) TestBase.driver);

    @Given("User log")
    public void User_log(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }
    @When("User click on product tabs")
    public void click_productTab(){
        addToCart.chooseProductTab();
    }
    @When("User click on required product")
    public void choose_product(){
        addToCart.chooseReqProduct();
    }
    @When("User click on add to cart")
    public void add_product(){
        addToCart.addCart();
    }
    @Then("Related products added successfully")
    public void adding_successfully(){
        addToCart.AssertAdd();
        String ExpectedMesg ="Apple MacBook Pro 13-inch";
        String Actual = addToCart.product.getText();
        Assert.assertTrue(addToCart.shoppingCart.isDisplayed());
        Assert.assertEquals(Actual, ExpectedMesg);
    }
}
