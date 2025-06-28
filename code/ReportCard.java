package com.gla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvalidMarkException extends Exception{
	public InvalidMarkException(String message) {
		super(message);
	}
}

class Student{
	String name;
	int[] marks;
	String[] subjects;
	double average;
	char grade;
	
	Student(String name, int[] marks, String[] subjects) throws InvalidMarkException {
		this.name=name;
		this.subjects=subjects;
		calcMarks(marks);
		this.marks=marks;
		this.average=calcAverage();
		this.grade=assignGrade();
	}
	
	public void calcMarks(int[] marks) throws InvalidMarkException {
		for(int num:marks){
			if(num<0 || num>100) {
				throw new InvalidMarkException("Marks : "+num+" is invalid");
			}
		}
	}
	
	public double calcAverage() {
		int total=0;
		for(int num:marks) {
			total+=num;
		}
		double avg=(double)total/marks.length;
		return avg;
	}
	
	
	public char assignGrade() {
		double avg=calcAverage();
		if(avg>=90) {
			return 'O';
		}
		else if(avg>=80 && avg<90) {
			return 'A';
		}
		else if(avg>=70 && avg<80) {
			return 'B';
		}
		else if(avg>=60 && avg<70) {
			return 'C';
		}
		else if(avg>=50 && avg<60) {
			return 'D';
		}
		else if(avg>=40 && avg<50) {
			return 'E';
		}
		else {
			return 'F';
		}
	}
	
	public void display() {
		
		System.out.println("Student name: "+name);
		
		for(int i=0;i<subjects.length;i++) {
			System.out.println(subjects[i]+" : "+marks[i]);
		}
		
		System.out.println("average marks: "+average);
		
		System.out.println("grade: "+grade);
		
		System.out.println("--------------------------------------");
		System.out.println();
		
	}
}

public class ReportCard {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		
		String subjects[]= {"Physics","Chemistry","Maths"};
		
		try {
			students.add(new Student("Aman", new int[] {90,96,55}, subjects));
			students.add(new Student("Harsh", new int[] {92,66,45}, subjects));
			students.add(new Student("Raghav", new int[] {20,76,40}, subjects));
			
		}
		catch(InvalidMarkException e){
			System.out.println("Error: "+e.getMessage());
		}
		
		for(Student x:students) {
			x.display();
		}
		
		

	}

}
