package com.cydeo.tests.RECAP;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class D2_T4 {

    @Test
    public void T4_Test(){

        //1. Open Chrome browser
        //2. Go to http://library2.cybertekschool.com/login.html
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        WebElement username=Driver.getDriver().findElement(By.xpath("//label[@for='inputEmail']"));
        //3. Enter username: “incorrect password”
        username.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement password=Driver.getDriver().findElement(By.xpath("//label[.='Password']"));
        password.sendKeys("incorrect password");

        //5. Click to Sign in button
        WebElement signInButton = Driver.getDriver().findElement(By.tagName("button"));
        signInButton.click();


        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed


    }
}
