package org.example.pages;

import org.example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PG01_Registarion {

    public WebElement registerBtn()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement GenderType() {return Hooks.driver.findElement(By.id("gender-male"));}

    public WebElement fName()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lName()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement day()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement month()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement year()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }


    public WebElement email()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement company() {return Hooks.driver.findElement(By.id("Company"));}
    public WebElement newsletter(){return Hooks.driver.findElement(By.id("Newsletter"));}

    public WebElement passwordtxt()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmpassTxt()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement creatBtn() {return Hooks.driver.findElement(By.id("register-button"));}
    public WebElement result()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
    public WebElement pagebody(){return Hooks.driver.findElement(By.className("page-body"));}
    public WebElement txtcolor(){return Hooks.driver.findElement(By.className("result"));}

}
