package com.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    public static WebDriver getInstance() {
        WebDriver driver = null;
        switch (Constants.BROWSER_NAME.toUpperCase()) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
                driver = new ChromeDriver();
                break;

            default:
                new RuntimeException("Invalid Browser name: " + Constants.BROWSER_NAME);

        }

        return driver;
    }
}
