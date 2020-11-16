package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class Calculator {
    @Test
    public void calculator() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        WebElement numara1 = driver.findElementById("com.android.calculator2:id/digit_1");
        WebElement numara5 = driver.findElementById("com.android.calculator2:id/digit_5");
        WebElement numara9 = driver.findElementByXPath("//*[@text='9']");
        WebElement arti =driver.findElementByAccessibilityId("plus");
        WebElement numara7 = driver.findElementByXPath("//*[@text='7']");
        WebElement numara8 = driver.findElementById("com.android.calculator2:id/digit_8");
        WebElement esittir = driver.findElementByAccessibilityId("equals");
        WebElement sonuc = driver.findElementById("com.android.calculator2:id/result");
        numara1.click();
        numara5.click();
        numara9.click();
        arti.click();
        numara7.click();
        numara8.click();
        esittir.click();
        Thread.sleep(3000);
        Assert.assertEquals("237",sonuc.getText());
        System.out.println(sonuc.getText());

    }
}


