package com.cydeo.tests.d1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) {
        //Setting up to web driver manager
             //we create our browser
        WebDriverManager.chromedriver().setup();

        //Create instance of chrome driver
        WebDriver driver =new ChromeDriver();

        //Test if driver is working as expected
        driver.get("https://www.facebook.com");

    }
}
