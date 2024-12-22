package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver = new ChromeDriver();

	@Test
  public void Test1() {
  driver.get("https://artoftesting.com/samplesiteforselenium");
  driver.findElement(By.cssSelector("div#commonWebElements p ")).click();
  
  driver.findElement(By.id("fname")).sendKeys("Hello from testers");
  
  driver.findElement(By.id("idOfButton")).click();
  WebElement element= driver.findElement(By.id("dblClkBtn"));
  Actions actions= new Actions(driver);

  actions.doubleClick(element).perform();
  
  driver.switchTo().alert().accept();
  
  driver.findElement(By.id("female")).click();
  
  driver.findElement(By.className("Automation")).click();
  driver.findElement(By.className("Performance")).click();
  }
  
}
