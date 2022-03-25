package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductHover {
    WebDriver driver;
    Actions select;
    public ProductHover(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
        select = new Actions(driver);
    }

    @FindBy(css="a[href=\"/computers\"]")
    WebElement ComputerCategory;
    @FindBy(css="a[href=\"/desktops\"]")
    WebElement ComuterSubCategory;
    @FindBy(css="a[href=\"/digital-downloads\"]")
    WebElement DigitalCategory;

   public void SelectSubCategory(){
       select.moveToElement(ComputerCategory).moveToElement(ComuterSubCategory).click().build().perform();
   }
    public void SelectCategory(){
       select.moveToElement(DigitalCategory).click().build().perform();
    }


}
