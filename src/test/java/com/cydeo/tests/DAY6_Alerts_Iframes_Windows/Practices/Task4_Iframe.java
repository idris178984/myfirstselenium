package com.cydeo.tests.DAY6_Alerts_Iframes_Windows.Practices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_Iframe {

    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void Iframe(){
       // Assert: “Your content goes here.” Text is displayed.
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

       // 5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

        driver.switchTo().parentFrame();
        WebElement headerText= driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));

        Assert.assertTrue(headerText.isDisplayed());
    }

}
