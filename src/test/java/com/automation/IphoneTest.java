package com.automation;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IphoneTest {
    public static final String USERNAME = "ismailozkan1";
    public static final String AUTOMATE_KEY = "mCViujwDRKzsat5NiLoh";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    @Test
    public void iphone11Pro() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 11 Pro");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "13");
        caps.setCapability("build", "iPhone 11 ");
        caps.setCapability("name", "ismailozkan1's second Test");
        caps.setCapability("app", "bs://6fde15d5e82f15bef374626325df5d0de5fb87ca");

        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL(URL),caps);





    }
}
/*
curl -u "ismailozkan1:mCViujwDRKzsat5NiLoh" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\admin\IdeaProjects\AppiumAutomation\BStackSampleApp.ipa"

 */