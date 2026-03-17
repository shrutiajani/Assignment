package web3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        driver.switchTo().alert().accept();
    }
}


