package com.framework.pages.altro;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AltroLoginPage extends BasePage {
    public AltroLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uid")
    private WebElement userName;

    @FindBy(id = "passw")
    private WebElement password;

    @FindBy(name = "btnSubmit")
    private WebElement loginButton;

    public userHomePage performLogin(String user, String pwd) {
        userName.sendKeys(user);
        password.sendKeys(pwd);
        loginButton.click();
        return PageFactory.initElements(driver,userHomePage.class);
    }
}
