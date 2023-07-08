package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
     // Ask how many new user we want to add
	public static void main (String args[]) {
		//Create n number of new Students
	System.out.println("Enter number of new students to enrolled ");
	Scanner in = new Scanner(System.in);
	int numOfstudents = in.nextInt();
	Student[] students= new Student[numOfstudents];
	
	for(int n=0; n<numOfstudents; n++) {
		students[n]= new Student();
		students[n].Enroll();
		students[n].payTuition();
		System.out.println(students[n].toString());
		}
	   	
	// Ask how many new user we want to add
	
}
}
