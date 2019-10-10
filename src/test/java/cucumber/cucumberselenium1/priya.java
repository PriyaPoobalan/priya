package cucumber.cucumberselenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class priya {
	WebDriver driver;
	@Given("^User not logged in$")
	public void user_not_logged_in() throws Throwable{
	    // Write coddriver = Utilityclass.openBrowser("Chrome");
		driver = Utilityclass.openBrowser("Chrome");
		driver.get("http://newtours.demoaut.com/");
	}

	@When("user performs login")
	public void user_performs_login_using_username_and_password() throws Throwable {
		Page page= new Page(driver);
		page.do_login("tutorial", "tutorial");
	}

	@Then("^Logged in successfully$")
	public void logged_in_successfully() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}

}
