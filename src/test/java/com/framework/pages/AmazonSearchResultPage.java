package com.framework.pages;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultPage extends BasePage {

    public AmazonSearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@cel_widget_id = 'UPPER-RESULT_INFO_BAR-0']/*/div/div/div/div/span[1]")
    WebElement showResultText;

    public String getSearchedText() {
        return showResultText.getText();
    }
}
