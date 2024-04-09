package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passwordTest {
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	      browser = new FirefoxDriver();
	  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
	 }
		
	 @Test
		public void Tests1() {
		 browser.findElement(By.name("characters")).sendKeys("ASDFGHJ");
		 String Expected="Valid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		assertEquals(Expected,result);

		 

	 }
	 @Test
		public void Tests2() {
		 
		 browser.findElement(By.name("characters")).sendKeys("qwertyu");
		 String Expected="Valid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		assertEquals(Expected,result);

		 

	 }
	 @Test
		public void Tests3() {
		 
		 browser.findElement(By.name("characters")).sendKeys("1234567");
		 String Expected="Valid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		assertEquals(Expected,result);

		 

	 }
	 
	 @Test
		public void Tests4() {
		 
		 browser.findElement(By.name("characters")).sendKeys("*******");
		 String Expected="Valid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		assertEquals(Expected,result);

		 

	   }
	 
	 
	 @Test
		public void Tests5() {
		 
		 browser.findElement(By.name("characters")).sendKeys("Aqwe23*");
		 String Expected="Valid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		assertEquals(Expected,result);

		 

	 }
	 
	 @Test
		public void Tests6() {
		 
		 browser.findElement(By.name("characters")).sendKeys("1qwsf*AWQ");
		 String Expected="Invalid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Expected,result);
		 }
	 
	 @Test
		public void Tests7() {
		 
		 browser.findElement(By.name("characters")).sendKeys("1qwsf*");
		 String Expected="Invalid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Expected,result);

		 

	 }
	 @Test
		public void Tests8() {
		 
		 browser.findElement(By.name("characters")).sendKeys("3fy711$");
		 String Expected="Invalid Value";
		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Expected,result);

		 

	 }
	 


}
