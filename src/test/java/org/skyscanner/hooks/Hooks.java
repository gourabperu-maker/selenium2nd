package org.skyscanner.hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
   // public static WebDriver driver; // import driver instance. Not applicable for real projects for Not Thread safe,Harder to maintain, Difficult cleanup

    public static WebDriver driver;

    @Before
    public void openBrowser(){
        System.out.println("Opening a browser....");
        System.setProperty("WebDriver.Chrome.driver","src/test/resources/driver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser(){
        if (driver != null){
            System.out.println("Closing a browser...");
            driver.quit();
        }
    }


   }


