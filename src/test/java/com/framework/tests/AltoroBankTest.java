package com.framework.tests;

import com.framework.core.BaseTest;
import com.framework.pages.altro.AccountHistoryPage;
import com.framework.pages.altro.AltroHomePage;
import com.framework.pages.altro.AltroLoginPage;
import com.framework.pages.altro.userHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

import java.util.Map;

@Listeners(value = {HTMLReporter.class})
public class AltoroBankTest extends BaseTest {


    @BeforeMethod
    public void openURL() {
        driver.get("https://demo.testfire.net");
    }

    @Test(dataProvider = "altroDP", dataProviderClass = AltroDataProvider.class)
    public void testAccountBalance(Map<String,String> params) {
        AltroHomePage homePage = PageFactory.initElements(driver,AltroHomePage.class);
        AltroLoginPage loginPage = homePage.openLoginPage();
        userHomePage uHomePage = loginPage.performLogin(params.get("username"), params.get("password"));
        Assert.assertEquals(uHomePage.getWelcomeMsg(),"Hello John Smith");
        AccountHistoryPage accountHistoryPage = uHomePage.selectAccount(params.get("account"));
        //Assert.assertTrue(account.contains(accountHistoryPage.getAccountNumber()));
        Assert.assertTrue(accountHistoryPage.getAvailBalance().contains(params.get("expectedBalance")));

    }

    @Test(dataProvider = "altroDPExcel", dataProviderClass = AltroDataProvider.class)
    public void testAccountBalanceFromExcel(Map<String,String> params) {
        AltroHomePage homePage = PageFactory.initElements(driver,AltroHomePage.class);
        AltroLoginPage loginPage = homePage.openLoginPage();
        userHomePage uHomePage = loginPage.performLogin(params.get("username"), params.get("password"));
        Assert.assertEquals(uHomePage.getWelcomeMsg(),"Hello John Smith");
        AccountHistoryPage accountHistoryPage = uHomePage.selectAccount(params.get("account"));
        //Assert.assertTrue(account.contains(accountHistoryPage.getAccountNumber()));
        Assert.assertTrue(accountHistoryPage.getAvailBalance().contains(params.get("expectedBalance")));

    }


}
