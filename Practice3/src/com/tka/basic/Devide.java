package com.tka.basic;

import java.util.Scanner;

public class Devide {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("devide num1:");
		int num1 = input.nextInt();
		
		System.out.println("devide num2:");
		int num2 = input.nextInt();
		
		int num3 = (num1/num2);
		
		System.out.println("Difference of num:" +num3);
		

	}

}
