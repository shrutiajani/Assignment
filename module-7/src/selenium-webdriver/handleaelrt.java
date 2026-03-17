package web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleaelrt {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Open Website
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		// ===== 1. Simple Alert =====
		driver.findElement(By.xpath("//button[contains(text(),'click the button')]")).click();
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		// ===== 2. Alert with OK & Cancel =====
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		// ===== 3. 
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		driver.switchTo().alert().sendKeys("Testing Alert");
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		// Close Browser
		driver.quit();
	}
}

