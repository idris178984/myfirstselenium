package com.cydeo.tests.DAY10_Upload_Actions_Jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeT3_Actions_Hover {


    @Test
    public void hovering_test(){
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement firstImage=Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg']) [1]"));
        WebElement secondImage=Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg']) [2]"));
        WebElement thirdImage=Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg']) [3]"));

        WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions=new Actions(Driver.getDriver());

        //2. Hover over to first image
        actions.moveToElement(firstImage).perform();

        //3. Assert:
        //System.out.println("firstImage.isDisplayed() = " + firstImage.isDisplayed());
        //a. “name: user1” is displayed
        //b. “view profile” is displayed
        Assert.assertTrue(user1.isDisplayed());

        //4. Hover over to second image
        actions.moveToElement(secondImage).perform();
        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

        //b. “view profile” is displayed
        //6. Hover over to third image
        actions.moveToElement(thirdImage).perform();
        Assert.assertTrue(user3.isDisplayed());
        //7. Confirm:
        //a. “name: user3” is displayed
        // b. “view profile” is displayed
    }
}
