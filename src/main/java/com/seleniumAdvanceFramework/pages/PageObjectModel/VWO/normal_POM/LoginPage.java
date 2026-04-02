package com.seleniumAdvanceFramework.pages.PageObjectModel.VWO.normal_POM;

import com.seleniumAdvanceFramework.base.CommonToAllPage;
import com.seleniumAdvanceFramework.utils.WaitHelper.java.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //Here we have to do two things
    //Page Locators and Page Actions

    WebDriver driver; //every page required driver
    //Creating a Parameterized constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //Now will use Page Locators
    private By username=By.id("login-username");//used Encapsulation
    private By password=By.id("login-password");
    private By SignButton=By.id("js-login-btn");
    private By error_message=By.id("js-notification-box-msg");

    //Now will use Page Actions
    public String loginToVWOInvalidCredentials(String usr, String pwd)
    {
        driver.findElement(username).sendKeys(usr);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(SignButton).click();
        WaitHelper.checkVisibility(driver, error_message);
        String error_message_text= driver.findElement(error_message).getText();
        return error_message_text;
    }

    public void loginToVWOvalidCredentials(String usr, String pwd)
    {
        driver.findElement(username).sendKeys(usr);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(SignButton).click();
    }
}
