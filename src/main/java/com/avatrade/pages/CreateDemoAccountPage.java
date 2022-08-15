package com.avatrade.pages;

import com.avatrade.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CreateDemoAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateDemoAccountPage.class.getName());

    public CreateDemoAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id ="name")
    WebElement firstName;


    @CacheLookup
    @FindBy(id ="lastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id ="email")
    WebElement email;

    @CacheLookup
    @FindBy(id ="phoneInput")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//label[@for='NewsLetter']")
    WebElement newsLetterCheckBox;

    @CacheLookup
    @FindBy(xpath = "//label[@for='GDPR']")
    WebElement termsAndConditionsCheckBox;

    @CacheLookup
    @FindBy(xpath = "//button[@name='avaWidgetSubmit']")
    WebElement createAccount;

    @CacheLookup
    @FindBy(xpath = "//*[@id=xOwHaFJMwyczWnM]")
    WebElement pressAndHold;

    public void sendFirstNameToElement() {
        sendTextToElement(firstName, "came");
        log.info("Sending First Name : " + firstName.toString());
    }
    public void sendlastNameToElement() {
        sendTextToElement(lastName, "mba");
        log.info("Sending last name: " + lastName.toString());
    }
    public void sendEmailAddress() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys("abcdef" + randomInt + "@gmail.com");
        log.info("Sending email address : " + email.toString());
    }
    public void sendPhoneNumber() {
        sendTextToElement(phoneNumber, "123123123123");
        log.info("Sending phone number : " + phoneNumber.toString());
    }
    public void clickNewsLetterBox() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        clickOnElement(newsLetterCheckBox);
        log.info("Clicking on Newletter box : " + newsLetterCheckBox.toString());
    }
    public void clickOnTermsAndConditionsBox() throws InterruptedException {
        clickOnElement(termsAndConditionsCheckBox);
        log.info("Clicking on Terms and Conditions Box : " + termsAndConditionsCheckBox.toString());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void clickOnCreateAccount() throws InterruptedException {
        clickOnElement(createAccount);
        log.info("Clicking on Create Account: " + createAccount.toString());
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }
}