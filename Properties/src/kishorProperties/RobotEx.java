package kishorProperties;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotEx {

	public static void main(String[] args) throws InterruptedException, AWTException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://files.fm/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("uploadifive-file_upload")).click();
		
		//copy file 
		
		File file=new File("C:\\Users\\system8\\Desktop\\New Microsoft Office Word Document.docx");
		
		System.out.println("My Path is : "+file.getAbsolutePath());
		
		StringSelection ss=new StringSelection(file.getAbsolutePath());
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Paste the file
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
