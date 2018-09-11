package maven.SriNK;







import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;



public class log4jExptestNG {

@Test
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

