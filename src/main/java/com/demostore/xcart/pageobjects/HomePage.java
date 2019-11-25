package com.demostore.xcart.pageobjects;
/*
 * Created By Trupti Patel on 2019-05-26
 */


import com.demostore.xcart.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By signInUp = By.xpath("//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]");

    //For Sign in Method

    public  void clickOnSignInOrSignUP(){
        log.info("click on sign in or sign up");
        clickonElement(signInUp);
    }


}
