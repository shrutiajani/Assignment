package appiumrealdevice.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class BaseTest {

    protected static AndroidDriver driver;

    public static void setUp() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","Android Device");
        caps.setCapability("udid","10BDAS2IL1000Q3");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","io.appium.android.apis");
        caps.setCapability("appActivity","io.appium.android.apis.ApiDemos");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(url,caps);
    }

    public static void tearDown(){

        if(driver!=null){
            driver.quit();
        }

    }
}