package com.testautomation.StepDef;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomation.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchStepDef {
	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();  
    
	@Given("^Open browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
		Properties properties=obj.getProperty();   
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\newChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();			
		driver.get(properties.getProperty("browser.googleURL"));
		Thread.sleep(3000);	 	   
	}

	@When("^Enter searching creteria$")
	public void enter_search_creteria() throws Throwable 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium TestNG with cucumber");		
		Thread.sleep(1000);	 	    
	}

	@Then("^Click the search button$")
	public void click_on_search_button() throws Throwable 
	{
//		driver.findElement(By.id("search-icon-legacy")).click();;	
//		Thread.sleep(3000);	 	
		driver.quit();
	}

}