package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.net.MalformedURLException;

public class FirstAppiumTest {

    @Test
    public void Test1() throws MalformedURLException, InterruptedException {

    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    desiredCapabilities.setCapability("platformName","Android");//device baglanma
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\admin\\IdeaProjects\\AppiumAutomation\\etsy.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);             //remote driver kullaniriz,uzaktan bir sunucuya baglanir.

        WebElement getStarted = driver.findElementById("com.etsy.android:id/btn_link");
        getStarted.click();

    }}
