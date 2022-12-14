$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 3,
  "name": "User Logging into AVA Trade website and adding Crypto currencies",
  "description": "",
  "id": "user-logging-into-ava-trade-website-and-adding-crypto-currencies",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginAndAddCryptoCurrencies"
    }
  ]
});
formatter.before({
  "duration": 3149674300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User Logging into AVA Trade Trading website",
  "description": "",
  "id": "user-logging-into-ava-trade-website-and-adding-crypto-currencies;user-logging-into-ava-trade-trading-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters email id into email element",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters password into password element",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User navigates to Trading Page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Given User is already logged in to AVATRADE website"
    }
  ],
  "line": 13,
  "name": "User selects Trade Element on the left hand side",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User scrolls and find the element and click on crypto",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects Five of his favourites",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User go back to favourites and select",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should be able to see all selected crypto currencies in favourites",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userIsOnLoginPage()"
});
formatter.result({
  "duration": 94737600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userEntersEmailIdIntoEmailElement()"
});
formatter.result({
  "duration": 826163100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userEntersPasswordIntoPasswordElement()"
});
formatter.result({
  "duration": 60704000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 67900500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userNavigatesToTradingPage()"
});
formatter.result({
  "duration": 22700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userSelectsTradeElementOnTheLeftHandSide()"
});
formatter.result({
  "duration": 6291585900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userScrollsAndFindTheElementAndClickOnCrypto()"
});
formatter.result({
  "duration": 245733100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userSelectsFiveOfHisFavourites()"
});
formatter.result({
  "duration": 60266784100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027CRYPTO10\u0027]\"}\n  (Session info: chrome\u003d104.0.5112.81)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027CHANDANA\u0027, ip: \u0027192.168.0.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [17e1c76c3b6f41cb0d703d6bc9558ade, findElement {using\u003dcss selector, value\u003d*[name\u003d\u0027CRYPTO10\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\\Users\\chand\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51008}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:51008/devtoo..., se:cdpVersion: 104.0.5112.81, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 17e1c76c3b6f41cb0d703d6bc9558ade\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.By$PreW3CLocator.findElement(By.java:429)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:238)\r\n\tat org.openqa.selenium.support.ByIdOrName.findElement(ByIdOrName.java:50)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$1.findElement(ElementLocation.java:136)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:80)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.avatrade.utility.Utility.clickOnElement(Utility.java:51)\r\n\tat com.avatrade.pages.TradePage.selectCRYPTO10AddToFavourites(TradePage.java:122)\r\n\tat com.avatrade.steps.LoginSteps.userSelectsFiveOfHisFavourites(LoginSteps.java:67)\r\n\tat ???.And User selects Five of his favourites(login.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.userGoBackToFavouritesAndSelect()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.userShouldBeAbleToSeeAllSelectedCryptoCurrenciesInFavourites()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 153923400,
  "status": "passed"
});
});