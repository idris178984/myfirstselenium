package com.cydeo.tests.DAY12_pom_design_expilicit_wait;

import com.cydeo.pages.example1;
import com.cydeo.pages.example7;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class exampleWaitPractice {

    @Test
    public void example7_test(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        example7 example7=new example7();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

        // 2. Wait until title is “Dynamic title”
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(example7.doneMessage.isDisplayed());
        //4. Assert: Image is displayed.
        Assert.assertTrue(example7.spongeBobImage.isDisplayed());
    }

    @Test
    public  void example1_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        example1 example1=new example1();
        example1.startButton.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(example1.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(example1.inputUsername.isDisplayed());

        //5. Enter username: tomsmith
        example1.inputUsername.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        example1.inputPassword.sendKeys("somethingwrong");

        //7. Click to Submit button
        example1.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(example1.errorMessage.isDisplayed());
    }

}
