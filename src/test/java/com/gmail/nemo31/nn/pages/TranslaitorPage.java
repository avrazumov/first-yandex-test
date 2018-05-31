package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TranslaitorPage {
    public TranslaitorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    public void checkTranslaitorPage(){
        String translaitorPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(translaitorPageUrl, "https://translate.yandex.by/");
        driver.get("https://www.yandex.by/");
    }
}
