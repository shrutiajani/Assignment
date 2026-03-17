package web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScriptforDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");

        driver.manage().window().maximize();

        // Skills dropdown select
        WebElement skills = driver.findElement(By.id("Skills"));

        Select s = new Select(skills);

        // Select by Visible Text
        s.selectByVisibleText("Java");

        Thread.sleep(2000);

        // Select by Index
        s.selectByIndex(5);

        Thread.sleep(2000);

        // Select by Value
        s.selectByValue("Analytics");

    }
}

