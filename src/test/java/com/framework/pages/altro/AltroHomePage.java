package com.framework.pages.altro;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AltroHomePage extends BasePage {

    public AltroHomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "AccountLink")
    private WebElement loginLink;

    public AltroLoginPage openLoginPage() {
        loginLink.click();
        return PageFactory.initElements(driver, AltroLoginPage.class);
    }
}
