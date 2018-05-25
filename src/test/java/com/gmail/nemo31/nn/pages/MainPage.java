package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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










}
