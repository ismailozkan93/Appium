package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RealMobileTest {
    @Test
    public void samsung7() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","9");
        desiredCapabilities.setCapability("deviceName","SM-J702F/DS");
        desiredCapabilities.setCapability("udid","5200b066f475745d");
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        WebElement digit1 = driver.findElement(By.xpath("//*[@index='12']"));
        WebElement digit2 = driver.findElement(By.xpath("//*[@index='13']"));
        WebElement digit3 = driver.findElement(By.xpath("//*[@index='14']"));
        WebElement digit8 = driver.findElement(By.xpath("//*[@index='5']"));
        WebElement digit9 = driver.findElement(By.xpath("//*[@index='6']"));


        WebElement multiple = driver.findElement(By.xpath("//*[@index='7']"));
        WebElement equals = driver.findElement(By.xpath("//*[@index='19']"));
        WebElement result = driver.findElement(By.xpath("//*[@index='0']"));

        digit1.click();
        digit2.click();
        digit3.click();
        multiple.click();

        digit8.click();
        digit9.click();

        equals.click();
        Thread.sleep(3000);

        System.out.println(result.getText());
    }
    }

