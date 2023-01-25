package com.cydeo.tests.DAY11_Driver_Close_Actions_JSPractices.Practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice4_5 {

    //TC #4: Scroll practice
    //1- Open a chrome browser
    @Test
    public void Task4_5Test() {
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        Actions actions=new Actions(Driver.getDriver());

        WebElement Cydeo=Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(Cydeo).perform();
        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        // 2- Scroll back up to “Home” link using PageUP button
        WebElement Home=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        actions.moveToElement(Home).perform();


    }

}
