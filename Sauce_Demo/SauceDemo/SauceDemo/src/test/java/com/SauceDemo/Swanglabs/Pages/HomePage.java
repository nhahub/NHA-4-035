package com.SauceDemo.Swanglabs.Pages;

import com.SauceDemo.Swanglabs.BaseTest.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static By pageTitle = By.className("app_logo");

    public static boolean isTitleDisplayed() {
        try {
            return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public String getTitleText() {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
