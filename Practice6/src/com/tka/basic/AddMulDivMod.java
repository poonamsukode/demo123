package com.tka.basic;

import java.util.Scanner;

public class AddMulDivMod {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter First num: ");
		int num1 = input.nextInt();

		System.out.println("Enter Second num: ");
		int num2 = input.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

	}

}
