package DataSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class signInPage {
	public signInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (css = ".select-signin")
	public WebElement signin_page_signin_text;
	
	@FindBy (css = ".select-register")
	public WebElement signin_page_register_button;
	
	@FindBy (id = "join_neu_email_field")
	public WebElement signin_page_email;
	
	@FindBy (id = "join_neu_password_field")
	public WebElement signin_page_password;
	
	@FindBy (name = "persistent")
	public WebElement signin_page_stay_signedin_checkbox;
	
	@FindBy (linkText = "Forgot your password?")
	public WebElement signin_page_forgotPassword_link;
	
	@FindBy (name = "submit_attempt")
	public WebElement signin_page_signIn_button;
	
	
	// register window elements 
	
	@FindBy (id = "join-neu-overlay-title")
	public WebElement register_window_createAccount_text;
	
	@FindBy (id = "join_neu_email_field")
	public WebElement register_window_email_box;
	
	@FindBy (id = "join_neu_first_name_field")
	public WebElement register_window_firstname_box;
	
	@FindBy (id = "join_neu_password_field")
	public WebElement register_window_password_box;
	
	@FindBy (name = "submit_attempt")
	public WebElement register_window_register_btn;



}


