package com.avatrade.pages;

import com.avatrade.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TradePage extends Utility {

    private static final Logger log = LogManager.getLogger(TradePage.class.getName());

    public TradePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//span[text()='Skip Tutorial']")
    WebElement skipTutorial;

    @CacheLookup
    @FindBy(xpath = "//button[@type='button' and contains(@class, 'close-button')]")
    WebElement close;

    @CacheLookup
    @FindBy(xpath="//a[@href='/trade']//div[@data-qa='aside__icon']//i[@data-qa='icon-wrapper__container']//*[name()='svg']")
    //@FindBy(xpath="//svg[contains(@data-qa,'trade-icon')]")
    WebElement trade;

    @CacheLookup
    @FindBy(xpath="//div[@data-qa='categories__list' and text()='Favorites']/../..")
    WebElement favorites;

    @CacheLookup
    //@FindBy(xpath="//div[@data-qa='categories__list'][normalize-space()='Crypto']")
    @FindBy(xpath="//div[@data-qa='categories__list' and text()='Crypto']/../..")
    WebElement crypto;

    @CacheLookup
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/main/div/section/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/table/tbody/tr[1]/td[8]/div/div[2]/i")
    WebElement BCHUSD;

    @CacheLookup
    @FindBy(xpath="//tbody/tr[2]/td[8]/div[1]/div[2]/i[1]/i[1]//*[name()='svg']")
    WebElement BTCEUR;

    @CacheLookup

    //@FindBy(xpath="//tbody/tr[6]/td[8]/div[1]/div[2]/i[1]/i[1]//*[name()='svg']")
    //@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/main/div/section/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/table/tbody/tr[6]/td[8]/div/div[2]/i/i/svg")
    WebElement CRYPTO10;

    @CacheLookup
    //@FindBy(xpath="//tbody/tr[9]/td[8]/div[1]/div[2]/i[1]/i[1]//*[name()='svg']")
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/main/div/section/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/table/tbody/tr[9]/td[8]/div/div[2]/i/i/svg/g/path[2]")
    WebElement EOSUSD;

    @CacheLookup
    //@FindBy(xpath="//tbody/tr[16]/td[8]/div[1]/div[2]/i[1]/i[1]//*[name()='svg']")
    //@FindBy(xpath="//*[@id="root"]/div[1]/div[1]/div/div[1]/div[1]/div/main/div/section/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/table/tbody/tr[16]/td[8]/div/div[2]/i/i/svg/path")
    @FindBy(xpath="//path[contains(@fill,'currentColor')]")
    WebElement NEOUSD;

//    @CacheLookup
//    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/main/div/section/div/div/div[1]/div[1]/div[1]/div[2]/div");
//    WebElement favorites;

    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='CRYPTO10']")
    WebElement CRYPTOSymbolText;

    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='BTCEUR']")
    WebElement BTCEURSymbolText;

    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='NEOUSD']")
    WebElement NEOUSDSymbolText;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='BCHUSD']")
    WebElement BCHUSDSymbolText;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='EOSUSD']")
    WebElement EOSUSDSymbolText;


    public void clickOnSkipTutorial() {
        clickOnElement(skipTutorial);
        log.info("Clicking on Skip Tutorial : " + skipTutorial.toString());
    }

    public void clickOnCloseButton() {

        clickOnElement(close);
        log.info("Clicking on Close Button: " + close.toString());
    }
    public void clickOnTradeButton() {

        clickOnElement(trade);
        log.info("Clicking on trade Button: " + trade.toString());
    }

    public void selectCrypto(){
        mouseHoverToElementAndClick(crypto);
    }
    public void clickOnFavourites(){

        new TradePage().clickOnFavourites();
    }
    public void selectNEOUSDAddToFavourites(){
        clickOnElement(NEOUSD);
    }
    public void selectBCHUSDAddToFavourites(){
        clickOnElement(BCHUSD);
    }
    public void selectBTCEURAddToFavourites(){
        clickOnElement(BTCEUR);
   }
    public void selectCRYPTO10AddToFavourites(){
        clickOnElement(CRYPTO10);
    }
    public void selectEOSUSDAddToFavourites(){
        clickOnElement(EOSUSD);
    }

    public String verifyBTCEURText()
    {
        String text = BTCEURSymbolText.getText();
        return text;
    }

    public String verifyBCHUSDText()
    {
        String text = BCHUSDSymbolText.getText();
        return text;
    }

    public String verifyNEOUSDText()
    {
        String text = NEOUSDSymbolText.getText();
        return text;
    }

    public String verifyEOSUSDText()
    {
        String text = EOSUSDSymbolText.getText();
        return text;}

    public String verifyCRYPTOText()
    {
        String text = CRYPTOSymbolText.getText();
        return text;
    }
}
