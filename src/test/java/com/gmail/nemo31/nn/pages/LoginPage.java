package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "div:nth-child(10) label input")
    public WebElement loginInput;

    @FindBy(css = "div:nth-child(11) label input")
    public WebElement passwordInput;

    @FindBy(css = "button:nth-child(1) span span")
    public WebElement loginButton;

    public void setLogin(){
        loginInput.sendKeys("AutotestUser");
    }

    public void setPassword(){
        passwordInput.sendKeys("AutotestUser123");
    }

    public void clickLoginButton(){
        loginButton.click();
    }








}
