package appiumrealdevice.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ApiDemosPage {

    private AndroidDriver driver;

    public ApiDemosPage(AndroidDriver driver){
        this.driver = driver;
    }

    private By viewsOption = AppiumBy.accessibilityId("Views");

    public void clickViews(){

        driver.findElement(viewsOption).click();

    }
}