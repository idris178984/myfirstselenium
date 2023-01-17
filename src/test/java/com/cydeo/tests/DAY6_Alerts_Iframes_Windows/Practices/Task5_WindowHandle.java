package com.cydeo.tests.DAY6_Alerts_Iframes_Windows.Practices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task5_WindowHandle {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void Window_Handle(){

        //current window
        String currentHandle= driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        // 4. Assert: Title is “Windows”
        String expectedWindowTitle="Windows";
        String actualWindowTitle= driver.getTitle();
        Assert.assertEquals(actualWindowTitle,expectedWindowTitle);
        //5. Click to: “Click Here” link
        WebElement clickHere= driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();

       // 6. Switch to new Window.
        Set<String>allWindowHandles=driver.getWindowHandles();


        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());

        }

        // 7. Assert: Title is “New Window”
        String expectedTitle="New Window";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        // Back to currentWindow
      //  driver.switchTo().window(currentHandle);
    }


}
