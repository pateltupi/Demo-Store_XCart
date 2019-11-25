package com.demostore.xcart.pageobjects;
/*
 * Created By Trupti Patel on 2019-05-26
 */

import com.demostore.xcart.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class NewSignUpPage extends Util {
    //Method and locators for new sign up page with By by

    public static final Logger log = LogManager.getLogger(NewSignUpPage.class.getName());
    By creatNewAc = By.xpath("//a[contains(@class,'popup-button default-popup-button create-account-link')]");
    By email = By.id("login");
    By password = By.id("password");
    By confirmPass = By.id("password-conf");
    //By creatBtn = By.className("btn  regular-main-button  submit");
    By creatBtn =  By.xpath("//div[contains(@class,'button submit')]//button[contains(@class,'submit')]");


    public void clickOnCreatNewAccount(){
        log.info("Click on creat new Account");
        clickonElement(creatNewAc);
    }
    public String randomEmail(){
        return ("cart" + generateRandomNumber()+"yahoo.com");
    }
    public void userShouldSendTextToEmail(String mail){
        log.info("Send text to email field");
        sendTextToElement(email,mail);
    }
    public void  userShouldSendTextToPassword(String pass){
        log.info("Enter to passowrd field");
        sendTextToElement(password, pass);
    }
    public void userShouldSendTextToConfiemPassword(String confirm){
        log.info("Enter text to confirm password");
        sendTextToElement(confirmPass,confirm);
    }
    public void userShouldClickOnCreatButton(){
        log.info("Click on creat button");
        clickAndHoldElement(creatBtn);
    }
}
