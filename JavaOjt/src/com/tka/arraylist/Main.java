package com.tka.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	  
		System.out.println("Enter your choice");
		System.out.println("1.Perm Emp");
		System.out.println("2.Temp Emp");

		int ch = sc.nextInt();
		switch (ch) {

		case 1: {
			ArrayList<emp> al = new ArrayList();

			al.add(new permempl(1, "A", 8000));
			System.out.println("Before update");
			System.out.println(al);

			emp.increaseSal(al);
			System.out.println("After update");
			System.out.println(al);
			break;

		}
		case 2: {
			ArrayList<emp> al = new ArrayList();
			al.add(new Tempemp(11, "AA", 800));
			System.out.println("Before update");
			System.out.println(al);

			emp.increaseSal(al);
			System.out.println("After update");
			System.out.println(al);
			break;

		}
		}

	}

}
