package com.gmail.nemo31.nn.tests;

import com.gmail.nemo31.nn.pages.LoginPage;
import com.gmail.nemo31.nn.pages.MailMainPage;
import com.gmail.nemo31.nn.pages.MainPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {
    public static MainPage mainPage;
    public static LoginPage loginPage;
    public static MailMainPage mailMainPage;

    @BeforeClass
    protected void initiliaze() {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        mailMainPage = new MailMainPage(driver);
    }

    @Test(priority = 1,description = "Invalid login scenario with wrong username")
    @Feature("Login tests")
    public void invalidLogin(){
        mainPage.clickMailButton();
        loginPage.setLogin("NoAutotestUser");
        loginPage.setPassword("AutotestUser123");
        loginPage.clickLoginButton();
        String expectedLogin = loginPage.checkingInvalidMessage();
        Assert.assertEquals(expectedLogin,"Такого аккаунта нет");
    }

    @Test(priority = 1,description = "Invalid login scenario with wrong password")
    @Feature("Login tests")
    public void invalidPassword(){
        driver.get("https://www.yandex.by");
        mainPage.clickMailButton();
        loginPage.setLogin("AutotestUser");
        loginPage.setPassword("NoAutotestUser123");
        loginPage.clickLoginButton();
        String expectedPassword = loginPage.checkingInvalidMessage();
        Assert.assertEquals(expectedPassword, "Неверный пароль");

    }




}
