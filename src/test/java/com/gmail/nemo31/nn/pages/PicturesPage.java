package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PicturesPage {
    public PicturesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    public void checkPicturesPage(){
        String picturesPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(picturesPageUrl, "https://yandex.by/images/");
        driver.get("https://www.yandex.by/");
    }
}
