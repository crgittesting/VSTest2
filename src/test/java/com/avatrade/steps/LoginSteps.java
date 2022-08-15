package com.avatrade.steps;

import com.avatrade.pages.LoginPage;
import com.avatrade.pages.TradePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static com.avatrade.drivermanager.ManageDriver.driver;

public class LoginSteps {
    @Given("^User is on Login Page$")
    public void userIsOnLoginPage() {
        new LoginPage();
    }

    @When("^User enters email id into email element$")
    public void userEntersEmailIdIntoEmailElement() {
        new LoginPage().sendEmail("hihappy14@gmail.com");
    }

    @And("^User enters password into password element$")
    public void userEntersPasswordIntoPasswordElement() {
        new LoginPage().sendPassword("Vinayaka5678");
    }
    @And("^User clicks on Login button$")
    public void userClicksOnLoginButton() throws InterruptedException {
        new LoginPage().clickOnLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Then("^User navigates to Trading Page$")
    public void userNavigatesToTradingPage() {
    }

    @When("^User selects Trade Element on the left hand side$")
    public void userSelectsTradeElementOnTheLeftHandSide() {
        new TradePage().clickOnTradeButton();
    }

    @And("^User scrolls and find the element and click on crypto$")
    public void userScrollsAndFindTheElementAndClickOnCrypto() {
        new TradePage().selectCrypto();
    }

    @And("^User selects Five of his favourites$")
    public void userSelectsFiveOfHisFavourites() {
        new TradePage().selectBCHUSDAddToFavourites();
        new TradePage().selectBTCEURAddToFavourites();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,30)");
        new TradePage().selectCRYPTO10AddToFavourites();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,50)");
        new TradePage().selectEOSUSDAddToFavourites();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,200)");
        new TradePage().selectNEOUSDAddToFavourites();
    }

    @And("^User go back to favourites and select$")
    public void userGoBackToFavouritesAndSelect() {
        new TradePage().clickOnFavourites();
    }

    @Then("^User should be able to see all selected crypto currencies in favourites$")
    public void userShouldBeAbleToSeeAllSelectedCryptoCurrenciesInFavourites() {
        String expCRYPTO10Symbol = "CRYPTO10";
        Assert.assertEquals("Symbols does not match",expCRYPTO10Symbol,new TradePage().verifyCRYPTOText());

        String expBCHUSDSymbol = "BCHUSD";
        Assert.assertEquals("Symbols does not match",expBCHUSDSymbol,new TradePage().verifyBCHUSDText());

        String expBTCEURSymbol = "BTCEUR";
        Assert.assertEquals("Symbols does not match",expBTCEURSymbol,new TradePage().verifyBTCEURText());

        String expNEOUSDSymbol = "NEOUSD";
        Assert.assertEquals("Symbols does not match",expNEOUSDSymbol,new TradePage().verifyNEOUSDText());

        String expEOSUSDSymbol = "EOSUSD";
        Assert.assertEquals("Symbols does not match",expEOSUSDSymbol,new TradePage().verifyEOSUSDText());
    }
    }

