package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.test.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeelingLuckyStep extends TestBase{	
	
	WebDriver driver=TestBase.getDriver();
	
	@When("enter the value for search and click I m Feeling Lucky")
	public void enter_the_value_for_search_and_click_i_m_feeling_lucky() {
		System.out.println("lucky when");
		
		WebElement textbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		WebElement feelingLuckybtn =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
		
		textbox.sendKeys("Selenium 4.0");
		feelingLuckybtn.click();
		
	}
	// comment for git2
	@When("enter the {string} for search and click I m Feeling Lucky")
	public void enter_the_for_search_and_click_i_m_feeling_lucky(String searchText) {
		System.out.println("lucky when");
		
		WebElement textbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		WebElement feelingLuckybtn =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
		
		textbox.sendKeys(searchText);
		feelingLuckybtn.click();
		
	}
	@Then("search by feeling lucky should be successful")
	public void search_by_feeling_lucky_should_be_successful() {
	    
		WebElement result=driver.findElement(By.xpath("//*[name()='title']"));//span[@class='navbar-logo']
		System.out.println("Search "+"then"+result.getText());
		assertTrue(result.getText().contains("*.Selenium logo green.*"));
	}
	

}
