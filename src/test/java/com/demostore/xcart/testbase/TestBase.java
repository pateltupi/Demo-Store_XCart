package com.demostore.xcart.testbase;
/*
 * Created By Trupti Patel on 2019-05-26
 */

import com.demostore.xcart.basepage.BasePage;
import com.demostore.xcart.browserselector.BrowserSelector;
import com.demostore.xcart.propertise.LoadProperties;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties loadProperties = new LoadProperties();

    String browser = loadProperties.getProperty("browser");
    String baseUrl = loadProperties.getProperty("baseUrl");
    /*
      to open url we make before
     */
    @BeforeClass
    public  void setUpBeforeClass(){
        PropertyConfigurator.configure("/Users/surajbharmal/IdeaProjects/sample-nopcommerce-maven-project/src/test/java/com/demo/nopcommerce/resources/configfile/log4j.properties");
    }
    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }


}
