package com.tka.chromelog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Loginpage 
{
	public void login() {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.get("file:///C:/SELENIUM%20Software/Offline%20Website/index.html");

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");

		driver.findElement(By.xpath("//button")).click();


		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}