package org.example.pages;

import org.example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PG04_ShoppingCart {

    public WebElement size(){
        return Hooks.driver.findElement(By.id("product_attribute_9"));
    }
    public WebElement sucssText () {
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement shoesAdd(){return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/adidas-consortium-campus-80s-running-shoes\"]"));}
    public WebElement slectColor () {
        return Hooks.driver.findElement(By.className("attribute-square"));
    }
    public WebElement addCart() {
        return Hooks.driver.findElement(By.id("add-to-cart-button-25"));
    }
    public WebElement SubElctro() {
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/cell-phones\"]"));
    }
    public WebElement HTC_M8(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }
    public WebElement HTCadd(){
        return Hooks.driver.findElement(By.id("product_enteredQuantity_18"));
    }
    public WebElement HTCcart(){
        return Hooks.driver.findElement(By.id("add-to-cart-button-18"));
    }
    public WebElement ShopingCartBtn(){
        return Hooks.driver.findElement(By.className("ico-cart"));
    }
    public WebElement quant1() {return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr[1]/td[5]/input"));}
    public WebElement quant2() {return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr[2]/td[5]/input"));}
    public WebElement udatCart() {return Hooks.driver.findElement(By.id("updatecart"));}
    public WebElement ComparBtn() {return Hooks.driver.findElement(By.className("compare-products"));}
    public WebElement HTCblue() {return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/htc-one-mini-blue\"]"));}
    public WebElement removeItem() {return Hooks.driver.findElement(By.name("updatecart"));}
    public List<WebElement> pricesValu()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("product-price"));
        return prices;
    }
    public WebElement electronics() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
    }

}
