package Pretesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class PreConditions extends Cookie {

    @BeforeTest
    public void Auth(){
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();

        webDriver.navigate().to(properties.getProperty("url"));

        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        CookieChecker();
        Login();
    }

    public void Login(){

        webDriver.findElement(By.xpath(properties.getProperty("loginBtn"))).click();

        webDriver.findElement(By.xpath(properties.getProperty("username"))).sendKeys(properties.getProperty("nickname"));;

        webDriver.findElement(By.xpath(properties.getProperty("password"))).sendKeys(properties.getProperty("pass"));;

        webDriver.findElement(By.xpath(properties.getProperty("login"))).click();
    }
}
