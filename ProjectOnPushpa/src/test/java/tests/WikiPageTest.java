package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.WikiPage;

public class WikiPageTest extends BaseClass {

	private WebDriver driver=null;
	private WikiPage objWikiPage;
	public WikiPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	void initWikiPage()
	{
		driver=initWebdriver();
		driver.get(prop.getProperty("urlWiki"));
		objWikiPage=new WikiPage(driver);
	}

	@Test
	void testTheReleaseDate()
	{
		System.out.println("hi this is test");
		String displayedReleaseDate=objWikiPage.getRealeaseDate();
		System.out.println(displayedReleaseDate);
		
		String displayedCountry=objWikiPage.getCountry();
		System.out.println(displayedCountry);
	}
	
	@AfterMethod
	public void tearDownWikiPage()
	{
		//driver.quit();
	}
	
}
