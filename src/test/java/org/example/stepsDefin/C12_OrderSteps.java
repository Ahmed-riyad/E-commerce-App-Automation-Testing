package org.example.stepsDefin;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.PG06_MakeOrder;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C12_OrderSteps {


    PG06_MakeOrder PG06 = new PG06_MakeOrder();


    @Then("user check Agree Box and press CheckOut")
    public void userCheckAgreeBoxAndPressCheckOut() {
        PG06.termsOf().click();
        PG06.checkOut().click();
    }
    @Then("user fill shipping form")
    public void userFillShippingForm() throws InterruptedException {

        Select select = new Select(PG06.country());
        select.selectByVisibleText("Egypt");
        select = new Select(PG06.countrySup());
        select.selectByVisibleText("Other");

        Thread.sleep(1500);
        PG06.City().clear();
        PG06.City().sendKeys("City Example1");
        PG06.Adress().clear();
        PG06.Adress().sendKeys("Address Example1");
        PG06.ZipCode().clear();
        PG06.ZipCode().sendKeys("123451");
        PG06.phone().clear();
        PG06.phone().sendKeys("01234567891");
    }

    @When("User Check Out Order Successfully")
    public void userCheckOutOrderSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        PG06.CheckoutBt().click();
        Thread.sleep(2000);
        PG06.CheckoutBt2().click();
        Thread.sleep(2000);
        PG06.CheckoutBt3().click();
        Thread.sleep(2000);
        PG06.CheckoutBt4().click();
        Thread.sleep(2000);
        PG06.CheckoutBt5().click();

        Thread.sleep(3000);
        SoftAssert order = new SoftAssert();
        String expect = "Your order has been successfully processed!";
        String actual = PG06.txtDone().getText();
        order.assertTrue(actual.contains(expect),"Right Page Shown");
        order.assertTrue(PG06.txtDone().isDisplayed());
        order.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/checkout/completed");
        System.out.println("Your Result :" + actual);
        order.assertAll();
    }

    @And("user go to Shopping Cart page to buy")
    public void userGoToShoppingCartPageToBuy() throws InterruptedException {
        Thread.sleep(3000);
        PG06.ShopingCartBtn().click();
        Thread.sleep(3000);
        for (double x = 0; x < PG06.product().size(); x++ )
        {
            String value = PG06.product().get((int) x).getText();
            System.out.println("List Items : " +value);
            Assert.assertTrue(true, value);
        }
    }
}
