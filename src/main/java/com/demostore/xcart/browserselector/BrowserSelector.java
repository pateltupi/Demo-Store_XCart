package com.demostore.xcart.browserselector;
/*
 * Created By Trupti Patel on 2019-05-26
 */

import com.demostore.xcart.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector  extends BasePage {
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/com/demostore/xcart/resources/driver/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.getProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/java/com/demostore/xcart/resources/driver/geckodriver");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/test/java/com/demostore/xcart/resources/driver/IEDriverServer");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong Browser Selected");
        }
    }


}
