package automation.keywordframe;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordEngine {

WebDriver driver;

public void performAction(String keyword,String locator,String value){

switch(keyword.toLowerCase()){

case "openbrowser":

driver = new ChromeDriver();
break;

case "navigate":
driver.get(value);
break;

case "enteremail":
driver.findElement(By.xpath(locator.split(":")[1])).sendKeys(value);
break;

case "click":
driver.findElement(By.id(locator.split(":")[1])).click();
break;

case "closebrowser":
driver.quit();
break;

}

}

}