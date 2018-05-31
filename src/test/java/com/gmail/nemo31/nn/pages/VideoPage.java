package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VideoPage {
    public VideoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    public void checkVideoPage(){
        String videoPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(videoPageUrl, "https://yandex.by/video/");
        driver.get("https://www.yandex.by/");
    }
}
