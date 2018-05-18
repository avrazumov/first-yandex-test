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
        driver.get("https://yandex.by/tune/geo/?retpath=https%3A%2F%2Fwww.yandex.by%2F%3Fdomredir%3D1&nosync=1");
        locationPage.checboxClicking();
        locationPage.cityInput("Лондон");
        locationPage.cityClicking();
        mainPage.moreButtonWaiting();
        mainPage.moreButtonClicking();
        mainPage.getButtons();
        ArrayList londonButtons = mainPage.moreButtonsGetText();

        //Смена местоположения на Париж
        driver.get("https://yandex.by/tune/geo/?retpath=https%3A%2F%2Fwww.yandex.by%2F%3Fdomredir%3D1&nosync=1");
        locationPage.cityClearing();
        locationPage.cityInput("Париж ");
        locationPage.cityClearing();
        locationPage.cityInput("Париж ");
        locationPage.cityClearing();
        locationPage.cityInput("Париж ");
        locationPage.cityClearing();
        locationPage.cityInput("Париж ");
        locationPage.cityClearing();
        locationPage.cityInput("Париж ");
        locationPage.cityClearing();
        locationPage.cityInput("Париж ");




        locationPage.parisWaiting();
        locationPage.cityClicking();
        mainPage.moreButtonWaiting();
        mainPage.moreButtonClicking();
        mainPage.getButtons();
        ArrayList parisButtons = mainPage.moreButtonsGetText();

        //Comparing

        Assert.assertEquals(londonButtons,parisButtons);

    }
    }






