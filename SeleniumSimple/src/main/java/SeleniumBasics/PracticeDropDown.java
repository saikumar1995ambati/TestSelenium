package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/contact-sales/");

		WebElement NoofEmp = driver.findElement(By.name("NoOfEmployees"));
		Select numemp = new Select(NoofEmp);

		List<WebElement> alloptions = numemp.getOptions();
		

		for (WebElement options : alloptions) {
			
			//System.out.println(options.getText());
			if(options.getText().equals(("21 - 25"))) {
				options.click();
				break;
				
			}
		}

	}

}
