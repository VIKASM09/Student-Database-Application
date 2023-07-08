package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	 private String firstname;
	 private String lastname;
	 private int gradeyear;
	 private String studentID;
	 private String courses;
	 private int tuitionbalance = 0;
	 private static int costofcourse = 600;
	 private static int id = 1000;
    // Constructor: prompt user to enter student's name and year
	 public Student() {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter Students Firstname: ");
		 this.firstname = in.nextLine();
		 
		 System.out.print("Enter Students lastname: ");
		 this.lastname = in.nextLine();
		 
		 System.out.print("1 freshmen\n 2 Sophmore\n 3 junior\n 4 Senior\nEnter Students Class level : ");
		 this.gradeyear = in.nextInt();
		 
		 setStudentID();
	  	 }
	 
	
	// Generate an ID
	 private void setStudentID(){
		 // Grade level+ ID
		 id++;
		 this.studentID = gradeyear + "" + id;
	 }
	
	//Enroll in Courses 
	 public void Enroll() {
		 
		 do {
			 System.out.print("Enter the course to Enroll ( Q to Quit ): ");
		 Scanner in = new Scanner(System.in);
		 String course = in.nextLine();
		 if (!course.equals("Q")) {
			 courses = courses + "\n  " + course;
			 tuitionbalance = tuitionbalance + costofcourse;
			 }
		 else {
				 break;
			 }
		  }while ( 1!=0);
		  }
	
	//view Balance
	 public void viewBalance(){
		 System.out.println(" Your balance is : $" + tuitionbalance);
	 }
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionbalance = tuitionbalance - payment;
		System.out.println("Thank you for your Payment of $" + payment);
		viewBalance();
	}
	// show Status
	public String toString() {
		return "Name: " + firstname + " "+ lastname +" "+
	            "\nGrade Level :"+ gradeyear +
	           "\nStudent ID: "+ studentID+
	           "\nEnrolled Courses: "+ courses +
	           "\nBalance: $"+ tuitionbalance;
		
	}
}
