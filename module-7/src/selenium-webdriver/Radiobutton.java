package web3;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        for (WebElement radio : radioButtons) {
            radio.click();
            Thread.sleep(2000);
        }

        driver.quit();
    }
}

