package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChangeCurrency {
    WebDriver driver;
    Select select;
    public ChangeCurrency(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
    }
  @FindBy(id="customerCurrency")
    WebElement Currency;
  @FindBy(className = "price")
   public WebElement price;


  public void ChangeCurrency(){
      select = new Select(Currency);
      select.selectByVisibleText("Euro");
  }

}
