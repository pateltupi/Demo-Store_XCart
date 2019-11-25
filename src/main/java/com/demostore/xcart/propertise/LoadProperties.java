package com.demostore.xcart.propertise;
/*
 * Created By Trupti Patel on 2019-05-26
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    static Properties prop;

    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream("/Users/surajbharmal/IdeaProjects/demo-store-x-cart/src/test/java/com/demostore/xcart/resources/configfile/config.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         return prop.getProperty(key);
    }
}
