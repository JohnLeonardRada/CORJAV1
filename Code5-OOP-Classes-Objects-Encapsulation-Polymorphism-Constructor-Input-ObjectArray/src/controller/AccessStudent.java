package controller;

import model.StudentBean;
import utility.Reader;

public class AccessStudent {

	public static void main(String[] args) {
		
		StudentBean student [] = new StudentBean[5];
		
		initializeArray(student);
		printDetails(student);
		askInputRecords(student);
		printDetails(student);
	}

	public static void initializeArray(StudentBean student[]) {
		
		for (int counter = 0; counter < student.length; counter++) {
			student[counter] = new StudentBean();
		}
	}
	
	public static void askInputRecords(StudentBean student[]) {
		int studentCounter = 1;
		for (int counter = 0; counter < student.length; counter++) {
			System.out.println("\nEnter student details for student" + studentCounter);
		
		student[counter].setId(Reader.readString("Enter id"));
		student[counter].setName(Reader.readString("Enter name"));
		student[counter].setCourse(Reader.readString("Enter course"));
		student[counter].setYearLevel(Reader.readInt("Enter year level"));
		
		String gender = Reader.readString("Enter gender");
		
		boolean isMale = (gender.equalsIgnoreCase("Male"))?true:false;
		student[counter].setMale(isMale);
		
		studentCounter++;
		
		}
	}
	
	public static void printDetails(StudentBean estudyante[]) {
		
		System.out.println("\nPrinting Student Details");
		for (int counter = 0; counter < estudyante.length; counter++) {
			System.out.println("Array Index["+counter+"]");
			System.out.println("ID: " + estudyante[counter].getId());
			System.out.println("Name: " + estudyante[counter].getName());
			System.out.println("Course: " + estudyante[counter].getCourse());
			System.out.println("Year Level: " + estudyante[counter].getYearLevel());
			System.out.println("Gender: " + ((estudyante[counter].isMale())?"Male\n":"Female\n"));
		}
	}
	
	public static void printDetails(StudentBean estudyante) {

		System.out.println("\nPrinting Student Details");
		System.out.println("ID: " + estudyante.getId());
		System.out.println("Name: " + estudyante.getName());
		System.out.println("Course: " + estudyante.getCourse());
		System.out.println("Year Level: " + estudyante.getYearLevel());
		System.out.println("Gender: " + ((estudyante.isMale())?"Male\n":"Female\n"));

		estudyante.study();
		estudyante.shouldNotThinkAboutBreak();
		estudyante.mustLoveAllJavaSubjects();
		estudyante.mustBeOnTime();
}

}