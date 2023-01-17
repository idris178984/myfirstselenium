package com.cydeo.tests.DAY2Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

    public static void main(String[] args) throws InterruptedException {

       // TC #1: Cydeo practice tool verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");


        // 3. Verify URL contains
        //Expected: cydeo
        String expectedURL="cydeo";
        String currentURL= driver.getCurrentUrl();

        if(currentURL.contains(expectedURL)){
            System.out.println("VERIFICATION URL PASSED");
        }else{
            System.out.println("VERIFICATION URL FAİLED!");

        }
        // 4. Verify title:
       // Expected: Practice
        String expectedTitle="Practice";
        String currentTitle= driver.getTitle();

        if(currentTitle.equals(expectedTitle)){
            System.out.println("VERIFICATION TİTLE PASSED");
        }else{
            System.out.println("VERIFICATION TİTLE FAİLED!");

        }

    }
}
