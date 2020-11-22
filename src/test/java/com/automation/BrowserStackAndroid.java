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

public class BrowserStackAndroid {

         String USERNAME = "ismailozkan1";
         String AUTOMATE_KEY = "UvDC7kXzSHn16FiSA6u8";
         String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

        @Test
    public void galaxyS10e() throws MalformedURLException, InterruptedException {

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("browserName", "android");
            caps.setCapability("device", "Samsung Galaxy S10e");
            caps.setCapability("realMobile", "true");
            caps.setCapability("os_version", "9.0");
            caps.setCapability("name", "Galaxys10e First Test");
            caps.setCapability("app", "bs://e74b65958287888255d92859bb5f9fc00d7a2008");

            AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL(URL),caps);


            WebElement preference = driver.findElementByAccessibilityId("Preference");
            preference.click();
            Thread.sleep(2000);

            WebElement preferenceDependencies = driver.findElementByAccessibilityId("3. Preference dependencies");
            preferenceDependencies.click();

            WebElement checkBox = driver.findElementById("android:id/checkbox");
            checkBox.click();
            Thread.sleep(2000);

            WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
            wifiSetting.click();
            WebElement inputBox = driver.findElementById("android:id/edit");
            inputBox.sendKeys("appiumTest");
            WebElement okButton = driver.findElementById("android:id/button1");
            Assert.assertEquals("appiumTest",inputBox.getText());
            okButton.click();
            Thread.sleep(3000);



        }

//"bs://e74b65958287888255d92859bb5f9fc00d7a2008"}
//curl -u "ahmetyildiz1:UvDC7kXzSHn16FiSA6u8" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\\Users\\admin\\IdeaProjects\\AppiumAutomation\\apidemos.apk"



}
