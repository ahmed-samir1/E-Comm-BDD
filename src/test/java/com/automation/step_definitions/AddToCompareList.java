package com.automation.step_definitions;
import com.automation.pages.CompareList;
import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddToCompareList {
    loginPage login = new loginPage((ChromeDriver) TestBase.driver);
    CompareList addToComparelist = new CompareList((ChromeDriver) TestBase.driver);

    @Given("logged user")
    public void logged_user(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }
    @When("user click on product tabs")
    public void click_productTab(){
        addToComparelist.chooseProductTab();
    }
    @When("user click on required product")
    public void click_product(){
        addToComparelist.chooseReqProduct();
    }
    @When("User click on add to compare list")
    public void add_compareList(){
        addToComparelist.addCompare();
    }
    @Then("related products added successfully")
    public void added_successfully(){
        addToComparelist.AssertAdd();
        String ExpectedMesg ="Apple MacBook Pro 13-inch";
        String Actual = addToComparelist.product.getText();
        Assert.assertTrue(addToComparelist.compareProducts.isDisplayed());
        Assert.assertEquals(Actual, ExpectedMesg);
    }
}
