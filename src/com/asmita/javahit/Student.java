package com.asmita.javahit;

public class Student implements Comparable<Student> {
	
	
	public Student(int id, double cgpa, String firstName) {
		super();
		this.id = id;
		this.cgpa = cgpa;
		this.firstName = firstName;
	}
	private int id;
	private double cgpa;
	private String firstName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public int compareTo(Student student) {
		return this.getId()- student.getId();
	
	}
	
	
}
