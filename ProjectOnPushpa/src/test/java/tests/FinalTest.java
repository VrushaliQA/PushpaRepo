package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.IMDBPage;
import pages.WikiPage;

public class FinalTest extends BaseClass {

	private WebDriver driver=null;
	private IMDBPage objIMDBPage;
	private WikiPage objWikiPage;
	
	public FinalTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	void initWikiPage()
	{
		driver=initWebdriver();
		//driver.get(prop.getProperty("urlIMDB"));
		objIMDBPage=new IMDBPage(driver);
		objWikiPage=new WikiPage(driver);
	}

	@Test
	void testTheReleaseDate()
	{
		driver.get(prop.getProperty("urlIMDB"));
		String displayedReleaseDateIMDB=objIMDBPage.getRealeaseDate();
		//System.out.println(displayedReleaseDateIMDB);
		
		
		driver.navigate().to(prop.getProperty("urlWiki"));
		
		String displayedReleaseDateWiki=objWikiPage.getRealeaseDate();
		
		//System.out.println(displayedReleaseDateWiki);
		Assert.assertEquals(displayedReleaseDateIMDB, displayedReleaseDateWiki);
		
	}
	
	@Test
	void testCountry()
	{
		driver.get(prop.getProperty("urlIMDB"));
		
		
		String displayedCountryIMDB=objIMDBPage.getCountry();
		//System.out.println(displayedCountryIMDB);
		
		
		driver.navigate().to(prop.getProperty("urlWiki"));
		String displayedCountryWiki=objWikiPage.getCountry();
		//System.out.println(displayedCountryWiki);
		Assert.assertEquals(displayedCountryIMDB, displayedCountryWiki);
	}
	
	@AfterMethod
	public void tearDownWikiPage()
	{
		driver.quit();
	}
	
}
