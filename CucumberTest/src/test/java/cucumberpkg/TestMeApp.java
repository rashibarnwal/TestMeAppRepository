package cucumberpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeApp {
	WebDriver driver;

	@Given("The URL of the TestMeApp {string}")
	public void the_URL_of_the_TestMeApp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\NexGen Testing Stream\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
        
	}

	@When("User enters {word} as {word} username")
	public void user_enters_as_username(String username, String usertype) {
		driver.findElement(By.id("userName")).sendKeys(username);

	}
	@When("User enters {} as password")
	public void user_enters_password_as_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("Login")).click();;

	}

	@Then("User is in valid page")
	public void user_is_in_valid_page() {
		String user = driver.findElement(By.xpath("//i[@class='fa fa-lock']")).getText();
		System.out.println("User is in the valid page.");
		Assert.assertEquals("SignOut", user);

	}
}
