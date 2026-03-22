package com.seleniumAdvanceFramework.tests.VWO;


import com.seleniumAdvanceFramework.pages.PageObjectModel.VWO.DashboardPage;
import com.seleniumAdvanceFramework.pages.PageObjectModel.VWO.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_01_Normal_POM {
    //We need to follow below three things
    // D - Driver
    // L - Locators
    // V - Verification - Assertions
    @Owner("Shiva")
    @Description("Verify with invalid email, pass, error message is shown")
    @Test
    public void test_negative_vwo_login()
    {
        WebDriver driver = new ChromeDriver();// D
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver); // L
        String error_msg =loginPage.loginToVWOInvalidCredentials("adminn","asdf@1234");
        //V - Assertions
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Owner("Shiva")
    @Description("Verify with valid email, pass,logins and open dashboard page")
    @Test
    public void test_positive_vwo_login()
    {
        WebDriver driver = new ChromeDriver();// D
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver); // L
        loginPage.loginToVWOvalidCredentials("cxh04@tempumail.cc","ILoveDrive#08");
        //V - Assertions
        DashboardPage dashboardPage = new DashboardPage(driver);
        String userNameLoggedIN= dashboardPage.validateWhoIsLoggedIn();
        Assert.assertEquals(userNameLoggedIN,"Kishore J");
        driver.quit();
    }

}
