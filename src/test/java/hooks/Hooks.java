package hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver chromeDriver;


    @Before
    public void openBrowser(){
        System.out.println("Opening a browser....");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

    }

    @After
    public void closeBrowser(){
        if (chromeDriver != 0){
            System.out.println("Closing a browser...");
        }
    }
}
