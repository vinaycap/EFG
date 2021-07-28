package FileDWNLDandUPLD;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownLoad {

	@Test
	public void TestFD() throws InterruptedException {
		HashMap<String, Object> hmap= new HashMap<String,Object>();
		hmap.put("profile.default_content_settings.popups", 0);
		hmap.put("download.default_directory", System.getProperty("user.dir"));
		hmap.put("plugins.always_open_pdf_externally", true);
		hmap.put("download.prompt_for_download", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", hmap);
		System.setProperty("Webdriver.chrome.driver", "C:\\vykuntam\\chromedriverfolder\\92\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		  Thread.sleep(5000);
		  //open upload window
		     driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

		    driver.navigate().to("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		    driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		    
		
		
	}
	
	
}
