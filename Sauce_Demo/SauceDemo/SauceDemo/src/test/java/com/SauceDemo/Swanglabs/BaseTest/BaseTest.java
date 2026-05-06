package com.SauceDemo.Swanglabs.BaseTest;

import com.SauceDemo.Swanglabs.Factory.DriverFactory;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseTest {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }


    public WebDriver getDriver() {
        return this.driver.get();
    }


    @BeforeMethod
    public void setUp() {
        WebDriver driver = new DriverFactory().initilizeDrive();
        setDriver(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        String testCaseName = result.getMethod().getMethodName();
        File file = new File("target" + File.separator + "ScreenShots" + File.separator + testCaseName + File.separator + ".png");
        TakeScreenShots(file);
        if (driver != null) {
            getDriver().quit();
        }
    }

    public void TakeScreenShots(File destFile) {
        File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, destFile);
            InputStream inputStream = new FileInputStream(destFile);
            Allure.addAttachment("ScreenShots", inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}