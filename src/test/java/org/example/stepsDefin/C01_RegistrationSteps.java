package org.example.stepsDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.PG01_Registarion;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class C01_RegistrationSteps {

    PG01_Registarion PG01 = new PG01_Registarion();

    @Given("user go to register page")
    public void registerPage() throws InterruptedException {

        PG01.registerBtn().click();
        System.out.println("Register page open successfully");
        Thread.sleep(3000);
    }


    @Then("user select gender type")
    public void userSelectGenderType() {

        PG01.GenderType().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        PG01.fName().sendKeys(arg0);
        PG01.lName().sendKeys(arg1);
    }

    @Then("user enter date of birth")
    public void userEnterDateOfBirth() throws InterruptedException {

        Select select = new Select(PG01.day());
        select.selectByIndex(6);

        select = new Select(PG01.month());
        select.selectByVisibleText("April");

        select = new Select(PG01.year());
        select.selectByVisibleText("1985");

        Thread.sleep(1500);
    }

    @Then("user enter email {string} field and company name and check options")
    public void userEnterEmailField(String arg0) {
        PG01.email().sendKeys(arg0);
        PG01.company().sendKeys("New Register");
        PG01.newsletter().click();
    }

    @And("user enter Password fields {string} {string}")
    public void userEnterPassword(String arg0, String arg1) {
        PG01.passwordtxt().sendKeys(arg0);
        PG01.confirmpassTxt().sendKeys(arg1);
    }

    @Then("user clicks on register button")
    public void userClicksBut() {
        PG01.creatBtn().submit();
    }

    @Then("success message is displayed in Screen")
    public void successMsgIsShown() throws InterruptedException {

        String expectedResult = "Your registration completed";
        String actualResult = PG01.pagebody().getText();
        String textColor = PG01.txtcolor().getCssValue("color");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertTrue(PG01.result().isDisplayed(), "Register Successfully");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/registerresult/1?returnUrl=/", "Page Is Right");
        System.out.println("Your Actual Result is :" + actualResult);
        System.out.println(textColor);
        Thread.sleep(3000);
        soft.assertAll();
    }
}
