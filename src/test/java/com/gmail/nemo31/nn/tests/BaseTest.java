package com.gmail.nemo31.nn.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    protected WebDriver getDriver(String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.yandex.by");
        driver.get("https://yandex.by/tune/geo/?retpath=https%3A%2F%2Fwww.yandex.by%2F%3Fdomredir%3D1&nosync=1");
        return driver;
    }

    @AfterClass
    protected void tearDown(){
        if (driver !=null)
            driver.quit();
    }








}
