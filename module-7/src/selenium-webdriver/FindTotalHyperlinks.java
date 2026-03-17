package web3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalHyperlinks {

	public static void main(String[] args) {

		// Launch Browser
		WebDriver driver = new ChromeDriver();

		// Open Website
		driver.get("https://qavbox.github.io/demo/webtable/");

		driver.manage().window().maximize();

		// Find all hyperlinks using tag name 'a'
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Print total hyperlinks
		System.out.println("Total Hyperlinks on the Page: " + links.size());

		// Print all hyperlink text
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}

		// Close browser
		driver.quit();
	}
}

