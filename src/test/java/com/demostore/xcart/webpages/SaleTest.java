package com.demostore.xcart.webpages;
/*
 * Created By Trupti Patel on 2019-05-27
 */

import com.demostore.xcart.pageobjects.SalePage;
import com.demostore.xcart.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaleTest  extends TestBase {
    SalePage salePage = new SalePage();
// locator anf method for sale page and locater done By by
    @Test
    public void userShouldExploreTheProduct(){
        salePage.userMouseHoverOnHotDeals();
        //salePage.mouseHoverOnSaleButton();
        salePage.userClickOnSaleBtn();
        salePage.userShouldClickOnProdcutStarTrek();
        Assert.assertTrue(salePage.veryfyTextFromProductBar());
    }

}
