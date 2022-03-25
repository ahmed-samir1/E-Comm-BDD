package com.automation.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {
    WebDriver driver;
    public SearchPage(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
    }

   @FindBy(id="small-searchterms")
    WebElement SearchBox;
   @FindBy(css="h2[class=\"product-title\"] a")
   public List<WebElement> ProductTitle;
    public void ClickSearchBtn(){
        SearchBox.click();
    }
    public void SearchBox(String searchWord){
        SearchBox.sendKeys(searchWord);
        SearchBox.sendKeys(Keys.ENTER);
    }






}
