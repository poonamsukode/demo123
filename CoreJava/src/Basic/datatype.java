package Basic;

public class datatype {

	public static void main(String[] args) {

		// Long age = 5000000000L;
		// float age = 33.33f;
		// double age = 33.33;

		// System.out.println(age);

		// char ch = 'A' ;
		// char ch = 'aa' ; // error bcz only one char value allowed.
		char ch = '1';

		System.out.println(ch); // in char datatype only one charachter data type store

		String name = "my name is poonam";
		System.out.println(name);

		//boolean b = true;
		System.out.println();

		/*
		 * int a = 10; int A = 10; System.out.println("a : " + a);
		 * System.out.println("A : " + A);
		 */

		int age;
		age = 40;
		age = 45;
		System.out.println(age);

		int x;
		int y;
		x = 200;
		y = 30;

		int z = x + 20;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		int a = 20;
		int b = 30;
		//int c = a + b;

		String c = "sai";

		int d = a + b;
		
		String e = c + d;
		System.out.println(10+20);
		System.out.println("10"+20);
		
		System.out.println(e);
		
		
		int num1 = 30;
		int num2 = 10;
		int num3 = 40;
		
		boolean res = (num1>num2) || (num1>num3);
		
		System.out.println(res);

	}

}