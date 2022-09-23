package projectscrpit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org_salesandinventory_genericutility.Webdriverutility;

public class TestngpracticeTest
{
	@Test
	public void scrpittest()
	{
	String Db=System.getProperty("Dbr");
	String Du=System.getProperty("Dur");
	WebDriver driver = new Webdriverutility().openbrowsewithappliation(Db, 10, Du);
	
	}
	

}
