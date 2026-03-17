package web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup");

        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("User");
        driver.findElement(By.id("username")).sendKeys("testuser12345");
        driver.findElement(By.name("Passwd")).sendKeys("Test@12345");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Test@12345");

        driver.findElement(By.xpath("//span[text()='Next']")).click();
    }
}
		
	

	
