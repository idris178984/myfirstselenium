package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns.PRACTİCES;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) {

       // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        WebElement AddElement= driver.findElement(By.xpath("//button[.='Add Element']"));

        AddElement.click();

       // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton= driver.findElement(By.xpath("//button[.='Delete']"));


            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());


        // 5. Click to “Delete” button.
        deleteButton.click();

       // 6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
