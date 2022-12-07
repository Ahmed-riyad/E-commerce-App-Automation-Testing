package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.example.pages.PG04_ShoppingCart;
import org.example.pages.PG05_Wish_CompareList;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C09_ShopingCart {

    PG04_ShoppingCart PG04 = new PG04_ShoppingCart();

    @And("user add item to Shopping cart")
    public void addItemsToShop() throws InterruptedException {
        Thread.sleep(2000);
        PG04.shoesAdd().click();
        Select select = new Select(PG04.size());
        select.selectByVisibleText("9");
        PG04.slectColor().click();
        PG04.addCart().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @Then("user go to Electronics category")
    public void userGoToElectronicsCategory() {
        PG04.electronics().click();
    }

    @And("user select Cell phones Subcategory")
    public void userSelectCellPhonesSubcategory() {
        PG04.SubElctro().click();
    }

    @Then("user select Mobile HTC One M-8")
    public void userSelectMobileHTCOneM()  {
        PG04.HTC_M8().click();
    }

    @Then("user add mobiles to Quantity")
    public void userAddMobilesToQuantity() throws InterruptedException {
        PG04.HTCadd().clear();
        PG04.HTCadd().sendKeys("1");
        Thread.sleep(2000);
        for (double x = 0; x < PG04.pricesValu().size(); x++ )
        {
            String value = PG04.pricesValu().get((int) x).getText();
            System.out.println(" Item Price : "+value);
            Assert.assertTrue(true, value);
        }
    }
    @Then("user add mobile to Shopping cart")
    public void userAddMobileToShoppingCart() throws InterruptedException {

        PG04.HTCcart().click();
        Thread.sleep(3000);
        SoftAssert mobbuy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        mobbuy.assertTrue(actual.contains(expect));
        mobbuy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        mobbuy.assertAll();
        Thread.sleep(1500);
    }
    @And("user go to Shopping Cart page")
    public void userGoToShoppingCartPage() throws InterruptedException {
        Thread.sleep(3000);
        PG04.ShopingCartBtn().click();

        //product
    }
    @Then("user update Shopping cart Quantity")
    public void userUpdateShoppingCartQuantity() throws InterruptedException {
       Thread.sleep(2000);

        PG04.quant1().clear();
        PG04.quant1().sendKeys("1");
        PG04.quant2().clear();
        PG04.quant2().sendKeys("2");
        PG04.udatCart().click();
        Thread.sleep(2000);

    }

    @And("user remove one of items from cart")
    public void userRemoveOneOfItmesFromCart() throws InterruptedException {
        PG04.removeItem().click();
        Thread.sleep(1500);
    }

    @Then("user select size and color")
    public void userSelectSizeAndColor() throws InterruptedException {
        Thread.sleep(2000);
        PG04.shoesAdd().click();
        Select select = new Select(PG04.size());
        select.selectByVisibleText("9");
        PG04.slectColor().click();
    }

    @Then("user select Mobile HTC One Mini Blue")
    public void userSelectMobileHTCOneMiniBlue() throws InterruptedException {

        PG04.HTCblue().click();
        PG04.ComparBtn().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG04.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG04.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

}
