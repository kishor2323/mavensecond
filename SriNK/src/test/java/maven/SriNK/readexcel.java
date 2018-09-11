package maven.SriNK;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


public class readexcel extends log4jExptestNG {
	WebDriver d;
  @Test
 public void Links() {
	  
	  List<WebElement> lks = d.findElements(By.tagName("a"));
	  System.out.println("Total no. of links are  ="+lks.size());
	  for(int i=0;i<lks.size();i++)
	  {
		  String Details=lks.get(i).getText();
		  System.out.println(+i+"="+Details);
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   d = new ChromeDriver();
	  d.get("http://newtours.demoaut.com");
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	  d.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	  
  }
  @AfterMethod
  public void close() throws InterruptedException
  { Thread.sleep(3000);
	  d.quit();
  }
 @AfterClass
  public void logs()
  {
  		Logger log=LogManager.getLogger(log4jExptestNG.class);
  		log.info("-----------------New Testcvase----------------------");
  		log.trace("It is trace message");
  		log.debug("Application is opened");
  		log.info("Page is opened");
  		log.warn("It is warning message");
  		log.error("It is error message");
  		log.fatal("Fatal Message");
  		


  	}
  
}
