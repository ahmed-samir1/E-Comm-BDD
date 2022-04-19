package com.automation.step_definitions;
import com.automation.pages.WishList;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddToWishList {
    loginPage login = new loginPage((ChromeDriver) TestBase.driver);
    WishList addToWishlist = new WishList((ChromeDriver) TestBase.driver);

    @Given("User logs")
    public void User_logs(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }
    @When("User clicks on product tabs")
    public void clicks_productTab(){
        addToWishlist.chooseProductTab();
    }
    @When("User clicks on required product")
    public void clicks_product(){
        addToWishlist.chooseReqProduct();
    }
    @When("User click on add to wishlist")
    public void add_wishlist(){
        addToWishlist.addWishList();
    }
    @Then("Related product added successfully")
    public void add_successfully(){
        addToWishlist.AssertAdd();
        String ExpectedMesg ="Apple MacBook Pro 13-inch";
        String Actual = addToWishlist.product.getText();
        Assert.assertTrue(addToWishlist.wishlistHeader.isDisplayed());
        Assert.assertEquals(Actual, ExpectedMesg);
    }
}
