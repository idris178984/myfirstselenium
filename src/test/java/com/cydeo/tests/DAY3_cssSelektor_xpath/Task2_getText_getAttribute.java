package com.cydeo.tests.DAY3_cssSelektor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_getText_getAttribute {
    public static void main(String[] args) {


        // TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        // 3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMe= driver.findElement(By.className("login-item-checkbox-label"));
        String expected="Remember me on this computer";
        String actual= rememberMe.getText();

        if(actual.equals(expected)){
            System.out.println("VERIFICATION PASSED");
        }else{
            System.out.println("VERIFICATION FAİLED");
        }

        // 4- Verify “forgot password” link text is as expected:
        // Expected: Forgot your password?
        WebElement forgotPassword= driver.findElement(By.className("login-link-forgot-pass"));

        String expected2="FORGOT YOUR PASSWORD?";
        String actual2= forgotPassword.getText();

        if(actual2.equals(expected2)){
            System.out.println("PASSWORD VERIFICATION PASSED");
        }else{
            System.out.println("actual2 = " + actual2);
            System.out.println("expected2 = " + expected2);
            System.out.println("PASSWORD VERIFICATION FAİLED");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPassword.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAILED!!!");
        }


    }
}
