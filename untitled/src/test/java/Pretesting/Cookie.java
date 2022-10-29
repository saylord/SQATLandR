package Pretesting;

import Utils.WebDriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cookie extends WebDriverSettings {
    public void CookieChecker(){
        WebElement newWorkBtn = webDriver.findElement(By.xpath(properties.getProperty("agreeCookie")));
        if(newWorkBtn.isDisplayed()) {
            webDriver.findElement(By.xpath(properties.getProperty("agreeCookie"))).click();
            webDriver.findElement(By.xpath(properties.getProperty("acceptCookie"))).click();
        }
    }
}
