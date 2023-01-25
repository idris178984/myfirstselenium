package com.cydeo.tests.DAY11_Driver_Close_Actions_JSPractices.Practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task7_JSExecutorScrollPractice {

    @Test
    public void JSExecutor_7Test(){

        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link
        WebElement Cydeo=Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)",Cydeo);
        //4- Scroll up to “Home” link
        WebElement Home=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[1].scrollIntoView(true)",Cydeo,Home);
        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as arguments into executeScript() method
    }
}
