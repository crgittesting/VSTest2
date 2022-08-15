package com.avatrade.steps;

import com.avatrade.pages.CreateDemoAccountPage;
import com.avatrade.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.avatrade.drivermanager.ManageDriver.driver;

public class MyStepdefs {

    @Given("^User is on myvip\\.avatrade\\.com page$")
    public void userIsOnMyvipAvatradeComPage() {
        new HomePage();
    }

    @When("^User clicks on try free demo$")
    public void userClicksOnTryFreeDemo() {
        new HomePage().clickOnTryFreeDemo();
    }

    @Then("^User navigates to next page and verify open demo account text to next page and verify open demo account text$")
    public void userNavigatesToNextPageAndVerifyOpenDemoAccountTextToNextPageAndVerifyOpenDemoAccountText() {

            String expectedText = "Open Demo Account";
            String actualText = new HomePage().verifyDemoPageText();
            Assert.assertEquals("Demo page text does not match", expectedText, actualText);
    }

    @Given("^User on AVA TRADE open demo account page$")
    public void userOnAVATRADEOpenDemoAccountPage() {
        new HomePage().clickOnTryFreeDemo();
    }

    @When("^User sends in First Name$")
    public void userSendsInFirstName()
    {
        new CreateDemoAccountPage().sendFirstNameToElement();
    }

    @And("^User sends in Last Name$")
    public void userSendsInLastName()
    {
        new CreateDemoAccountPage().sendlastNameToElement();
    }

    @And("^User sends Email address$")
    public void userSendsEmailAddress()
    {
        new CreateDemoAccountPage().sendEmailAddress();
    }

    @And("^User enters Phone Number$")
    public void userEntersPhoneNumber()
    {
        new CreateDemoAccountPage().sendPhoneNumber();
    }

    @And("^User clicks for Promotion and newsletters$")
    public void userClicksForPromotionAndNewsletters() throws InterruptedException {
        new CreateDemoAccountPage().clickNewsLetterBox();
    }

    @And("^User accepts all Terms and Conditons$")
    public void userAcceptsAllTermsAndConditons() throws InterruptedException {
        new CreateDemoAccountPage().clickOnTermsAndConditionsBox();
    }

    @When("^User clicks on Create Account button$")
    public void userClicksOnCreateAccountButton() throws InterruptedException {
        new CreateDemoAccountPage().clickOnCreateAccount();
    }

    @Then("^User navigates to AVATrade page\\.$")
    public void userNavigatesToAVATradePage() {
       String  expectedURL = "https://webtrader9.avatrade.com/trade/151462/AUDCAD";
        String actualURL =driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }

}