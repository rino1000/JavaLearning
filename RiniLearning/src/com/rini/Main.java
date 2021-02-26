package com.rini;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Student rini = new MBAStudent("Rini");
		
		ProgressMeasurable rino = new MBAStudent("Rino");
		System.out.println(rino);
		System.out.println(rino.getMarksStatus());
		
		ProgressMeasurable rinoCollege = new College("Reshma");
		((College) rinoCollege).addStudent("Rini");
		
		Student x = (Student) rinoCollege.getMarksStatus();
		System.out.println(x.getMarksStatus());
		
//		
//		System.out.println(rini);
//		System.out.println(rini.doActivity());
//
//		
//		Student rino = new MBAStudent();
//		System.out.println(rino);
//		System.out.println(((MBAStudent)rino).doActivity("playing football"));
		
		
//		Comparator<Student> nameComp = new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareToIgnoreCase(o2.getName());
//			}
//		};
//		
//		College c = new College("Hema");
//		c.addStudent("Rini");
//		c.addStudent("Rino");
//		c.addStudent("Liya");
//		c.addStudent("Manu");
//		c.addStudent("Rini");
//		
//		c.voiceAttandence();
//		
//		
//		System.out.println("===========================================");
//		c.sort(nameComp);
//		c.voiceAttandence();
	}

}
