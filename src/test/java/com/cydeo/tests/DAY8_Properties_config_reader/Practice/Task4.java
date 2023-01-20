package com.cydeo.tests.DAY8_Properties_config_reader.Practice;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task4 {

    //public static void main(String[] args)
    //
    @Test
            public void google_search_test(){


       // TC #4: Google search
       // 1- Open a chrome browser
        // 2- Go to: https://google.com
        Driver.getDriver().get("https://www.google.com");


       // 3- Write “apple” in search box
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        //4- Verify title:
       // Expected: apple - Google Search
        String expectedTitle=ConfigurationReader.getProperty("searchValue")+"-Google Ara";
        String actualTitle=Driver.getDriver().getTitle();



    }
}
