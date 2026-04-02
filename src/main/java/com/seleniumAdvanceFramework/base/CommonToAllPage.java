package com.seleniumAdvanceFramework.base;

import com.seleniumAdvanceFramework.utils.PropertiesReader;
import org.openqa.selenium.By;

import static com.seleniumAdvanceFramework.driver.DriverManager.getDriver;

public class CommonToAllPage {
    //This will use for all
    public void openVWOUrl()
    {
        getDriver().get(PropertiesReader.readKey("url"));
        //we can use getDriver directly because it is static in nature under DriverManager Class
    }
    public void openOrangeHRMUrl()
    {
        getDriver().get(PropertiesReader.readKey("url"));
    }
    public void openKatalonUrl()
    {
        getDriver().get(PropertiesReader.readKey("url"));
    }
    //we have also other things that are common so we will use
    public void clickElement(By by)
    {
        getDriver().findElement(by).click();
    }
    public void enterInput(By by, String key)
    {
        getDriver().findElement(by).sendKeys(key);
    }
}
