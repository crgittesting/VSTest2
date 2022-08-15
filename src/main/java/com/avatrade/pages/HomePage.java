package com.avatrade.pages;

import com.avatrade.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn hp-submit-btn hp-demo-acc-btn']")
    WebElement tryFreeDemo;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Open Demo Account']")
    WebElement demoPageText;

    public void clickOnTryFreeDemo() {
        clickOnElement(tryFreeDemo);
        log.info("Clicking on Try Free Demo : " + tryFreeDemo.toString());
    }
    public String verifyDemoPageText() {
        String text = demoPageText.getText();
        log.info("Verifying the demopage text" + demoPageText.toString());
        return text;
    }
}
