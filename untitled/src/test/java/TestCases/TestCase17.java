package TestCases;

import Pretesting.PreConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase17 extends PreConditions {

    @Test
    public void PostVisible() {
            webDriver.findElement(By.xpath(properties.getProperty("postBtn"))).click();

            WebElement newWorkBtn = webDriver.findElement(By.xpath(properties.getProperty("newWorkBtn")));
            Assert.assertTrue(newWorkBtn.isDisplayed());

            WebElement importWorkBtn = webDriver.findElement(By.xpath(properties.getProperty("importWorkBtn")));
            Assert.assertTrue(importWorkBtn.isDisplayed());
    }
}