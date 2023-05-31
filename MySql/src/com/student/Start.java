package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Welcome Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to Exit student");
			//System.out.println("Press 5 to add student");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				//Add Student
				System.out.println("Enter User Name");
				String name = br.readLine();
				
				System.out.println("Enter User Phone");
				String phone = br.readLine();
				
				System.out.println("Enter User City");
				String city = br.readLine();
				
				Student st = new Student(name,city,phone);
				System.out.println(st); 
				boolean ans = StudentDao.insertStudentToDb(st);
				if (ans) {
					System.out.println("Student is Added Succ");
				} else {
					System.out.println("Student not Added");
				}
				
			} else if (c == 2) {
				//Delete

			} else if (c == 3) {
				//Display

			} else if (c == 4) {
				//Exit 

				break;

			} else {

			}
		}
		System.out.println("Thank you for using my Application...");
		System.out.println("See you soon... bye bye");

	}
}
