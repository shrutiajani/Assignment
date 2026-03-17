package web3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleItemsDropdownn {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        WebElement dropdown = driver.findElement(By.id("selectProductSort"));
        Select select = new Select(dropdown);

        select.selectByIndex(1);
        select.selectByVisibleText("Price: Lowest first");
    }
}
