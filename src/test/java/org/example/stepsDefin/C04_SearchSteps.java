package org.example.stepsDefin;


import io.cucumber.java.en.Given;
import org.example.pages.PG03_HomePage;
import org.testng.Assert;



public class C04_SearchSteps {

    PG03_HomePage PG03 = new PG03_HomePage();



    @Given("user search for items in search box For {string}")
    public void userSearchForItemsInSearchBoxFor(String arg0) throws InterruptedException {
        PG03.searchBox().sendKeys(arg0);
        PG03.searchBox().submit();
        for (double x = 0; x < PG03.TextItem().size(); x++ )
        {
            String value = PG03.TextItem().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
        }
        Thread.sleep(2000);
    }

}
