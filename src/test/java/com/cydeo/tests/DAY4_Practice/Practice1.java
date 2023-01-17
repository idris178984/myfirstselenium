package com.cydeo.tests.DAY4_Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Practice1 {
    public static void main(String[] args) {


        //TC #6: XPATH LOCATOR practice
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        // 3. Click on Button 1
        WebElement buttonOne= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        buttonOne.click();
        //4. Verify text displayed is as expected:
        System.out.println("buttonOne.isDisplayed() = " + buttonOne.isDisplayed());
        // Expected: “Clicked on button one!”
        WebElement clickedOnButtonOne= driver.findElement(By.xpath("//p[@id='result']"));

        String expected="Clicked on button one!";
        String actual= clickedOnButtonOne.getText();

        if(actual.equals(expected)){
            System.out.println("VERIFICATION IS PASSED");
        }else{
            System.out.println("VERIFICATION IS FAİLED!!!");

            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
    }
}
