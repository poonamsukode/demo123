package com.tka.arraylist;

public class Tempemp extends emp{

	int wages;

	public Tempemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tempemp(int eid, String enm,int wages) {
		super(eid, enm);
		this.wages = wages;

	}

	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
	}

	@Override
	public String toString() {
		return "Tempemp [wages=" + wages + ", empid=" + empid + ", empnm=" + empnm + "]";
	}

	
	
}
