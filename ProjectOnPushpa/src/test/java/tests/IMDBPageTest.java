package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.IMDBPage;
import pages.WikiPage;

public class IMDBPageTest extends BaseClass {

	private WebDriver driver=null;
	private IMDBPage objIMDBPage;
	public IMDBPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	void initWikiPage()
	{
		driver=initWebdriver();
		driver.get(prop.getProperty("urlIMDB"));
		objIMDBPage=new IMDBPage(driver);
	}

	@Test
	void testTheReleaseDate()
	{
		System.out.println("hi this is test");
		String displayedReleaseDate=objIMDBPage.getRealeaseDate();
		System.out.println(displayedReleaseDate);
		
		String displayedCountry=objIMDBPage.getCountry();
		System.out.println(displayedCountry);
	}
	
	@AfterMethod
	public void tearDownWikiPage()
	{
		//driver.quit();
	}
	
}
