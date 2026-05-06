package com.SauceDemo.Swanglabs.Pages;

import com.SauceDemo.Swanglabs.BaseTest.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public int getProductCount() {
        return 0;
    }

    public List<String> getProductNamesList() {
        return null;
    }

    public void addProductToCart(String productName) {
    }

    public CartPage clickCartIcon() {
        return null;
    }

    public void selectSortBy(String visibleText) {
    }
}

