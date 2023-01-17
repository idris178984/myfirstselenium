package com.cydeo.tests.DAY2Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {
    public static void main(String[] args) {

        //TC #4: Library verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

       // 3. Enter username: “incorrect@email.com”
        WebElement userName= driver.findElement(By.className("form-control"));
        userName.sendKeys("incorrect@email.com");

       // 4. Enter password: “incorrect password”
        WebElement password= driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        //5. Click to Sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password” displayed



    }
}
