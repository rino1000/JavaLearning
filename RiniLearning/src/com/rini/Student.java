package com.rini;

public class Student implements Comparable<Student>, ProgressMeasurable<String>{
	
	private int id;
	private String name;
	private int marks;
	
	private static final String ACTIVITY_DRINK_COFFEE = "Drink Coffee";
	private static final String ACTIVITY_EAT_CHOCOLATE = "Eat Chocolate";
	
	private String[] activities = new String[]{ACTIVITY_DRINK_COFFEE, ACTIVITY_EAT_CHOCOLATE};
		
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.marks = (int) (Math.random() * 100);
	}
	
	
	public int getId() {		
		return id;
	}
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public String doActivity(){
		int sel = (int) (Math.random() * 2);
		return activities[sel];
	}


	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals is called");
		
		if(!(obj instanceof Student)){
			return false;
		}
		
		Student s = (Student) obj;
		
		if(!this.name.equals(s.getName())){
			return false;
		}
		
		return true;
	}


	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}


	@Override
	public int compareTo(Student o) {
		
		if(this.id == o.id){
			return 0;
		}else if(this.id > o.id){
			return 1;
		}

		return -1;
		
		
	}


	@Override
	public String getMarksStatus() {
		if(this.marks >= 80){
			return "Distinction";
		}else if(this.marks >=60){
			return "first class";
		}else if(this.marks >= 40){
			return "pass";
		}
		return "fail";
	}
	

}
