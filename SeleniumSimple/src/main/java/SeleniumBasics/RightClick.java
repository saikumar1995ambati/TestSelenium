package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		 
		WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightClickButton).build().perform();

	}

}
