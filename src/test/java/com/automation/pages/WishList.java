package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
    WebDriver driver;
    Actions select;
    public WishList(ChromeDriver driver) {
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
    @FindBy(id="add-to-wishlist-button-4")
    WebElement wishListBtn;
    @FindBy(css="a[href=\"/wishlist\"]")
    WebElement wishListPage;
    @FindBy(css="h1")
    public WebElement wishlistHeader;
    @FindBy(className = "product-name")
    public WebElement product;
    public void chooseProductTab(){
        select.moveToElement(ComputerCategory).moveToElement(notebooks).click().build().perform();
    }
    public void chooseReqProduct(){
        products.click();
    }
    public void addWishList(){
        wishListBtn.click();
    }
    public void AssertAdd(){
        wishListPage.click();
    }
}
