package com.automation;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IphoneTest {
    public static final String USERNAME = "ismailozkan1";
    public static final String AUTOMATE_KEY = "mCViujwDRKzsat5NiLoh";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    @Test
    public void iphone11Pro(){
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 11 Pro");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "13");
        caps.setCapability("build", "iPhone 11 ");
        caps.setCapability("name", "ismailozkan1's First Test");
        caps.setCapability("app", "bs://a2f1c80f55e8b78bd076be4fba9df80da7438464");





    }
}
