package com.tka.arraylist;

public class permempl extends emp {

	int sal;

	public permempl() {
		super();
		
	}

	public permempl(int eid, String enm, int sal) {
		super(eid, enm);
		this.sal = sal;

	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "permempl [sal=" + sal + ", empid=" + empid + ", empnm=" + empnm + "]";
	}

	

}
