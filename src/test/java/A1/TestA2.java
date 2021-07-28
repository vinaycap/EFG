package A1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestA2 {
	
	@Test
	public void Second() {
		System.setProperty("Webdriver.chrome.driver", "C:\\vykuntam\\chromedriverfolder\\92\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseURL = "https://www.guru99.com/select-option-dropdown-selenium-webdriver.html";
	   
		driver.get(baseURL);

		driver.close();
	}
}
