package com.automation.step_definitions;
import com.automation.pages.AddToCart;
import com.automation.pages.SuccessfulOrder;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserOrder {
    loginPage login = new loginPage((ChromeDriver) TestBase.driver);
    AddToCart addToCart = new AddToCart((ChromeDriver) TestBase.driver);
    SuccessfulOrder order = new SuccessfulOrder((ChromeDriver) TestBase.driver);

    @Given("user login")
    public void user_login(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }
    @When("User add product to cart")
    public void add_ToCart(){
        addToCart.chooseProductTab();
        addToCart.chooseReqProduct();
        addToCart.addCart();
        addToCart.AssertAdd();
    }
    @When("User click on checkout")
    public void checkout_order(){
        order.Checkout();
    }
    @When("User completes his data")
    public void complete_data(){
        order.EnterUserData("Egypt","Giza","Giza","12334","12345678910");
    }
    @When("User follow all steps")
    public void follow_steps(){
        order.CompletePurchase();
    }
    @Then("Order completed successfully")
    public void order_successfully(){
        order.ConfirmedOrder();
        Assert.assertTrue(order.ThankYou.isDisplayed());
        Assert.assertTrue(order.SucessOrder.isDisplayed());
    }

}
