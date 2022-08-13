package com.framework.tests;

import com.framework.core.BaseTest;
import com.framework.core.Utils.SyncUtils;
import com.framework.pages.AmazonHomePage;
import com.framework.pages.AmazonSearchResultPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import org.uncommons.reportng.HTMLReporter;

@Listeners(value = {HTMLReporter.class})
public class AmazonTests extends BaseTest {

    @BeforeMethod
    public void openURL() {
        driver.get("https://www.amazon.com");
    }

    @Parameters(value = {"product_name"})
    @Test
    public void testProductSearch(String product) {
        AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
        SyncUtils.wait(2);
        AmazonSearchResultPage searchPage = homePage.searchProduct(product);
        String actualText = searchPage.getSearchedText();
        Assert.assertEquals(actualText,"1-16 of over 2,000 results for", "Search Result text failed");
    }

    /*@Test(dataProvider = "getSearchInput")
    public void testProductSearchWithDataProvider(@Optional String product) {
        AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
        SyncUtils.wait(2);
        AmazonSearchResultPage searchPage = homePage.searchProduct(product);
        String actualText = searchPage.getSearchedText();
        Assert.assertEquals(actualText,"1-16 of over 2,000 results for", "Search Result text failed");
    }*/

    @DataProvider(parallel = true)
    public Object[][] getSearchInput() {
        Object[][] data = new Object[][]{
                {"iphone"},
                {"pixel"}
        };
        return data;
    }

}
