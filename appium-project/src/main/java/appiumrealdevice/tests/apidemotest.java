package appiumrealdevice.tests;

import appiumrealdevice.base.BaseTest;
import appiumrealdevice.pages.ApiDemosPage;

public class apidemotest extends BaseTest {

    public static void main(String[] args) throws Exception {

        setUp();

        ApiDemosPage page = new ApiDemosPage(driver);
        page.clickViews();

        System.out.println("API Demo App Launched Successfully");

        tearDown();
    }
}