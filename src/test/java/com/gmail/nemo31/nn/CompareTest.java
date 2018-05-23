package com.gmail.nemo31.nn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class CompareTest extends BaseTest {

    public static MainPage mainPage;
    public static LocationPage locationPage;

    @BeforeClass
    protected void initiliaze(){
        mainPage = new MainPage(driver);
        locationPage = new LocationPage(driver);
    }

    @Test
    public void comparing(){
        locationPage.londonCityChanging();
        mainPage.getMoreLondonButtons();
        ArrayList londonButtons = mainPage.moreButtonsGetText();
        locationPage.parisCityChanging();
        mainPage.getMoreParisButtons();
        ArrayList parisButtons = mainPage.moreButtonsGetText();
        Assert.assertEquals(londonButtons,parisButtons);
    }
    }






