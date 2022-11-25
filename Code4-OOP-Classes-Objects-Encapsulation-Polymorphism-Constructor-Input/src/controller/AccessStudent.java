package controller;

import model.StudentBean;
import utility.Reader;

public class AccessStudent {

	public static void main(String[] args) {
		
		String id = Reader.readString("Enter id");
		String name = Reader.readString("Enter name");
		String course = Reader.readString("Enter course");
		int yearLevel = Reader.readInt("Enter year level");
		String gender = Reader.readString("Enter gender");	
	
		boolean isMale = (gender.equalsIgnoreCase("Male"))?true:false;
		
		StudentBean objStudent = new StudentBean(id, name, course, isMale, yearLevel);
		printDetails(objStudent);
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