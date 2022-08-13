package com.framework.tests;

import com.framework.core.BaseTest;
import com.framework.pages.GoogleHomePage;
import com.framework.pages.GoogleSearchResultPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

import java.util.concurrent.TimeUnit;

@Listeners(value = {HTMLReporter.class})
public class SampleTest extends BaseTest {


    @Test
    public void sampleTest1() {
        driver.get("https://www.google.com/");

        GoogleHomePage homePage = PageFactory.initElements(driver,GoogleHomePage.class);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        GoogleSearchResultPage resultPage =  homePage.performSearch("Prajakta Gavade");
        Assert.assertTrue(resultPage.getURL().startsWith("https://www.google.com/search"), "Actual URL is: " + driver.getCurrentUrl());
        Assert.assertEquals(resultPage.getSearchedText(),"Prajakta Gavade", "Text does not match");


    }
}
