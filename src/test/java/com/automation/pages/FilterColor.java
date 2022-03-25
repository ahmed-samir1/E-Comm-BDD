package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterColor {
        WebDriver driver;
        Actions select;
        public FilterColor(ChromeDriver driver) {
            this.driver= driver;
            PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
            select = new Actions(driver);
        }

        @FindBy(css="a[href=\"/apparel\"")
        WebElement Apparel;
        @FindBy(css="a[href=\"/shoes\"]")
        WebElement Shoes;
        @FindBy(id="attribute-option-16")
        WebElement Blue;

        public void SelectShoes(){
            select.moveToElement(Apparel).moveToElement(Shoes).click().build().perform();
        }
        public void SelectColor(){
            Blue.click();
        }




}
