package com.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = BrowserFactory.getInstance();
    }



    @AfterMethod
    public void cleanUp() {
        if(driver != null) {
            driver.quit();
        }
    }
}
