package com.automation.step_definitions;
import com.automation.pages.SearchPage;
import com.automation.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserSearch {
    loginPage login = new loginPage((ChromeDriver) Hooks.driver);
    SearchPage search = new SearchPage((ChromeDriver) Hooks.driver);

    @Given("Logged-in user")
    public void logged_in(){
        login.OpenLoginPage();
        login.UserLogin("Ahmed@gmail.com","123456");
        login.ClickLoginBtn();
    }
    @When("User clicks on search field")
    public void user_clicks_on_search_field()
    {
        search.ClickSearchBtn();
    }

    @And("User search with name of product")
    public void user_search_with_name_of_product()
    {
        search.SearchBox("book");
    }

    @Then("User could find relative results")
    public void user_could_find_relative_results()
    {
        int count=   search.ProductTitle.size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        for (int x = 0; x < count ; x++) {
            System.out.println(search.ProductTitle.get(x).getText());
            Assert.assertTrue(search.ProductTitle.get(x).getText().toLowerCase().contains("book"));
        }
    }

}
