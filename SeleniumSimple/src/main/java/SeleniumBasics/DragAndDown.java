package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
	}

}
