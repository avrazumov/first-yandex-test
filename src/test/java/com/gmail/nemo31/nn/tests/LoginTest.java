package com.gmail.nemo31.nn.tests;

import com.gmail.nemo31.nn.pages.LoginPage;
import com.gmail.nemo31.nn.pages.MailMainPage;
import com.gmail.nemo31.nn.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    public static MainPage mainPage;
    public static LoginPage loginPage;
    public static MailMainPage mailMainPage;

    @BeforeClass
    protected void initiliaze(){
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        mailMainPage = new MailMainPage(driver);
    }

    @Test
    public void logining(){
        mainPage.clickMailButton();
        loginPage.setLogin("AutotestUser");
        loginPage.setPassword("AutotestUser123");
        loginPage.clickLoginButton();
        String expectedResult = loginPage.getUserName();
        Assert.assertEquals(expectedResult, "AutotestUser");
}









}
