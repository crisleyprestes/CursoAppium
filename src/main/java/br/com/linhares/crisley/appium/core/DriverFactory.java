package br.com.linhares.crisley.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory{

    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver(){
        if(driver == null){
            createTestObjectDriver();
        }
        return driver;
    }

    private static void createDriver(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "main" +
                File.separator + "resources" +
                File.separator + "CTAppium_2_0.apk");
        // desiredCapabilities.setCapability("appWaitPackage", "com.google.android.permissioncontroller");
        // desiredCapabilities.setCapability("appWaitActivity", "com.android.packageinstaller.permission.ui.ReviewPermissionsActivity");

        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
                    desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private static void createTestObjectDriver(){
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        // caps.setCapability("appium:platformVersion", "11");
        // caps.setCapability("appium:deviceName", "Samsung.*Galaxy.*");
        // caps.setCapability("appium:orientation", "portrait");
        caps.setCapability("appium:app", "storage:filename=CTAppium_2_0.apk");
        caps.setCapability("automationName", "UiAutomator2");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("username", "oauth-prestes40-5f4f0");
        sauceOptions.setCapability("accessKey", "12eff6f9-d01e-429c-bb06-1ef17559a4cb");
        caps.setCapability("sauce:options", sauceOptions);

        try {
            URL url = new URL("https://oauth-prestes40-5f4f0:" +
                    "12eff6f9-d01e-429c-bb06-1ef17559a4cb@ondemand.us-west-1.saucelabs.com:443/wd/hub");
            driver = new AndroidDriver(url, caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
