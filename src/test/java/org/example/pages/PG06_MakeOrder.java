package org.example.pages;

import org.example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PG06_MakeOrder {

    public WebElement country(){return Hooks.driver.findElement(By.name("BillingNewAddress.CountryId"));}
    public WebElement countrySup(){return Hooks.driver.findElement(By.name("BillingNewAddress.StateProvinceId"));}
    public WebElement City(){return Hooks.driver.findElement(By.id("BillingNewAddress_City"));}
    public WebElement Adress(){return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));}
    public WebElement ZipCode(){return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));}
    public WebElement phone(){return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));}
    public WebElement CheckoutBt(){return Hooks.driver.findElement(By.id("billing-buttons-container"));}
    public WebElement CheckoutBt2(){return Hooks.driver.findElement(By.id("shipping-method-buttons-container"));}
    public WebElement CheckoutBt3(){return Hooks.driver.findElement(By.id("payment-method-buttons-container"));}
    public WebElement CheckoutBt4(){return Hooks.driver.findElement(By.id("payment-info-buttons-container"));}
    public WebElement CheckoutBt5(){return Hooks.driver.findElement(By.id("confirm-order-buttons-container"));}
    public WebElement CheckoutBt6(){return Hooks.driver.findElement(By.className("button-1 confirm-order-next-step-button"));}
    public WebElement txtDone(){return Hooks.driver.findElement(By.className("title"));}
    public WebElement termsOf(){return Hooks.driver.findElement(By.id("termsofservice"));}
    public WebElement checkOut(){return Hooks.driver.findElement(By.id("checkout"));}
    public WebElement ShopingCartBtn(){
        return Hooks.driver.findElement(By.className("ico-cart"));
    }
    public List<WebElement> product()
    {
        List<WebElement> productlist = Hooks.driver.findElements(By.className("sku-number"));
        return productlist;
    }

}
