package com.framework.pages.altro;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class userHomePage extends BasePage {
    public userHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "listAccounts")
    private WebElement listAccounts;

    @FindBy(id = "btnGetAccount")
    private WebElement buttonGo;

    @FindBy(tagName = "h1")
    private WebElement txtWelcomeMsg;

    public String getWelcomeMsg() {
        return txtWelcomeMsg.getText();
    }

    public AccountHistoryPage selectAccount(String actualText) {
        Select selectAccount = new Select(listAccounts);
        selectAccount.selectByVisibleText(actualText);
        buttonGo.click();
        return PageFactory.initElements(driver, AccountHistoryPage.class);
    }
}
