package com.cydeo.tests.d1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

       // TC #1: Yahoo Title Verification
         //set up the browser driver
        WebDriverManager.chromedriver().setup();


//1. Open Chrome browser
        //This line is opening empty browser
        WebDriver driver=new ChromeDriver();

        //this line maximize browser size
        driver.manage().window().maximize();
//2. Go to https://www.yahoo.com 3. Verify title:
        driver.get("https://www.yahoo.com");

//Expected: Yahoo| weather,search,politics
        String expectedTitle="Yahoo| weather,search,politics";

        //actual title comes from browser
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification is passed");
        }else{
            System.out.println("Title is not expected. Verification is failed");
        }



    }
}
