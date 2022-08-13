package com.framework.pages;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends BasePage {
    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement txtSearchBox;

    @FindBy(id = "nav-search-submit-button")
    WebElement seatchButton;


    public AmazonSearchResultPage searchProduct(String productName) {
        txtSearchBox.sendKeys(productName);
        seatchButton.click();
        return PageFactory.initElements(driver, AmazonSearchResultPage.class);

    }
}
