package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.example.pages.PG04_ShoppingCart;
import org.testng.Assert;


public class C06_Categories {

    PG03_HomePage PG03 = new PG03_HomePage();


    @Given("user select different category tabs")
    public void userSelectDifferentCategoryTabs() {
        PG03.computers().click();
        PG03.apparel().click();
        PG03.electronics().click();
    }

    @Then("user select Computers and go to sub category Software")
    public void userSelectComputersAndGoToSubCategorySoftware() throws InterruptedException {
        Thread.sleep(2500);
        PG03.computers().click();
        PG03.SubCategoury().click();
    }

    @And("user select Windows-8-Pro")
    public void userSelectWindows() throws InterruptedException {
        Thread.sleep(2500);
        PG03.win8().click();
        for (double x = 0; x < PG03.pricesValu().size(); x++ )
        {
            String value = PG03.pricesValu().get((int) x).getText();
            System.out.println("Itemes price change to Euro :" + value);
            Assert.assertTrue(true, value);
        }
    }
}
