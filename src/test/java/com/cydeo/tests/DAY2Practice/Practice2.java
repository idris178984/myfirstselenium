package com.cydeo.tests.DAY2Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

    public static void main(String[] args) {

       // TC #2: Back and forth navigation
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

       // 3- Click to A/B Testing from top of the list.
        WebElement ABLinkTesting= driver.findElement(By.linkText("A/B Testing"));
        ABLinkTesting.click();

        // 4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle="No A/B Test";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TITLE VERİFİCATİON PASSED");
        }else{
            System.out.println("TITLE VERİFİCATİON FAILED!");
        }

       // 5- Go back to home page by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
       // Expected: Practice
        String expectedTitle2="Practice";
         actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle2)){
            System.out.println("TITLE VERİFİCATİON PASSED");
        }else{
            System.out.println("TITLE VERİFİCATİON FAILED!");
        }
    }
}
