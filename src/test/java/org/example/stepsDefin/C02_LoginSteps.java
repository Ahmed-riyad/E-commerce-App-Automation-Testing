package org.example.stepsDefin;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.PG02_LoginAndRest;
import org.testng.asserts.SoftAssert;



public class C02_LoginSteps {

    PG02_LoginAndRest PG02 = new PG02_LoginAndRest();


    @Given("user go to login page")
    public void loginPage() throws InterruptedException {
        PG02.loginBtn().click();
        Thread.sleep(3000);
    }

    @Then("user enter email {string} and Password {string}")
    public void userEnterEmailAndPassword(String arg0, String arg1) {
        PG02.email().sendKeys(arg0);
        PG02.password().sendKeys(arg1);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        PG02.password().submit();
    }
    @Then("Screen Navigate to home page")
    public void screenNavigateToHomePage() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert link = new SoftAssert();
        link.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/", "Login page Successfully ");
        link.assertTrue(PG02.pageUrl().isDisplayed(), "Account is Logged In");
        link.assertAll();
    }


}
