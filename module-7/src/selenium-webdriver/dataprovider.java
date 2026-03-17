package web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

    WebDriver driver;

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);

        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();

        Thread.sleep(3000);

        driver.quit();
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        Object[][] data = new Object[2][2];

        data[0][0] = "user1@gmail.com";
        data[0][1] = "12345";

        data[1][0] = "user2@gmail.com";
        data[1][1] = "54321";

        return data;
    }
}

