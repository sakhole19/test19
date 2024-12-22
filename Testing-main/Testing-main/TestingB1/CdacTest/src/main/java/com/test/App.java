package com.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        
//        driver.get("https://www.google.com/");       
//        driver.findElement(By.id("APjFqb")).sendKeys("Cdac center in pune");
        
//        driver.get("https://the-internet.herokuapp.com/login");
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.className("radius")).click();
//        String url=driver.getCurrentUrl();
//        System.out.println(url);
//        
        
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
