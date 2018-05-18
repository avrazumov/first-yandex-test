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



    public void checboxClicking(){
        autoChecbox.click();
    }

    public void cityInput(String city){
        cityField.sendKeys(city);
    }


    public void cityClicking(){
        cityPL.click();
    }

    public void cityClearing(){
        cityField.clear();
    }

    public void parisWaiting(){
        (new WebDriverWait(driver,200)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul li:nth-child(1)")));
    }



}

