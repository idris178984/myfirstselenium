package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns.PRACTİCES;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2 {

    public static void main(String[] args) {

       // DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #2: Radiobutton handling
       // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

       // 3. Click to “Hockey” radio button
        WebElement Hockey= driver.findElement(By.xpath("//input[@id='hockey']"));
        Hockey.click();
       // 4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("Hockey.isSelected() = " + Hockey.isSelected());


    }
}
