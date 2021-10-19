package com.practice.removeduplicate;

import java.util.*;

public class Tester {
	
	public static HashMap<String, ArrayList<String>> retrieveStudentInfo(ArrayList<Student> a1) {
		 HashMap<String, ArrayList<String>> hpmap = new HashMap<String, ArrayList<String>>();
		 
		 for(int i=0;i<a1.size();i++) {
			 if(hpmap.get(a1.get(i).getSchoolName()) == null) {
				 ArrayList<String> stud= new ArrayList<String>();
				 stud.add(a1.get(i).getStudName());
				 hpmap.put(a1.get(i).getSchoolName(), stud);
			 }else {
				 ArrayList<String> stud = hpmap.get(a1.get(i).getSchoolName());
				 stud.add(a1.get(i).getStudName());
				 hpmap.put(a1.get(i).getSchoolName(), stud);
			 }
		 }
		 
		 return hpmap;
		 
	}

	public static void main(String[] args) {

//		TreeSet<String> ts = new TreeSet<String>();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of students:");
//		int count = sc.nextInt();
//		
//		for(int i = 0;i< count;i++) {
//			ts.add(sc.next());
//		}
//		
//		System.out.println();
//		
//		for(String str: ts) {
//			System.out.println(str);;
//		}
		
		Student s1=new Student();
        s1.setStudId(1);
        s1.setStudName("John");
        s1.setSchoolName("ZEE");
        Student s2=new Student();
        s2.setStudId(2);
        s2.setStudName("Tom");
        s2.setSchoolName("ZEE");
        Student s3=new Student();
        s3.setStudId(3);
        s3.setStudName("Peter");
        s3.setSchoolName("BEE");
        Student s4=new Student();
        s4.setStudId(4);
        s4.setStudName("Rose");
        s4.setSchoolName("OX-FO");
        Student s5=new Student();
        s5.setStudId(5);
        s5.setStudName("Alice");
        s5.setSchoolName("ZEE");
        
        ArrayList<Student> al1 = new ArrayList<Student>();
        al1.add(s1);
        al1.add(s2);
        al1.add(s3);
        al1.add(s4);
        al1.add(s5);
        
        HashMap<String, ArrayList<String>> studentInfo = retrieveStudentInfo(al1);
		
		
	}

}
