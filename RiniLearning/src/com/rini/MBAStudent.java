package com.rini;

public class MBAStudent extends Student {

	public MBAStudent(String name) {		
		super((int) (Math.random() * 100), name);
	}
	
	public MBAStudent() {		
		this("ramdom student");
	}

	@Override
	public String doActivity() {
		return this.getName() + " is studying";
	}

	public String doActivity(String activity){
		return this.getName() + " is " + activity;
	}
}
