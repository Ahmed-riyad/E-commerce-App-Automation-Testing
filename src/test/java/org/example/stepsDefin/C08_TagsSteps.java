package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C08_TagsSteps {

    PG03_HomePage PG03 = new PG03_HomePage();

    @Given("user select category Apparel")
    public void userSelectCategoryApparel() {
        PG03.apparel().click();
    }

    @Then("user select tag name from list")
    public void userSelectTagNameFromList() throws InterruptedException {
        Thread.sleep(2500);
        PG03.tag1().click();
        Thread.sleep(2500);
        for (double x = 0; x < PG03.productlist().size(); x++ )
        {
            String value = PG03.productlist().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
        }
        String expectResult = "Products tagged with 'awesome'";
        String actualResult = PG03.falshText().getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectResult));
        soft.assertTrue(PG03.falshText().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/awesome");
        System.out.println(" Your Actual Result : " + actualResult);
        soft.assertAll();

    }

    @And("user could select another tag")
    public void userCouldSelectAnotherTag() throws InterruptedException {
        Thread.sleep(2500);
        PG03.tag2().click();
        Thread.sleep(2500);
        for (double x = 0; x < PG03.productlist().size(); x++ )
        {
            String value = PG03.productlist().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
        }
        String expectResult = "Products tagged with 'cool'";
        String actualResult = PG03.falshText().getText();
        SoftAssert soft2 = new SoftAssert();
        soft2.assertTrue(actualResult.contains(expectResult));
        soft2.assertTrue(PG03.falshText().isDisplayed());
        soft2.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/cool");
        System.out.println(" Your Actual Result : " + actualResult);
        soft2.assertAll();
    }

}
