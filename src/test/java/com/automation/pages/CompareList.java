package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareList {
    WebDriver driver;
    Actions select;
    public CompareList(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
        select = new Actions(driver);
    }

    @FindBy(css="a[href=\"/computers\"]")
    WebElement ComputerCategory;
    @FindBy(css="a[href=\"/notebooks\"]")
    WebElement notebooks;
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement products;
    @FindBy(css= "button[class=\"button-2 add-to-compare-list-button\"]")
    WebElement compareBtn;
    @FindBy(css="a[href=\"/compareproducts\"]")
    WebElement comparePage;
    @FindBy(css="h1")
    public WebElement compareProducts;
    @FindBy(className = "product-name")
    public WebElement product;
    public void chooseProductTab(){
        select.moveToElement(ComputerCategory).moveToElement(notebooks).click().build().perform();
    }
    public void chooseReqProduct(){
        products.click();
    }
    public void addCompare(){
        compareBtn.click();
    }
    public void AssertAdd(){
        comparePage.click();
    }


}
