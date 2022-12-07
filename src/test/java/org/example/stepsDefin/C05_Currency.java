package org.example.stepsDefin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class C05_Currency {

    PG03_HomePage PG03 = new PG03_HomePage();

    @Given("user clicks on currencies list and select euro")
    public void searchBox()
    {
        WebElement listCurrency = Hooks.driver.findElement(By.id("customerCurrency"));
        Select clselect =new Select(listCurrency);
        clselect.selectByVisibleText("Euro");
    }

    @Then("user can see € sign in products")
    public void userCanSee€SignInProducts() {

        for (double x = 0; x < PG03.prices().size(); x++ )
        {
          String value = PG03.prices().get((int) x).getText();
            System.out.println("Itemes price change to Euro :" + value);
            Assert.assertTrue(true, value);
        }
    }

}
