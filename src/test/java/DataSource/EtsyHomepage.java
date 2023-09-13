package DataSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class EtsyHomepage {
	public EtsyHomepage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (css = ".select-signin")
	public WebElement hp_signin_button;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_jewelry_accessory;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_clothing_shoes;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_home_living;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_wedding_party;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_toys_entertainment;
	
	@FindBy (linkText = "Jewelry & Accessories")
	public WebElement hp_art_collectables;
}