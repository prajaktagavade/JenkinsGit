package com.framework.pages;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "q")
    WebElement txtQueryBox;

    @FindBy(name = "btnK")
    WebElement btnGoogleSearch;

    public GoogleSearchResultPage performSearch(String text) {
        txtQueryBox.sendKeys(text);
        txtQueryBox.submit();
        return PageFactory.initElements(driver, GoogleSearchResultPage.class);
    }




}
