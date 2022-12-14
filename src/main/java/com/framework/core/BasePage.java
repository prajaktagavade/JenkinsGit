package com.framework.core;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

}
