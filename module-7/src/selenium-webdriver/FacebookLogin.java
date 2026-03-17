package web3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {

    @DataProvider(name="loginData")

    public Object[][] data(){

        return new Object[][]{
            {"user1@gmail.com","12345"},
            {"user2@gmail.com","54321"}
        };
    }

    @Test(dataProvider="loginData")

    public void loginTest(String username,String password) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);

        Thread.sleep(3000);

        driver.findElement(By.name("login")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}

