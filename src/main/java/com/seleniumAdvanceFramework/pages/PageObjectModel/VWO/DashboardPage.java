package com.seleniumAdvanceFramework.pages.PageObjectModel.VWO;

import com.seleniumAdvanceFramework.utils.WaitHelper.java.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver driver)
    {
        this.driver=driver;
    }
    private By userNameLoggedIn= By.xpath("//span[@data-qa='lufexuloga\"]");
    public String validateWhoIsLoggedIn()
    {
        WaitHelper.waitJVM(10000);
        driver.get("https://app.vwo.com/#/dashboard?accountId=1207845");
        WaitHelper.waitJVM(4000);
        return driver.findElement(userNameLoggedIn).getText();
    }
}
