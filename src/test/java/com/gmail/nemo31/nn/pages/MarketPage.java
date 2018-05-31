package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MarketPage {
    public MarketPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    public void checkMarketPage(){
        String marketPageUrl = driver.getTitle();
        Assert.assertEquals(marketPageUrl, "Яндекс.Маркет — выбор и покупка товаров из проверенных интернет-магазинов");
        driver.get("https://www.yandex.by/");
    }
}
