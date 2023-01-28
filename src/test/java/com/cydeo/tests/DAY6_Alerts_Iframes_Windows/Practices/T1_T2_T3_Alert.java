package com.cydeo.tests.DAY6_Alerts_Iframes_Windows.Practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_T2_T3_Alert {

    @Test
    public void T1_Test(){

        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        Driver.getDriver().get("https://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Alert” button
        WebElement clickJSAlert=Driver.getDriver().findElement(By.xpath("//button[.='Click for JS Alert']"));
        clickJSAlert.click();

        //4. Click to OK button from the alert
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = Driver.getDriver().findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());

        String expected="You successfully clicked an alert";
        String actual= resultText.getText();


    }
}
