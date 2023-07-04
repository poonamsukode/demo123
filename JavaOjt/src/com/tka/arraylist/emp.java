package com.tka.arraylist;

import java.util.ArrayList;

public class emp {

	int empid;
	String empnm;

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public emp(int empid, String empnm) {
		super();
		this.empid = empid;
		this.empnm = empnm;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpnm() {
		return empnm;
	}

	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}

	@Override
	public String toString() {
		return "emp [empid=" + empid + ", empnm=" + empnm + "]";
	}

	public static void increaseSal(ArrayList<? extends emp> al) {
		for (emp e : al) {
			if (e instanceof Tempemp) {
				Tempemp t = (Tempemp) e;
				t.wages = t.wages + 200;
			}
			if (e instanceof permempl) {
				permempl t = (permempl) e;
				t.sal = t.sal + 5000;
			}
		}
	}
}
