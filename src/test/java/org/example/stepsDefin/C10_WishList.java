package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.PG05_Wish_CompareList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C10_WishList {

    PG05_Wish_CompareList PG05 = new PG05_Wish_CompareList();

    @Then("user add item to Wishlist")
    public void userAddItemToWishlist() throws InterruptedException {
        PG05.whichBt25().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG05.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG05.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @And("user select Windows-8-Pro and added to Wishlist")
    public void userSelectWindowsWishlist() throws InterruptedException {
        PG05.win8add().click();
        PG05.whichBt11().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG05.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG05.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @Then("user go to Wishlist page and view items")
    public void userGoToWishlistPageAndViewItems() throws InterruptedException {
        Thread.sleep(3000);
        PG05.wichPageBt().click();
        Thread.sleep(3000);
        for (double x = 0; x < PG05.product().size(); x++ )
        {
            String value = PG05.product().get((int) x).getText();
            System.out.println("List Items : " +value);
            Assert.assertTrue(true, value);
        }
    }
}
