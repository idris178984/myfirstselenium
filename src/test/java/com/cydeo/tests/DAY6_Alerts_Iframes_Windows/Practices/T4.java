package com.cydeo.tests.DAY6_Alerts_Iframes_Windows.Practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4 {

    @Test
    public void T4_Test(){

        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        //3. Go to: https://practice.cydeo.com/iframe
        Driver.getDriver().get("https://practice.cydeo.com/iframe");

        //4. Assert: “Your content goes here.” Text is displayed.
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("mce_0_ifr")));

        //Locate the p tag
        WebElement yourContentGoesHereText = Driver.getDriver().findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        Driver.getDriver().switchTo().parentFrame();

        WebElement headerText = Driver.getDriver().findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());


        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    }
}
