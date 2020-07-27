package com.comparator.studentComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(0, 11);	
		numList.add(1, 300);
		numList.add(2, 45);
		numList.add(3, 55);
		numList.add(4, 100);
		
		sumList(numList);
		
		
		ArrayList<Student> student = new ArrayList<Student>();
		Student student1 = new Student (12,7.77,"Asmita");
		Student student2 = new Student (14,7.88,"Jasmine");
		Student student3 = new Student (7,8.77,"Shravanthi");
		
		student.add(student1);
		student.add(student2);
		student.add(student3);
		
		
		LocalDate date = LocalDate.now();
		//System.out.println(date.parse("tyugfgh"));
		Collections.sort(student);
		for(Student stu : student){
			System.out.println(stu.getId() +" "
								+stu.getCgpa()+" "
								+stu.getFirstName());
		}
		CompareStudentCgpa cscgpa = new CompareStudentCgpa();
		Collections.sort(student, cscgpa);
		for(Student stu : student){
			System.out.println(stu.getId() +" "
								+stu.getCgpa()+" "
								+stu.getFirstName());
		}
		
		CompareStudentFirstName csFirstName = new CompareStudentFirstName();
		Collections.sort(student, csFirstName);
		
	}
		
	public static int sumList(List<Integer> list){
		
		return list.stream().filter(i -> i>10).mapToInt(i -> i).sum();
			
		}
		

	}


