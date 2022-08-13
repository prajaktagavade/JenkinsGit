package com.framework.pages;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResultPage extends BasePage {

    public GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "result-stats")
    WebElement result;

    @FindBy(name = "q")
    WebElement txtSearchBox;

    public String getSearchedText() {
        return txtSearchBox.getAttribute("value");
    }
}
