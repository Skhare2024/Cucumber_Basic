package stepDefinition;


import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep extends TestBase{
	
	WebDriver driver=TestBase.getDriver();
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
	@Given("navigate to google.com")
	public void navigate_to_google_com() {
		
		driver.get("https://www.google.com/");
		System.out.println("Search given");
	}
	
	@When("enter the value for search and click search")
	public void enter_the_value_for_search_and_click_search() {
	   
		WebElement textbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		WebElement searchbtn =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		
		textbox.sendKeys("Selenium 4.16");
		searchbtn.click();
		System.out.println("Search when");
	
	}
	@Then("search should be successful")
	public void search_should_be_successful() {
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='result-stats']")));
		WebElement result=driver.findElement(By.xpath("//div[@id='result-stats']"));
		System.out.println("Search "+"then"+result.getText());
		assertTrue(result.getText().matches("About.*"));
	
	}
	
	@When("enter the {string} for search and click search")
	public void enter_the_for_search_and_click_search(String searchText) {
	    
		WebElement textbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		WebElement searchbtn =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		
		textbox.sendKeys(searchText);
		searchbtn.click();
		System.out.println("Search when");
		
	}

}
