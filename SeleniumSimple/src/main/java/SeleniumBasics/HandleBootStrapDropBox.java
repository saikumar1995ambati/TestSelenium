package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBootStrapDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.id("dropdownMenuButton")).click();
		List<WebElement>list = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')] and [@aria-labelledby='dropdownMenuButton']//a"));
		
	   System.out.println(list.size());
		
		//button[@class="btn btn-link bd-search-docs-toggle d-md-none p-0 ml-3"]
	}

}
