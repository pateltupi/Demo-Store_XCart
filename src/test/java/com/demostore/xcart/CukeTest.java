package com.demostore.xcart;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
 * Created By Trupti Patel on 2019-05-28
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-reports"},
        tags = "@sale",
        monochrome = true
)


public class CukeTest {
}
