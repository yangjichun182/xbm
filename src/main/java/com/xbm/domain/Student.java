package com.xbm.domain;


public class Student {

	private String ID;
	private String NAME;
	private String SEX;
	private int AGE;

	public Student() {
	}
	
	public Student(String ID,String NAME,String SEX,int AGE){
		this.ID=ID;
		this.NAME=NAME;
		this.SEX=SEX;
		this.AGE=AGE;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getSEX() {
		return SEX;
	}

	public void setSEX(String sEX) {
		SEX = sEX;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}
	
	

}
