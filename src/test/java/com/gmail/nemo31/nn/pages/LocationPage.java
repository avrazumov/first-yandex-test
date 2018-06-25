package com.gmail.nemo31.nn.pages;

import io.qameta.allure.Step;
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
    public WebElement autoCityLocationChecbox;

    @FindBy(id = "city__front-input")
    public WebElement cityInputField;

    @FindBy(css = "ul li:nth-child(1)")
    public WebElement firstCityFromList;

    @Step("Changing location to London")
    public void ChangingCityLondon(){
        autoCityLocationChecbox.click();
        cityInputField.sendKeys("Лондон");
        firstCityFromList.click();
    }

    @Step("Changing location to Paris")
    public void ChangingCityParis(){
        driver.get("https://yandex.by/tune/geo/?retpath=https%3A%2F%2Fwww.yandex.by%2F%3Fdomredir%3D1&nosync=1");
        cityInputField.clear();
        cityInputField.sendKeys("Париж");
        cityInputField.clear();
        cityInputField.sendKeys("Париж");
        cityInputField.clear();
        cityInputField.sendKeys("Париж");
        cityInputField.clear();
        cityInputField.sendKeys("Париж");
        cityInputField.clear();
        cityInputField.sendKeys("Париж");
        (new WebDriverWait(driver,200)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul li:nth-child(1)")));
        firstCityFromList.click();
    }



}

