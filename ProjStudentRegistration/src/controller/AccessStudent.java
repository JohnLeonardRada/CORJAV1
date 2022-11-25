package controller;

import model.StudentBean;

import utility.Reader;

import java.util.*;

public class AccessStudent {
	private static int overallCounter = 0;
	private static int se = 0;
	private static int gd = 0;
	private static int wd = 0;
	
	public static void timer() {

		try{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex){
		    Thread.currentThread().interrupt();
		}
		
	}
	
	public static void studentDetails(StudentBean students) {
		
		System.out.println("ID:" + students.getStudId());
		System.out.println("Last Name:" + students.getLastName());
		System.out.println("First Name:" + students.getFirstName());
		System.out.println("Course:" + students.getCourse());
		System.out.println("Year Level:" + students.getYearLevel());
		System.out.println("Units Enrolled:" + students.getUnitsEnrolled() + "\n");
		
	}	
	
	public static void main(String[] args) {
	
		System.out.println("\t===================================================================");
		System.out.println("\t===================================================================");
		System.out.println("\t\t  STUDENT REGISTRATION DATABASE MANAGEMENT SYSTEM");
		System.out.println("\t\t\t\t  Programmed by");
		System.out.println("\t\t\t\tJohn Leonard Rada");
		System.out.println("\t===================================================================");
		System.out.println("\t===================================================================");
		System.out.println("\n");
		StudentBean studRegistration [] = new StudentBean[5];

		initializeArray(studRegistration);
		option(studRegistration);
		
	}

	public static void initializeArray(StudentBean students[]) {
		
		for (int counter = 0; counter < students.length; counter++) {
			students[counter] = new StudentBean();
		}
	}
	
	public static void option(StudentBean students[]) {
		
		Scanner scan = new Scanner(System.in);
		
		String choice;
		do {
			System.out.println("SELECT A CHOICE:");
			System.out.println("----------------");
		    System.out.print("[A]-Add Student\n");
		    System.out.print("[L]-List Student\n");
		    System.out.print("[S]-Search Student\n");
		    System.out.print("[D]-Delete Student\n");
		    System.out.print("[R]-Report Student\n");
		    System.out.print("[P]-Purge\n");
		    System.out.print("[Q]-Quit\n");
		    System.out.println("\nSELECTION OPTION:");
		    System.out.println("-----------------");
		    
		    choice = scan.nextLine().toUpperCase();
		    
		    switch(choice){

		    case "A":
		    	addStudents(students);	
		    	break;
		    case "L": 
		    	listStudents(students);
		        break;
		    case "S":
		    	searchStudents(students);
		        break;
		    case "D": 
		    	deleteStudents(students);
		        break;
		    case "R":
		    	reportGenerator(students);
		        break;
		    case "P":
		    	purge(students);
		    	break;
		    case "Q": 
		    	quit(students);
		         break;
		    default:
		    System.out.println(choice + " is an invalid input! Select another choice.");
		    }
		} while(choice != "Q");
    
		scan.close();
		
	}
	
