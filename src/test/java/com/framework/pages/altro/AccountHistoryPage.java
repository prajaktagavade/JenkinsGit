package com.framework.pages.altro;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountHistoryPage extends BasePage {
    public AccountHistoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    private WebElement txtCurrentAccountNumber;

    @FindBy(xpath = "//*[contains(text(), 'Available balance')]/following-sibling::td")
    private WebElement txtAvailableBalance;

    public String getAccountNumber() {
        return txtCurrentAccountNumber.getText();
    }

    public String getAvailBalance() {
        return txtAvailableBalance.getText();
    }
}
