package web3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLinksusing {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");

        driver.findElement(By.linkText("Form Authentication")).click();

        driver.navigate().back();

        driver.findElement(By.partialLinkText("Form")).click();
    }
}
