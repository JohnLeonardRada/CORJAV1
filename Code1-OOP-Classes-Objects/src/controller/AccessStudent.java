package controller;

import model.Student;
import utility.Reader;

public class AccessStudent {

	public static void main(String[] args) {
		Student studRada = new Student();

inputStudentDetail(studRada);

//call printDetails
printDetails(studRada);
}

	public static void inputStudentDetail(Student estudyante){

		estudyante.id = Reader.readString("Enter student id");
		estudyante.name = Reader.readString("Enter name");
		estudyante.course = Reader.readString("Enter course");
		estudyante.yearLevel = Reader.readInt("Enter year level");
		
		String gender = Reader.readString("Enter gender");
		estudyante.isMale = (gender.equalsIgnoreCase("male"))?true:false;

}

	public static void printDetails(Student estudyante) {

		System.out.println("\nPrinting Student Details");
		System.out.println("ID: " + estudyante.id);
		System.out.println("Name: " + estudyante.name);
		System.out.println("Course: " + estudyante.course);
		System.out.println("Year Level: " + estudyante.yearLevel);
		System.out.println("Gender: " + ((estudyante.isMale)?"Male\n":"Female\n"));

		estudyante.study();
		estudyante.shouldNotThinkAboutBreak();
		estudyante.mustLoveAllJavaSubjects();
		estudyante.mustBeOnTime();
}

}