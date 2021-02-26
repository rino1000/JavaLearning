package com.rini;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class College implements ProgressMeasurable<Student>{
	
	SortedSet<Student> students = new TreeSet<>();

	String principal;

	public College(String principal) {
		super();
		this.principal = principal;
	}
	
	public void addStudent(String studentName){
		students.add(new MBAStudent(studentName));
	}
	
	public void voiceAttandence(){
		
		for(Student s : students){
			System.out.println(s + " is present sir");
		}
	}
	
	public void sort(Comparator<Student> c){
		SortedSet<Student> studentsTemp = new TreeSet<>(c);
		studentsTemp.addAll(students);
		students = studentsTemp;
	}

	@Override
	public Student getMarksStatus() {
		return students.first();
	}
}
