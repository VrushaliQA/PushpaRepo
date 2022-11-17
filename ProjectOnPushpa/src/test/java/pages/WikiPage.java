package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {
	private WebDriver driver;

	
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")
	WebElement releaseDate;
	
	@FindBy(css="table[class=\"infobox vevent\"]>tbody>tr:nth-of-type(14)>td")
	WebElement country;
	
	public WikiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String getRealeaseDate()
	{
		return releaseDate.getText();
	}

	public String getCountry()
	{
		return country.getText();
	}
}
