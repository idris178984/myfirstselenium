package com.cydeo.tests.DAY11_Driver_Close_Actions_JSPractices.Practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropPractice {


  @Test
    public void Drag_DropTest(){

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
      Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
      WebElement acceptCookies=Driver.getDriver().findElement(By.xpath("//*[.='Accept Cookies']"));
    acceptCookies.click();

    // 2. Drag and drop the small circle to bigger circle.
    WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
    WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));


    Actions actions=new Actions(Driver.getDriver());
    actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();
        //3. Assert:
        //-Text in big circle changed to: “You did great!”
    String actual=bigCircle.getText();
    String expeceted="You did great!";
    Assert.assertEquals(actual,expeceted);
  }
}
