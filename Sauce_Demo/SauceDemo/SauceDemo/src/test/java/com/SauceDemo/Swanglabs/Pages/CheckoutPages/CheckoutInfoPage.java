package com.SauceDemo.Swanglabs.Pages.CheckoutPages;

import com.SauceDemo.Swanglabs.BaseTest.BasePage;
import com.SauceDemo.Swanglabs.Pages.CartPage;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage extends BasePage {
    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }

    public void enterInformation(String fName, String lName, String zip) {
    }

    public CheckoutOverviewPage clickContinue() {
        return null;
    }

    public CartPage clickCancel() {
        return null;
    }
}

