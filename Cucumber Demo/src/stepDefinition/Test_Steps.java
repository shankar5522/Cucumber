package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public WebDriver driver = null;
	
	@Given("^navigating to the application$")
	public void navigating_to_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("My Given");
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Priya\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");*/
	}

	@When("^seach for the keyword$")
	public void seach_for_the_keyword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("My When");
		//driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@Then("^verify the result$")
	public void verify_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("My Then");
	    
	}
	
	@Given("^navigating to the URL$")
	public void navigating_to_the_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("URL");
	}

	@When("^Add two values$")
	public void add_two_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Addition of 2 values");
	}

	@Then("^verify the outcomes$")
	public void verify_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Output of this values");
	}

}
