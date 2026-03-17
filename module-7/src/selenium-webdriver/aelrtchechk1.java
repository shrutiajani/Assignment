package web3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class aelrtchechk1 {

    @Test
    public void loginTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");

        driver.findElement(By.name("login")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
