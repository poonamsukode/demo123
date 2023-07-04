package com.tka.collection;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap {

	static HashMap<Character, Integer> hm = new HashMap();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a String");
		String s = sc.next();
		int i = 0;
		System.out.println(s.length());

		while (i < s.length()) {
			char ch = s.charAt(i);
			if (hm.containsKey(ch))
				hm.put(ch, hm.get(ch) + 1);
			else
				hm.put(ch, 1);
			i++;
			System.out.println(hm);
		}
	}
}
