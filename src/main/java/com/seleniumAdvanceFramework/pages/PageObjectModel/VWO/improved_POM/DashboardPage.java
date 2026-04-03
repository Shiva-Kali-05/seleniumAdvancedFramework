package com.seleniumAdvanceFramework.pages.PageObjectModel.VWO.improved_POM;

import com.seleniumAdvanceFramework.base.CommonToAllPage;
import com.seleniumAdvanceFramework.utils.WaitHelper.java.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DashboardPage extends CommonToAllPage {

    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    private By userNameOnDashboard = By.xpath("//span[@data-qa='lufexuloga']");
    public String loggedInUserName() {
        WaitHelper.visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }
}
