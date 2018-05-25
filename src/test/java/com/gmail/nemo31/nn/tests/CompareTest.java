package com.gmail.nemo31.nn.tests;

import com.gmail.nemo31.nn.pages.LocationPage;
import com.gmail.nemo31.nn.pages.MainPage;
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
        locationPage.ChangingCityLondon();
        mainPage.getMoreLondonButtons();
        ArrayList londonButtons = mainPage.getMoreButtonsText();
        locationPage.ChangingCityParis();
        mainPage.getMoreParisButtons();
        ArrayList parisButtons = mainPage.getMoreButtonsText();
        Assert.assertEquals(londonButtons,parisButtons);
    }
    }






