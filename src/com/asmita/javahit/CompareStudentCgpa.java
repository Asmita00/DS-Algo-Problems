package com.asmita.javahit;

import java.util.Comparator;

public class CompareStudentCgpa implements Comparator<Student> {
		
		
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
		public int compare(Student stu1, Student stu2) {
			if(stu1.getCgpa()<stu2.getCgpa()){
				return -1;
			}
			else if(stu1.getCgpa()>stu2.getCgpa()){
				return 1;
			}
			return 0;
		}
		
		
	}


