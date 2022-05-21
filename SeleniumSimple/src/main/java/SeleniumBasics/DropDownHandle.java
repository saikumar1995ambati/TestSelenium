package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ambat\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		Select drpCountry = new Select(drpCountryEle);
		List<WebElement>alloptions = drpCountry.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}

	}

}
