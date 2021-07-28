package FileDWNLDandUPLD;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadInSelenium_UsingRobotClass {

	@Test
	public void TestFU() throws InterruptedException, AWTException {
		System.setProperty("Webdriver.chrome.driver", "C:\\vykuntam\\chromedriverfolder\\92\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://resume.naukri.com/cv-submission");
		  Thread.sleep(5000);
		  //open upload window
		     driver.findElement(By.xpath("//span[@Class='browse_but red_btnBig']")).click();

		     //put path to your image in a clipboard
		    // StringSelection ss = new StringSelection("C:\\Users\\vinay\\Documents\\Doc1.txt");
		   //  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		     
		     StringSelection stringSelection = new StringSelection("C:\\Users\\vinay\\Documents\\file.txt");
		        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		        clipboard.setContents(stringSelection, null);


		        
		        //imitate mouse events like ENTER, CTRL+C, CTRL+V
		     Robot robot = new Robot();
		     robot.delay(250);
		     
		     //robot.keyRelease(KeyEvent.VK_ENTER);
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.delay(90);
		     
		     robot.keyRelease(KeyEvent.VK_ENTER);
System.out.println("file uploaded");
		  
		  driver.quit();
	}
	
}
