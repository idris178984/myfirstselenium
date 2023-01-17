package com.cydeo.tests.D2_Locators_GetText_GetAtributte;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_CydeoVerifications {

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // 2. Go to https://practice.cydeo.com 3. Verify URL contains
        driver.get("https://practice.cydeo.com");

        //3. Verify URL contains
       // Expected: cydeo
        String expectedUrl="cydeo";
        String actualUrl= driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL VERİFİCATİON PASSED");
        }else{
            System.out.println("URL VERİFİCATİON FAİLED");
        }

        // 4. Verify title:
       // Expected: Practice
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TİTLE VERİFİCATİON PASSED");
        }else{
            System.out.println("TİTLE VERİFİCATİON FAİLED");
        }
        driver.close();

    }
}
