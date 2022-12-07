package org.example.stepsDefin;

import io.cucumber.java.en.Then;
import org.example.pages.PG03_HomePage;
import org.example.pages.PG04_ShoppingCart;
import org.example.pages.PG05_Wish_CompareList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C11_CompareList {

    PG05_Wish_CompareList PG05 = new PG05_Wish_CompareList();


    @Then("user add mobile to compare list")
    public void userAddMobileToCompareList() throws InterruptedException {
        PG05.ComparBtn().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = PG05.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(PG05.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @Then("user go to Compare Page")
    public void userGoToComparePage() {
        PG05.ComparePG().click();
        SoftAssert see1 = new SoftAssert();
        String expect = "Compare products";
        String actual = PG05.pageTxt().getText();
        see1.assertTrue(actual.contains(expect));
        see1.assertTrue(PG05.comparetxt().isDisplayed());
        System.out.println("Your Page Show Title :" + actual);
        see1.assertAll();
        for (double x = 0; x < PG05.product().size(); x++ )
        {
            String value = PG05.product().get((int) x).getText();
            System.out.println("List Items : " +value);
            Assert.assertTrue(true, value);
        }
    }

}
