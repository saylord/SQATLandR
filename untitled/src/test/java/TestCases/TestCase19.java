package TestCases;

import Pretesting.PreConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase19 extends PreConditions {

    @Test
    public void PostIncorrectDate(){

        webDriver.findElement(By.xpath(properties.getProperty("postBtn"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("newWorkBtn"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("publishPost"))).click();

        WebElement errorMessage = webDriver.findElement(By.xpath(properties.getProperty("errorMessage")));
        Assert.assertTrue(errorMessage.isDisplayed());

    }

}