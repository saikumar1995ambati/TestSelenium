package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniums {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launching the browser
		//System.out.println(driver.getTitle());
		driver.navigate().to("https://www.freecrm.com/index.html");  
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saikumar.ambati@gmail.com");
		
	}

}
