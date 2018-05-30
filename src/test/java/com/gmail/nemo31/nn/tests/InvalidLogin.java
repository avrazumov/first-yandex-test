package com.gmail.nemo31.nn.tests;

import com.gmail.nemo31.nn.pages.LoginPage;
import com.gmail.nemo31.nn.pages.MailMainPage;
import com.gmail.nemo31.nn.pages.MainPage;
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

    @Test
    public void invalidLogin(){
        mainPage.clickMailButton();
        loginPage.setLogin();
        loginPage.setInvalidPassword();
        loginPage.clickLoginButton();
        loginPage.checkingInvalidPassword();
        loginPage.clickReturnButton();
    }

    @Test
    public void invalidPassword(){
        mainPage.clickMailButton();
        loginPage.setInvalidLogin();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        loginPage.checkingInvalidLogin();
    }




}
