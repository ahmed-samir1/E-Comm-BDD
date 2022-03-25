package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SuccessfulOrder {
    WebDriver driver;
    Select select;
    public SuccessfulOrder(ChromeDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="termsofservice")
    WebElement Terms;
    @FindBy(id="checkout")
    WebElement Checkout;
    @FindBy(id="BillingNewAddress_CountryId")
    WebElement Country;
    @FindBy(id="BillingNewAddress_City")
    WebElement City;
    @FindBy(id="BillingNewAddress_Address1")
    WebElement Address;
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement Zip;
    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement Phone;
    @FindBy(css= "button[class=\"button-1 new-address-next-step-button\"]")
    WebElement cont1;
    @FindBy(css="button[class=\"button-1 shipping-method-next-step-button\"]")
    WebElement cont2;
    @FindBy(css="button[class=\"button-1 payment-method-next-step-button\"]")
    WebElement cont3;
    @FindBy(css="button[class=\"button-1 payment-info-next-step-button\"]")
    WebElement cont4;
    @FindBy(css="button[class=\"button-1 confirm-order-next-step-button\"]")
    WebElement confirmOrder;
    @FindBy(css="h1")
    public WebElement ThankYou;
    @FindBy(css="div[class=\"title\"]")
    public WebElement SucessOrder;


    public void Checkout(){
        Terms.click();
        Checkout.click();
    }
    public void EnterUserData(String countryName, String city,
                              String address, String zip, String phone){
        select = new Select(Country);
        select.selectByVisibleText(countryName);
        City.sendKeys(city);
        Address.sendKeys(address);
        Zip.sendKeys(zip);
        Phone.sendKeys(phone);
        cont1.click();
    }
    public void CompletePurchase(){
        cont2.click();
        cont3.click();
        cont4.click();
    }
    public void ConfirmedOrder(){
        confirmOrder.click();
    }
}
