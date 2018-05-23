package com.gmail.nemo31.nn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationPage {
    public LocationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "div.city__checkbox > span > span")
    public WebElement autoChecbox;

    @FindBy(id = "city__front-input")
    public WebElement cityField;

    @FindBy(css = "ul li:nth-child(1)")
    public WebElement cityPL;

    public void londonCityChanging(){
        autoChecbox.click();
        cityField.sendKeys("Лондон");
        cityPL.click();
    }

    public void parisCityChanging(){
        driver.get("https://yandex.by/tune/geo/?retpath=https%3A%2F%2Fwww.yandex.by%2F%3Fdomredir%3D1&nosync=1");
        cityField.clear();
        cityField.sendKeys("Париж");
        cityField.clear();
        cityField.sendKeys("Париж");
        cityField.clear();
        cityField.sendKeys("Париж");
        cityField.clear();
        cityField.sendKeys("Париж");
        cityField.clear();
        cityField.sendKeys("Париж");
        (new WebDriverWait(driver,200)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul li:nth-child(1)")));
        cityPL.click();
    }



}

