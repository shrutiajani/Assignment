package web3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLogin {

    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://accounts.google.com");
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {

        System.out.println("Gmail Login Test Executed");
    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();
    }
}
