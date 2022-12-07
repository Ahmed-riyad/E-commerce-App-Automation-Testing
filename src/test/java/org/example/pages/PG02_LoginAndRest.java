package org.example.pages;

import org.example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PG02_LoginAndRest {

    public WebElement loginBtn()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement pageUrl() {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement forgetPass(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }
    public WebElement sendEmail(){
        return Hooks.driver.findElement(By.name("send-email"));
    }
    public WebElement actual(){
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement SuccsesMsg() {
        return Hooks.driver.findElement(By.className("content"));
    }
}
