package com.SauceDemo.Swanglabs.TestCase;

import com.SauceDemo.Swanglabs.BaseTest.BaseTest;
import com.SauceDemo.Swanglabs.Pages.HomePage;
import com.SauceDemo.Swanglabs.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
                {"standard_user", "secret_sauce", "success"},
                {"locked_out_user", "secret_sauce", "error"},
                {"invalid_user", "secret_sauce", "error"},
                {"", "", "error"},
                {"standard_user", "wrong_pass", "error"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String user, String pass, String expectedResult) {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage
                .Load()
                .login(user, pass);

        if (expectedResult.equals("error")) {
            Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Must Error Message Displayed" + user);
        } else {
            HomePage homePage = new HomePage(getDriver());
            Assert.assertTrue(homePage.isTitleDisplayed(), "Must be redirected to Home Page " + user);
        }
    }
}
