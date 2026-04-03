package com.seleniumAdvanceFramework.pages.PageObjectModel.VWO.improved_POM;

import com.seleniumAdvanceFramework.base.CommonToAllPage;
import com.seleniumAdvanceFramework.utils.WaitHelper.java.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.seleniumAdvanceFramework.driver.DriverManager.getDriver;


public class LoginPage extends CommonToAllPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Step 1 - Page Locators
    private By username=By.id("login-username");//used Encapsulation
    private By password=By.id("login-password");
    private By SignButton=By.id("js-login-btn");
    private By error_message=By.id("js-notification-box-msg");

    public String loginToVWOLoginInvalidCreds(String user, String pwd)
    {
        openVWOUrl();
        enterInput(username, user);
        enterInput(password, pwd);
        clickElement(SignButton);
        WaitHelper.checkVisibility(getDriver(),error_message);
        return getText(error_message);
    }

}
