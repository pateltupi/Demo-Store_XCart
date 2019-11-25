package com.demostore.xcart.pageobjects;
/*
 * Created By Trupti Patel on 2019-05-27
 */

import com.demostore.xcart.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class SalePage extends Util {
    //this private locater is to print log
    private static final Logger log = LogManager.getLogger(SalePage.class.getName());
// locator anf method for sale page and locater done By by

    By hotDeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Hot deals')]");
    By saleBtn =  By.xpath("//div[@id='page']//li[3]//ul[1]//li[1]//a[1]");
    By product = By.xpath("//li[1]//div[1]//div[1]//a[1]//img[1]");
    By productText = By.xpath("//h1[@class='fn title']");


     public void userMouseHoverOnHotDeals(){
         log.info("Mouse hover on hot deals");
         mouseHoverToElement(hotDeal);
     }
     public void userClickOnSaleBtn(){
         log.info("Click On Sale button");

         clickonElement(saleBtn);
     }
     public void userShouldClickOnProdcutStarTrek(){
         log.info("click On Star Trek");
         clickonElement(product);
     }
     public void mouseHoverOnSaleButton(){
         log.info("Mouse hover On Star Trek");
         mouseHoverToElement(saleBtn);
     }
     public String getProductText(){
         log.info("getting text from product bar");
         return driver.findElement(productText).getText();
     }
     public boolean veryfyTextFromProductBar() {
         if (getProductText().equals("Star Trek Command Cycle Jersey")){
         return true;
     } else {
         return false;
    }
     }
}
