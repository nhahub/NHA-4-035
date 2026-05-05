package com.SauceDemo.Swanglabs.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void ClickElement(By element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void SendKeys(By element, String Data) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(Data);
    }


}



