package com.automation;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {

    @Test
    public void Chrome() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("browserName","chrome");

        Thread.sleep(3000);

        WebDriverManager.chromedriver().version("2.23").setup();
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,
                WebDriverManager.chromedriver().getBinaryPath());

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);


        Thread.sleep(3000);

        //driver.get("http://zero.webappsecurity.com/login.html");
        /*driver.get("http://zero.webappsecurity.com/login.html");
        WebElement user = driver.findElement(By.id("user_login"));
        WebElement password= driver.findElement(By.id("user_password"));
        WebElement submitbutton= driver.findElement(By.name("submit"));

        user.sendKeys("username");
        password.sendKeys("password");
        submitbutton.click();

         */

        driver.get("http://amazon.com");
        WebElement search = driver.findElementByXPath("//input[@name='k']");
        search.sendKeys("iphone"+ Keys.ENTER);

    }
}
