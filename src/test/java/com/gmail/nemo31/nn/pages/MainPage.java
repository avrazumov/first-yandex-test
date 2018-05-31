package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy (css = "a.home-link.home-link_blue_yes.home-tabs__link.home-tabs__more-switcher")
    public WebElement moreButton;
    public List<WebElement> moreButtons = new ArrayList<WebElement>();

    @FindBy (css = ".i-bem.desk-notif-card_js_inited > div > a")
    public WebElement mailButton;

    @FindBy(css = ".home-arrow__tabs div a:nth-child(1)")
    public WebElement videoButton;

    @FindBy(css = ".home-arrow__tabs div a:nth-child(2)")
    public WebElement picturesButton;

    @FindBy(css = ".home-arrow__tabs div a:nth-child(3)")
    public WebElement newsButton;

    @FindBy(css = ".home-arrow__tabs div a:nth-child(4)")
    public WebElement mapsButton;

    @FindBy(css = ".home-arrow__tabs div a:nth-child(5)")
    public WebElement marketButton;

    @FindBy(css = ".home-arrow__tabs div a:nth-child(6)")
    public WebElement translaitorButton;

    @FindBy(css = ".home-arrow__tabs div a:nth-child(7)")
    public WebElement musicButton;

    public ArrayList getMoreButtonsText(){
        final ArrayList<String> buttonsName = new ArrayList<String>();
        for (WebElement button:moreButtons) {
            String textName = button.getText();
            buttonsName.add(textName);
        }
        return buttonsName;
    }

    public void getMoreLondonButtons(){
        (new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.home-link.home-link_blue_yes.home-tabs__link.home-tabs__more-switcher")));
        moreButton.click();
        moreButtons = driver.findElements(By.cssSelector("div.home-tabs__more-top div"));
    }

    public void getMoreParisButtons(){
        (new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.home-link.home-link_blue_yes.home-tabs__link.home-tabs__more-switcher")));
        moreButton.click();
        moreButtons = driver.findElements(By.cssSelector("div.home-tabs__more-top div"));
    }

    public void clickMailButton(){
        mailButton.click();
    }

    public void logOutChecking(){
        String mainPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(mainPageUrl,"https://yandex.by/");
    }

    public void clickVideoButton(){
        videoButton.click();
    }

    public void clickPicturesButton(){
        picturesButton.click();
    }

    public void clickNewsButton(){
        newsButton.click();
    }

    public void clickMapsButton(){
        mapsButton.click();
    }

    public void clickMarketButton(){
        marketButton.click();
    }

    public void clickTranslaitorButton(){
        translaitorButton.click();
    }

    public void clickMusicButton(){
        musicButton.click();
    }










}
