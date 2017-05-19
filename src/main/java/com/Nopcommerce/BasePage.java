package com.Nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class BasePage {

    public static WebDriver driver;

    BasePage(){

        PageFactory.initElements(driver, this);
    }
}
