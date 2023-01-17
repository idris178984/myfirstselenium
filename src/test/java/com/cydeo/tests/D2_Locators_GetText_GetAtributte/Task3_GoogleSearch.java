package com.cydeo.tests.D2_Locators_GetText_GetAtributte;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_GoogleSearch {
    public static void main(String[] args) {

       // TC#3: Google search
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://google.com
        driver.get("https://www.google.com");

        // 3- Write “apple” in search box
        // 4- press enter using key enter
        WebElement searchGoogleBox=driver.findElement(By.name("q"));
        searchGoogleBox.sendKeys("apple"+ Keys.ENTER);

        // 5- Verify title:
        //Expected: Title should start with “Apple” word

        String expectedTitle="apple";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TITLE VERİFİCATİON PASSED");
        }else{
            System.out.println("TITLE VERİFİCATİON FAILED!");
        }
    }
}
