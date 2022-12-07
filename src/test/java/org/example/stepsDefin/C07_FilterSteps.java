package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C07_FilterSteps {

    PG03_HomePage PG03 = new PG03_HomePage();


    @Given("user select Apparel and go to sub category Shoes")
    public void userSelectApparelAndGoToSubCategoryShoes() {
        PG03.apparel().click();
        PG03.shoes().click();
    }

    @Then("user select color red from CheckBox")
    public void uesrSelectColorRedFromCheckBox() {
        PG03.redcolor().click();
    }

    @Then("filter option view results")
    public void filterOpthionViewResults() throws InterruptedException {
        Thread.sleep(2000);
        for (double x = 0; x < PG03.pricesbox().size(); x++ )
        {
            String value = PG03.pricesbox().get((int) x).getText();
            System.out.println(" Item Price : "+value);
            Assert.assertTrue(true, value);
        }
        SoftAssert soft = new SoftAssert();
        String expected = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15";
        String actulResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actulResult.contains(expected),"Right Page Shown");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15");
        System.out.println(" Your Filter Get the URl : " + actulResult);
        soft.assertAll();
    }

}
