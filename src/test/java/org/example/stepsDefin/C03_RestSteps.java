package org.example.stepsDefin;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.PG02_LoginAndRest;
import org.testng.asserts.SoftAssert;


public class C03_RestSteps {

    PG02_LoginAndRest PG02 = new PG02_LoginAndRest();


    @Then("user clicks on Forget password Link")
    public void userClicksOnForgetPasswordLink() {
        PG02.forgetPass().click();
    }

    @Then("user enter email {string}")
    public void userEnterEmail(String arg0) {
        SoftAssert page = new SoftAssert();
        page.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/passwordrecovery", "Recover Page");
        PG02.email().sendKeys(arg0);
        page.assertAll();
    }

    @When("user clicks on Recover button")
    public void userClicksOnRecoverButton() {
        PG02.sendEmail().click();
    }

    @Then("Success massage appears on screen")
    public void successMassageAppearsInGreenOnScreen() throws InterruptedException {
        String expictedResult = "Email with instructions has been sent to you.";
        String aactualResult = PG02.actual().getText();
        Thread.sleep(2000);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(aactualResult.contains(expictedResult), "Massage Appear");
        soft.assertTrue(PG02.SuccsesMsg().isDisplayed(), "Text Displayed");
        System.out.println("Your Result is : " + aactualResult);
        soft.assertAll();
    }


}
