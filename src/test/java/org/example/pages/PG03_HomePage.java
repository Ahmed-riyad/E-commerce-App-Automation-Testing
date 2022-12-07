package org.example.pages;

import org.example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PG03_HomePage {

    public List<WebElement> prices()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return prices;
    }
    public List<WebElement> pricesbox()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("prices"));
        return prices;
    }
    public List<WebElement> pricesValu()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("product-price"));
        return prices;
    }

public List<WebElement> productlist()
{
    List<WebElement> Plist = Hooks.driver.findElements(By.className("product-title"));
    return Plist;
}
    public WebElement computers() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
    }
    public WebElement apparel() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement electronics() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
    }
    public WebElement SubCategoury () {
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/software\""));
    }
    public WebElement win8(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/windows-8-pro\"]"));
    }
    public List<WebElement> TextItem()
    {
        List<WebElement> TextList = Hooks.driver.findElements(By.className("product-title"));
        return TextList;
    }
    public WebElement shoes(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/shoes\"]"));
    }
    public WebElement redcolor() {
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }
    public WebElement tag1() { return Hooks.driver.findElement(By.cssSelector("a[href=\"/awesome\"]"));}
    public WebElement tag2() { return Hooks.driver.findElement(By.cssSelector("a[href=\"/cool\"]"));}
    public WebElement falshText () {
        return Hooks.driver.findElement(By.className("page-title"));
    }
    public WebElement searchBox() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

}
