package com.demostore.xcart.utility;
/*
 * Created By Trupti Patel on 2019-05-26
 */

import com.demostore.xcart.basepage.BasePage;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Util extends BasePage {

    public void clickonElement(By by) {
        driver.findElement(by).click();
    }

    /**
     * This method will generate random number
     *
     * @return
     */
    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    /*
      Send text to ekement
    */
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    /*
    This mehtod is for select visible text from drop down menu
     */
    public void selectVisibleTextFromDropDownMenu(By by, String text) {
        Select dropDown = new Select((driver.findElement(by)));
        dropDown.selectByVisibleText(text);
    }

    /*
    this method is for select by value from drop down Menu
     */
    public void selectByValueFromDropDownMenu(By by, String value) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByValue(value);
    }

    /*
    This method is for select by Index from drop down Menu
     */
    public void selectByIndexFromDropDownMenu(By by, int index) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByIndex(index);
    }

    /*
    This method is for Action by mouseHover
     */
    public void mouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    /*
    This method is for mouse hover to element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    /*This is mehtod for click and drag
     */
    public void clickAndHoldToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }

    /*This is for click and drag with By by

     */
    public void clickAndHoldElement(By by) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(by)).build().perform();
    }

    /* This is for drag and drop with webelemen

     */
    public void dropAndDragElement(WebElement fromElement, WebElement toElement) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
    }

    /*This is the actions class swithching frame from one side to another side

     */
    public void dragAndDropElement(WebElement element) {
        Actions actions = new Actions(driver);
        driver.switchTo().frame(0);
        // actions.dragAndDrop(element ).perform();
    }

    //method to scroll page up
    public void scrollUpDown(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + i + ")");
    }


    //Reture type method  to get text
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * This method will generate random string
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
    //method for poup text
    public String alert()
    {    String str;
        Alert alert =  driver.switchTo().alert();
        str= alert.getText();
        alert.accept();
        return  str;

    }
    /**
     * This method will take screen shot
     */
    public void takeScreenShot() {
        String filePath = System.getProperty("user.dir")+"/src/main/java/com/demo/orangehrmlive/screenshot";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir")+"/src/main/java/com/demostore/xcart/screenshot";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1,new File(filePath + fileName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

