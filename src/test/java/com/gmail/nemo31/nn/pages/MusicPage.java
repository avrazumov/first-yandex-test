package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MusicPage {
    public MusicPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    public String getMusicPageUrl(){
        String musicPageUrl = driver.getCurrentUrl();
        return musicPageUrl;
    }
}
