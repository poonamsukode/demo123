package com.tka.basic;
 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Config {
		
		WebDriver driver;
		
		public void driverSetting(String url) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			
			//driver.get("file:///C:/SELENIUM%20Software/Offline%20Website/index.html");
			
			driver.get(url);
			
		}
		
		public WebElement elementAccess(String elementxpath) {
			//return driver.findElement(By.xpath("//*[@id=\"email\"]"));
			return driver.findElement(By.xpath(elementxpath));
		}
		
		
		public void loginAccess() {
			
		
			WebElement emailElement=elementAccess("//*[@id=\"email\"]");
			emailElement.sendKeys("kiran@gmail.com");
			
			
			
			//WebElement passwordElement= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			
			WebElement passwordElement= elementAccess("//*[@id=\"password\"]");
			passwordElement.sendKeys("123456");
			
			//driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			
			WebElement btnElement= elementAccess("//*[@id=\"form\"]/div[3]/div/button");
			btnElement.click();
			
		}

}
