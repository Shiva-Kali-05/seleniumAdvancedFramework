package com.seleniumAdvanceFramework.tests.VWO;

import com.seleniumAdvanceFramework.baseTest.CommonToAllTest;
import com.seleniumAdvanceFramework.driver.DriverManager;
import com.seleniumAdvanceFramework.pages.PageObjectModel.VWO.improved_POM.LoginPage;
import com.seleniumAdvanceFramework.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_02_Pro_Improved_POM extends CommonToAllTest {
    @Owner("Shiva")
    @Description("Verify with invalid email, pass,logins and open dashboard page")
    @Test
    public void test_negative_vwo_login()
    {
        //WebDriver driver = new ChromeDriver();
        //driver.get(PropertiesReader.readKey("url"));
        //LoginPage loginPage = new LoginPage(driver);
        //String error_msg=loginPage.loginToVWOInvalidCredentials(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));
        //assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        //Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));
        //Now this looks much cleaner, no hardcode value in this case but there is a problem

        //The above code is not good actually bcoz, everytime you create a chrome driver, it does not look good
        // & secondly we don't have any mechanism for logs, we need to improve this.


        //More improved code is below
        LoginPage loginPage= new LoginPage(DriverManager.getDriver());
        String error_msg=loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));

    }
}
