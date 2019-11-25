package com.demostore.xcart;
/*
 * Created By Trupti Patel on 2019-05-28
 */

import com.demostore.xcart.basepage.BasePage;
import com.demostore.xcart.browserselector.BrowserSelector;
import com.demostore.xcart.propertise.LoadProperties;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties loadProperties = new LoadProperties();

    String browser = loadProperties.getProperty(("browser"));
    String baseUrl =  loadProperties.getProperty("baseUrl");
    @Before
    public void setUp(){
        browserSelector.selectBrowser(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
