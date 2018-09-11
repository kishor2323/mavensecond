package kishorProperties;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {


		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://files.fm/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("uploadifive-file_upload")).click();
			
			Runtime.getRuntime().exec("C:\\Users\\system8\\Desktop\\kishorAutoIt.exe C:\\Users\\system8\\Desktop\\AutoIt.au3");
			
			Thread.sleep(3000);
			
			driver.close();

	}

}
