package com.cydeo.tests.D1_Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Yahoo_TitleVerification {

    public static void main(String[] args) {



        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://www.yahoo.com
        driver.get(" https://www.yahoo.com");

        // 3. Verify title:
        // Expected: Yahoo
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("VERIFICATION TITLE IS PASSED");
        } else {
            System.out.println("VERIFICATION TITLE IS FAILED!!!");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
        }
        String expectedURL=" https://www.yahoo.com/";
        String actualURL= driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("VERIFICATION URL IS PASSED");
        }else{
            System.out.println("VERIFICATION URL S FAILED!!!");
            System.out.println("expectedURL = " + expectedURL);
            System.out.println("actualURL = " + actualURL);
        }


        }

    }

