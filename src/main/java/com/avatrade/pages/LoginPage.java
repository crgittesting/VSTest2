package com.avatrade.pages;

import com.avatrade.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='logEmailInput']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[@id='AvasWidgetLoginSubmit']")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//*[@id=xOwHaFJMwyczWnM]")
    WebElement pressAndHold;

    public void sendEmail(String emailid) {
        sendTextToElement(email, emailid);
    }

    public void sendPassword(String pwd) {
        sendTextToElement(password, pwd);
    }

    public void clickOnLogin() {
        clickOnElement(login);
    }

    public void ClickHold() {
        Actions action = new Actions(driver);
        action.clickAndHold(pressAndHold).build().perform();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
}
