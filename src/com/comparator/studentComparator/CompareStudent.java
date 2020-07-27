package com.comparator.studentComparator;
/*package com.asmita.javahit;

import java.util.ArrayList;
import java.util.Comparator;

public class CompareStudent  {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setCgpa(7.56);
		student1.setFirstName("Ashish");
		student1.setId(84);
		
		Student student2 = new Student();
		student2.setCgpa(4.53);
		student2.setFirstName("Nikhil");
		student2.setId(67);
		
		Student student3 = new Student();
		student3.setCgpa(6.56);
		student3.setFirstName("Bikash");
		student3.setId(8);
		
		Student student4 = new Student();
		student4.setCgpa(7.22);
		student4.setFirstName("Usha");
		student4.setId(43);
		
		Student student5 = new Student();
		student5.setCgpa(5.56);
		student5.setFirstName("Robin");
		student5.setId(64);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		System.out.println("studentList::" + studentList.size());
		
		studentList.sort(new Comparator<Student>(){

			@Override
			public int compare(Student stu1, Student stu2) {
				if(stu1.getCgpa() == stu2.getCgpa()){
					if(stu1.getFirstName().compareTo(stu2.getFirstName())==0){
						return(stu1.getId()-stu2.getId());
					}
						else{
							return stu1.getFirstName().compareTo(stu2.getFirstName());
						
						}
					}
				else{
					double compCgpa= stu2.getCgpa()-stu1.getCgpa();
					if(compCgpa >0)
					{
						return -1;
					}
					else{
						return 1;
					}
				
				}
			}
		);
	}
	
}
	 
			
			
		
	
		



	
*/