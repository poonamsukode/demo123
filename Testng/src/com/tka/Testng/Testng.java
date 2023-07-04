package com.tka.Testng;

import org.testng.annotations.Test;

public class Testng {

	@Test(priority = 1)
	public void signup1() {
		System.out.println("==>signup1 ===>  ");
	}

	@Test(priority = 2)
	public void signup2() {
		System.out.println("==>signup12 ===>  ");
	}

}
