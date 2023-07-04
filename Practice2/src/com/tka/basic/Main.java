package com.tka.basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System.out.println(30+40);

		Scanner input = new Scanner(System.in);

		System.out.println("Input First sumno:");
		int sum1 = input.nextInt();

		System.out.println("Input Second sumno:");
		int sum2 = input.nextInt();
		int sum = sum1 + sum2;

		System.out.println();
		System.out.println("sum of two num:" + sum);
	}

}
