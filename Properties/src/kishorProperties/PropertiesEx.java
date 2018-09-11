package kishorProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesEx {

	public static void main(String[] args) throws IOException, InterruptedException {

		File file=new File("./src/kishor.properties");
		
		FileInputStream fis=new FileInputStream(file);
		
		Properties p=new Properties();
		
		p.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String s=p.getProperty("URL");
		
		System.out.println("My URL Is " + s);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(s);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		String user=p.getProperty("UserName");
				
		driver.findElement(By.name("userName")).sendKeys(user);
		
		Thread.sleep(4000);
		
		String pass=p.getProperty("PassWord");
		
		driver.findElement(By.name("password")).sendKeys(pass,Keys.TAB,Keys.ENTER);
		
		driver.close();

	}

}
