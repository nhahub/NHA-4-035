package com.SauceDemo.Swanglabs.Pages;

import com.SauceDemo.Swanglabs.BaseTest.BasePage;
import com.SauceDemo.Swanglabs.Pages.CheckoutPages.CheckoutInfoPage;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartPageHeader() {
        return null;
    }

    public void removeItem(String productName) {
    }

    public ProductPage clickContinueShopping() {
        return null;
    }

    public CheckoutInfoPage clickCheckout() {
        return null;
    }
}

