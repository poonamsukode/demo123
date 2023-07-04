package com.tka.basic;

public class DemoCoreJava {

	public int a;

	public DemoCoreJava() {
		System.out.println("no arg const....");
	}

	public DemoCoreJava(int a) {
		this.a = a;
	}

	public int getAccess_a_Variable() {
		return this.a;
	}

   
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		DemoCoreJava obj=new DemoCoreJava(9);
		
		
		System.out.println(obj.getAccess_a_Variable());
		System.out.println("=> "+obj.a);
		
	}

}
