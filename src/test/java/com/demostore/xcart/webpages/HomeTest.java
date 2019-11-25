package com.demostore.xcart.webpages;
/*
 * Created By Trupti Patel on 2019-05-26
 */

import com.demostore.xcart.pageobjects.HomePage;
import com.demostore.xcart.testbase.TestBase;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    HomePage homePage =  new HomePage();

    @Test
    public void userShoulcClickOnSignUpButton(){
       homePage.clickOnSignInOrSignUP();
    }


}
