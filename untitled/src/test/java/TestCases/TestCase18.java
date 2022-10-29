package TestCases;

import Pretesting.PreConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase18 extends PreConditions {


    @Test
    public void PublishCorrectWork(){

        webDriver.findElement(By.xpath(properties.getProperty("postBtn"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("newWorkBtn"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("rating"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("ratingType"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("archiveWarnings"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("fandom"))).sendKeys(properties.getProperty("fandomName"), Keys.ENTER);;

        webDriver.findElement(By.xpath(properties.getProperty("workTitle"))).sendKeys(properties.getProperty("title"));;

        webDriver.findElement(By.xpath(properties.getProperty("languages"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("language"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("workText"))).sendKeys(properties.getProperty("text"));;

        webDriver.findElement(By.xpath(properties.getProperty("publishPost"))).click();

        WebElement successMessage = webDriver.findElement(By.xpath(properties.getProperty("successMessage")));
        Assert.assertTrue(successMessage.isDisplayed());

    }

}