package com.gmail.nemo31.nn.tests;

import com.gmail.nemo31.nn.pages.LanguageSettingsPage;
import com.gmail.nemo31.nn.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LanguageChangingTest extends BaseTest {
    public static MainPage mainPage;
    public static LanguageSettingsPage languageSettingsPage;

    @BeforeClass
    protected void initiliaze() {
        mainPage = new MainPage(driver);
        languageSettingsPage = new LanguageSettingsPage(driver);
    }

    @Test(priority = 2,description = "Language changing test")
    public void languageChanging(){
        mainPage.clickChangeLanguageButton();
        languageSettingsPage.selectEnglishLanguage();
        languageSettingsPage.clickSaveButton();
        String actualLanguage = mainPage.getEnglishLanguageLabel();
        Assert.assertEquals(actualLanguage, "Eng");
    }



}
