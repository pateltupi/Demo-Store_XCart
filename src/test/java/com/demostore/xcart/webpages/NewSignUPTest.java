package com.demostore.xcart.webpages;
/*
 * Created By Trupti Patel on 2019-05-26
 */

import com.demostore.xcart.pageobjects.HomePage;
import com.demostore.xcart.pageobjects.NewSignUpPage;
import com.demostore.xcart.testbase.TestBase;
import com.demostore.xcart.utility.Util;
import org.testng.annotations.Test;

public class NewSignUPTest extends TestBase {
    HomePage homePage = new HomePage();
    NewSignUpPage signUp = new NewSignUpPage();
//test run to creat new account
    @Test
    public  void UserClickOnCreateNewACcount(){
        Util util = new Util();
        homePage.clickOnSignInOrSignUP();
        signUp.clickOnCreatNewAccount();
        signUp.userShouldSendTextToEmail("abc@gmail.com");
        signUp.userShouldSendTextToPassword("xyz1234");
        signUp.userShouldSendTextToConfiemPassword("xyz1234");
        signUp.userShouldClickOnCreatButton();
        util.takeScreenShot("New Sign Up");

    }


}
