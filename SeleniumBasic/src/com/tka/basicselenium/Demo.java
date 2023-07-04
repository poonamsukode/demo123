package com.tka.basicselenium;

//Upto Day9

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		// This basically sets the system property is method to value named
		// webdriver.chrome.driver
		// And path to ChormeDriver

		WebDriver driver = new ChromeDriver();
		// we are creating chromedriver instance/object & storing it in a
		// variable(refer var)called driver. which is a type of webdriver interface
		//webdriver is a datatype its non primitive DT

		driver.get("https://www.google.com/");
		// To get google page

		driver.get("file:///C:/SELENIUM%20Software/Offline%20Website/index.html");
		// To get selenium offline webapage

		String title = driver.getTitle();
		System.out.println("==>> " + title);// or↓
		// string is StringClass to store the title(variable) using
		// get title is a webdrivermethod
		// to get web page title

		// System.out.println("Page title is : " + driver.getTitle());//or↑

		String url = driver.getCurrentUrl();
		System.out.println("currentpagelink==>> " + url);
		// to get current webpagelink

		// String source = driver.getPageSource();
		// System.out.println("pagesource==>> "+source);
		// to get html code

		WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("kiran@gmail.com");
// to add email id using xpath. and use send keys
// findElement: This command is used to uniquely identify
// a web element within the web page
//DOM acces document access model means full web page called dom
// webelement is a interface and findElement returning WebElement 
// emailElement is a ref. variable		

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		// for sign in page using click()

//		WebElement courseElemnent = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small"));
//		String strCourse = courseElemnent.getText();// getText return type is String
//		System.out.println("=> "+strCourse);

		WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small"));
		System.out.println(element.getText());

		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kiran");

		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("123456789");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");

		// driver.findElement(By.xpath("//*[@id="Male"]).click();

		driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();

		// driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();

		WebElement dropDownElement = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select select = new Select(dropDownElement);
		// drop down automation by using select class in Selenium WebDriver
		// is used for selecting and deselecting option in a dropdown
		select.selectByVisibleText("HP");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");

		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input"))
				.sendKeys("94235919167");
		// frnd mobile num by using copy fullxpath bcz mob num taking two times

		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		// pop up box
	}

}