	public static void addStudents(StudentBean students[]) {

		System.out.println("Option 1 Selected!");
		
		if(overallCounter < 5) {

		System.out.println("\nENTER STUDENT DETAILS");
		String studentId = Reader.readString("Enter id");
		String lastName = Reader.readString("Enter last name");
		String firstName = Reader.readString("Enter first name");
		String course = Reader.readString("Enter course [BSCS-SE][BSCS-GD][BSCS-WD]");
			while(!course.equalsIgnoreCase("BSCSSE") 
			   && !course.equalsIgnoreCase("BSCSGD") 
			   && !course.equalsIgnoreCase("BSCSWD")) {
				System.out.println("\nInvalid input! Input another course.");
			course = Reader.readString("Enter course [BSCS-SE][BSCS-GD][BSCS-WD]");
			}if(course.equalsIgnoreCase("BSCSSE")) {
				se++;
			}else if(course.equalsIgnoreCase("BSCSGD")) {
				gd++;
			}else if(course.equalsIgnoreCase("BSCSWD")) {
				wd++;
			}
		int yearLevel = Reader.readInt("Enter year level");
			while (yearLevel < 1 || yearLevel > 4) {
				System.out.println("\nInvalid input! Input another year level.");
			yearLevel = Reader.readInt("Enter year level");
			}
		int unitsEnrolled = Reader.readInt("Enter units enrolled");//Minimum of 8 units and maximum of 30 units
			while(unitsEnrolled < 8 || unitsEnrolled > 30) {
				System.out.println("\nInvalid input! Minimum # of Units[8] and Maximum # of Units[30].");
			unitsEnrolled = Reader.readInt("Enter units enrolled");
			}

		students[overallCounter].setStudId(studentId);
		students[overallCounter].setLastName(lastName.toUpperCase());
		students[overallCounter].setFirstName(firstName.toUpperCase());
		students[overallCounter].setCourse(course.toUpperCase());
		students[overallCounter].setYearLevel(yearLevel);
		students[overallCounter].setUnitsEnrolled(unitsEnrolled);

		System.out.println("\nADDING STUDENTS TO THE DATABASE...");
		timer();
		System.out.println("\nStudent " + students[overallCounter].getStudId() + " Added to the Database!");
		System.out.println("Located at Index " +overallCounter + "\n");
		
		overallCounter++;
		} else{
			System.out.println("\nEXCEEDING THE DATABASE LIMIT!!!");
		}

	}
	
	public static void listStudents(StudentBean students[]) {
		
		System.out.println("Option 2 Selected!");
		
		if(overallCounter >= 1) {
			System.out.println("\nPRINTING STUDENT DETAILS...");
			timer();
			System.out.println("\nLists of Students Enrolled");
			for(StudentBean student: students) {
				if(!student.getStudId().equals("")) {
					studentDetails(student);
				}
			}
			
			System.out.println("Total Students Enrolled: " +overallCounter);
			System.out.println("Total # for SE:" +se);
			System.out.println("Total # for GD:" +gd);
			System.out.println("Total # for WD:" +wd + "\n");
			
		}else {
			System.out.println("\nTHE DATABASE IS EMPTY\n");
			
		}
	}	

	public static void searchStudents(StudentBean students[]) {
		
		System.out.println("Option 3 Selected!");

		if (overallCounter == 0){
			System.out.println("\nTHE DATABASE IS EMPTY" + "\n");

		}else {
			String id = Reader.readString("\nEnter ID");
			System.out.println("\nSEARCHING FOR STUDENT...");
			
			timer();
			
			for(StudentBean student: students) {
				if(id.equals(student.getStudId())) {
					System.out.println("\nDATA LOCATED!");
					studentDetails(student);
					break;
				}else {
					System.out.println("\nDATA NOT LOCATED!");
					System.out.println("Choose another option.\n");
					break;
				}

			}
				
		}
		
	}
				
	public static void deleteStudents(StudentBean students[]) {
		
		System.out.println("Option 4 Selected!");
		
		String userAccount =null;
		String pass=null;
		
		userAccount = Reader.readString("\nEnter Admin ID");
		pass = Reader.readString("Enter password");
		
		boolean validAccount =(userAccount.equals("qwerty")&& pass.equals("123456")?true:false);
		
		if(overallCounter == 0) {
			System.out.println("\nTHE DATABASE IS EMPTY" + "\n");
		}else {		
			if(validAccount) {
				System.out.println("Account Successfully Entered");
				String studentId = Reader.readString("\nEnter id");
				System.out.println("PLEASE WAIT... SEARCHING FOR STUDENT RECORD...");
				
				timer();
	
				for(StudentBean student: students) {
					if(studentId.equals(student.getStudId())) {
						student.setStudId("");
						student.setLastName("");
						student.setFirstName("");
						student.setCourse("");
						student.setYearLevel(0);
						student.setUnitsEnrolled(0);		
						System.out.println("\nData found and successfully deleted!\n");
						overallCounter--;
						break;
					}else {
						System.out.println("\nDATA NOT LOCATED\n");
						break;
					}	
				}

			}else {
				System.out.println("\nInvalid Account! \n");
			}
		
		}

	}

