package com.seleniumAdvanceFramework.driver;

import com.seleniumAdvanceFramework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {
    //The role of DriverManager class is to make sure it will give you whatever the user will give you as per the user had asked
    // In future if this dirver is basically based on Thread local support then it should give that also.
    //It means multiple parallel test cases can be possible.


    public static WebDriver driver;  //Keep WebDriver as Static - common to all
    //Create a getter and setter to use the driver

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }
    //Create another two Methods for initialization and tear down
    public static void init() //Starting the browser
    {
        //you can get the browser from Property Reader
        String browser= PropertiesReader.readKey("browser");
        browser=browser.toLowerCase();
        switch (browser)
        {
            case "edge":
                EdgeOptions edgeOptions= new EdgeOptions();
                edgeOptions.addArguments("--Start-Maximized");
                edgeOptions.addArguments("--Guest");
                driver=new EdgeDriver(edgeOptions);
                break;
            case "chrome":
                ChromeOptions chromeOptions= new ChromeOptions();
                chromeOptions.addArguments("--Start-Maximized");
                chromeOptions.addArguments("--Guest");
                driver=new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions=new FirefoxOptions();
                firefoxOptions.addArguments("---Start-Maximized");
                firefoxOptions.addArguments("--Guest");
                driver=new FirefoxDriver(firefoxOptions);
                break;

            default:
                System.out.println("Not supported with this browser");
        }
    }
    public static void Down()//Closing the browser
    {
        if(getDriver()!=null)
        {
            driver.quit();
            driver=null;
        }

    }
}
