package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MapsPage {
    public MapsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    public void checkMapsPage(){
        String mapsPageUrl = driver.getTitle();
        Assert.assertEquals(mapsPageUrl, "Яндекс.Карты — подробная карта Беларуси и мира");
        driver.get("https://www.yandex.by/");
    }
}