	public static <createXMLDatabaseFile, createPDFStudentList> void reportGenerator(StudentBean students[]) {
		
		System.out.println("Option 5 Selected!");

		String userAccount =null;
		String pass=null;
		
		userAccount = Reader.readString("Enter Admin ID");
		pass = Reader.readString("Enter password");
		
		boolean validAccount =(userAccount.equals("qwerty")&& pass.equals("123456")?true:false);
		
		if (overallCounter == 0){
			System.out.println("\nTHE DATABASE IS EMPTY" + "\n");

		}else {
			if(validAccount) {
				System.out.println("Account Successfully Entered");
				String course = Reader.readString("\nEnter course");
				while(!course.equalsIgnoreCase("BSCSSE") 
					       && !course.equalsIgnoreCase("BSCSGD") 
					       && !course.equalsIgnoreCase("BSCSWD")) {
								System.out.println("\nInvalid input! Input another course.");
						course = Reader.readString("Enter course [BSCS-SE][BSCS-GD][BSCS-WD]");
						}
				System.out.println("\nReport Generator Facility");
				System.out.println("Generating report...");
				
				timer();
				
				System.out.println("Lists of Students Enrolled\n");
			
				for(StudentBean student: students) {
					if((course.equals(student.getCourse()))&& (course.equalsIgnoreCase("BSCSSE"))) {
						studentDetails(student);
					}else if((course.equals(student.getCourse()))&& (course.equalsIgnoreCase("BSCSGD"))) {
						studentDetails(student);
					}else if((course.equals(student.getCourse()))&& (course.equalsIgnoreCase("BSCSWD"))) {
						studentDetails(student);
					}else {
						System.out.println("DATA NOT LOCATED!");
						System.out.println("Choose another option.\n");
						break;
					}

				}
				
				utility.Reader.createXMLDatabaseFile(students);
				timer();
				System.out.println("XML File Created.");
				System.out.println("Creating PDF File...");
				timer();
				utility.Reader.createPDFStudentList(students);
				System.out.println("PDF File Created.\n");
				
			}else{
				System.out.println("\nInvalid Account! \n");
			}
	
		}
	
	}
	
	public static void purge(StudentBean students[]) {
		
		System.out.println("Option 6 Selected!");
		
		String userAccount =null;
		String pass=null;
		
		userAccount = Reader.readString("\nEnter Admin ID");
		pass = Reader.readString("Enter password");
		
		boolean validAccount =(userAccount.equals("qwerty")&& pass.equals("123456")?true:false);
		
		if(overallCounter == 0) {
			System.out.println("\nTHE DATABASE IS EMPTY" + "\n");
		}else {		
			if(validAccount) {
				System.out.println("Account Successfully Entered");
				for(StudentBean student: students) {
						student.setStudId("");
						student.setLastName("");
						student.setFirstName("");
						student.setCourse("");
						student.setYearLevel(0);
						student.setUnitsEnrolled(0);	
						System.out.println("\nPLEASE WAIT... DELETING ALL RECORDS...");
						
						timer();
						
						System.out.println("\nALL DATA HAVE BEEN REMOVED\n");
						overallCounter = 0;
						break;
					
				}

			}else {
				System.out.println("\nInvalid Account! \n");
			}
		
		}

	}
	
	public static <readXMLDatabaseFile> void quit(StudentBean students[]) {
		
		System.out.println("Option 7 Selected!");
		
		String userAccount =null;
		String pass=null;
		userAccount = Reader.readString("Enter Admin ID");
		pass = Reader.readString("Enter password");
		
		boolean validAccount =(userAccount.equals("qwerty")&& pass.equals("123456")?true:false);
		
		if(validAccount) {
			String choice = Reader.readString("Are you sure you want to terminate the program? [Y/N]");
			while(!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
				System.out.println("Invalid Input!");
				choice = Reader.readString("Enter choice");	
			}
			if(choice.equalsIgnoreCase("Y")) {
			System.out.println("\nProgram terminating...");
		
				timer();
			
				System.out.println("Program terminated. Thank you for using the system.");
				System.exit(0);
			}
			utility.Reader.readXMLDatabaseFile(students);
		}else{
			System.out.println("\nInvalid Account! Select Another Choice:");
		}
		
	}
	
}
