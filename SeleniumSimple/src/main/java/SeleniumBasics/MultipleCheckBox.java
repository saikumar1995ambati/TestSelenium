package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cssscript.com/demo/multiselect-dropdown-list-checkboxes-multiselect-js/");
		
		driver.findElement(By.className("multiselect-input")).click();
		//List<WebElement>list = driver.findElement(By.xpath(""))
		
	}

}
