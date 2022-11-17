package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBPage {
	private WebDriver driver;

	
	@FindBy(css="section[data-testid=\"Details\"]>div[data-testid=\"title-details-section\"]>ul>li:nth-of-type(1)>div>ul>li>a")
	WebElement releaseDate;
	
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[2]/div/ul/li/a")
	WebElement country;
	
	public IMDBPage(WebDriver driver) {
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
