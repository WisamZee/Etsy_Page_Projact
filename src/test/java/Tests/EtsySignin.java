package Tests;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import DataSource.EtsyHomepage;
import DataSource.signInPage;
import Utils.Driver;
import Utils.TestDataReader;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsySignin {
	public static void main(String[] args) {
		EtsyInvvalidSignin();
	}
	public static void EtsyInvvalidSignin() {
				
			//1. Go to etsy.com
			Driver.getDriver().get(TestDataReader.getProperty("EtsyURL"));
			Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
	
			EtsyHomepage etsyhomepage = new EtsyHomepage();
			signInPage signinpage = new signInPage();
			
			etsyhomepage.hp_signin_button.click();
			wait.until(ExpectedConditions.visibilityOf(signinpage.signin_page_signin_text));
			signinpage.signin_page_email.sendKeys("automation");
			signinpage.signin_page_password.sendKeys("automation");
			signinpage.signin_page_signIn_button.click();
		}
	}

