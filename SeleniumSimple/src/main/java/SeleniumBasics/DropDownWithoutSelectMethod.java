package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("[//button[contains(@class,'multiselect']")).click();
		
		List<WebElement>list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')//li//a//label"));
		
		System.out.println(list.size());
		
		/*
		 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i).getText());
		 * if(list.get(i).getText().contains("Angular")) { list.get(i).click(); break;
		 * 
		 * } }
		 */
		

	}

}
