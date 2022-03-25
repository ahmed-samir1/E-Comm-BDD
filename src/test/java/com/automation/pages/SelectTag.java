package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectTag {
    WebDriver driver;
    Actions select;
    public SelectTag(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this); //Initiate a page factory "to use instead of methods"
        select = new Actions(driver);
    }

    @FindBy(css="a[href=\"/books\"]")
    WebElement books;
    @FindBy(css="a[href=\"/awesome\"]")
    WebElement awesomeTag;

    public void selectProduct(){
        select.moveToElement(books).click().build().perform();

    }

    public void selectTag(){
        awesomeTag.click();
    }


}
