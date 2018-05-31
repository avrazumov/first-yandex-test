package com.gmail.nemo31.nn.tests;

import com.gmail.nemo31.nn.pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {
    public static MainPage mainPage;
    public static VideoPage videoPage;
    public static PicturesPage picturesPage;
    public static NewsPage newsPage;
    public static MapsPage mapsPage;
    public static MarketPage marketPage;
    public static TranslaitorPage translaitorPage;
    public static MusicPage musicPage;

    @BeforeClass
    protected void initiliaze() {
        mainPage = new MainPage(driver);
        videoPage = new VideoPage(driver);
        picturesPage = new PicturesPage(driver);
        newsPage = new NewsPage(driver);
        mapsPage = new MapsPage(driver);
        marketPage = new MarketPage(driver);
        translaitorPage = new TranslaitorPage(driver);
        musicPage = new MusicPage(driver);
    }

    @Test
    public void navigationTest(){
        mainPage.clickVideoButton();
        videoPage.checkVideoPage();
        mainPage.clickPicturesButton();
        picturesPage.checkPicturesPage();
        mainPage.clickNewsButton();
        newsPage.checkNewsPage();
        mainPage.clickMapsButton();
        mapsPage.checkMapsPage();
        mainPage.clickMarketButton();
        marketPage.checkMarketPage();
        mainPage.clickTranslaitorButton();
        translaitorPage.checkTranslaitorPage();
        mainPage.clickMusicButton();
        musicPage.checkMusicPage();
    }
}
