package com.tka.locators;

//day11
//1 Locators In selenium

//- we can access webelement 
//1 Id
//2 name
//3 linkText 
//	generally used on <a href="..."> tag 
//	<a href="..">Home</a>
//4 partialLinkText
//5 tag name 
//6 Attributes
//7 class name => Pending
//8 Dynamic xpath => Pending

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/SELENIUM%20Software/Offline%20Website/index.html");

		// driver.findElement(By.linkText("Register a new membership")).click();
		// link text locator

		driver.findElement(By.partialLinkText("Register a")).click();
		// partial link text

		driver.findElement(By.name("name")).sendKeys("poonam");

		driver.findElement(By.id("mobile")).sendKeys("9423591967");

		// driver.findElement(By.name("email")).sendKeys("poonam@gmail.com");//its work

		// driver.findElement(By.tagName("input")).sendKeys("sumit@gmail.com");
		// its not work adding name and emailid take at atime in one name block by using
		// tagname
		// so
		// Find the text input element by its tagname
		// There was many input tag so store this in
		// List<WebElement> listelements then retrive
		// this element using for loop and check the
		// the proper input field after getting this
		// break this loop

		List<WebElement> listElement = driver.findElements(By.tagName("input"));
		// findElement's return list<webElement>
		// List<> <>indicates generic its indicate the which type of data we store
		// its returning webelement thats why i store webelement

		System.out.println(listElement.size());

		for (int i = 0; i < listElement.size(); i++) {

			String strplaceholder = listElement.get(i).getAttribute("placeholder");
			// get(i)-its returning index value and getAttribute returning
			// perticular unique webelement which is store in emailxpath
			// this placeholder return the string thats why we using string strplaceholder

			System.out.println("==>" + strplaceholder);

			if (listElement.get(i).getAttribute("placeholder").compareTo("Email") == 0) {

				System.out.println("element found");

				listElement.get(i).sendKeys("poonam@gmail.com");
			} else if (listElement.get(i).getAttribute("placeholder").compareTo("Password") == 0) {
				listElement.get(i).sendKeys("123456");
			}

		}

		 driver.findElement(By.className("btn")).click();// signup button
		 
		 Alert alert= driver.switchTo().alert();//pop up box
		 alert.accept();// pop up box
		 driver.switchTo().defaultContent(); //pop up box
		 
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
	}

}