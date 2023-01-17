package com.cydeo.tests.DAY6_Alerts_Iframes_Windows.Practices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task1_Alert {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void AlertMethod(){

       // 3. Click to “Click for JS Alert” button
        WebElement AlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        AlertButton.click();
        //4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();

       // 5. Verify “You successfully clicked an alert” text is displayed.
        WebElement successfullyAlert= driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));

        Assert.assertTrue(successfullyAlert.isDisplayed(), "successfullyAlert is not displayed");

        String expectedText = "You successfully clicked an alert";
        String actualText = successfullyAlert.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");

    }

    @Test
    public void AlertMethod2(){
       // 3. Click to “Click for JS Confirm” button
        WebElement confirmButton= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmButton.click();
       // 4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement clikedOk= driver.findElement(By.xpath("//p[.='You clicked: Ok']"));
        Assert.assertTrue(clikedOk.isDisplayed());

        String expected="You clicked: Ok";
        String actual=clikedOk.getText();
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void AlertMethod3(){

      //  3. Click to “Click for JS Prompt” button
        WebElement jsPrompt= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPrompt.click();
      //  4. Send “hello” text to alert
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");

       // 5. Click to OK button from the alert
        alert.accept();
       // 6. Verify “You entered: hello” text is displayed.
        WebElement Hello= driver.findElement(By.xpath("//p[.='You entered: hello']"));
        Assert.assertTrue(Hello.isDisplayed());

        String expected="You entered: hello";
        String actual= Hello.getText();
        Assert.assertEquals(actual,expected);
    }
}
