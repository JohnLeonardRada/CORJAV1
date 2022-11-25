package controller;

import model.StudentBean;

public class AccessStudent {

	public static void main(String[] args) {
		StudentBean studRada = new StudentBean();
		
		studRada.setId("201801141");
		studRada.setName("John Leonard Rada");	
		studRada.setCourse("BSCS-SE");
		studRada.setMale(true);
		studRada.setYearLevel(2);
//call printDetails
printDetails(studRada);
}


	public static void printDetails(StudentBean estudyante) {

		System.out.println("\nPrinting Student Details");
		System.out.println("ID: " + estudyante.getId());
		System.out.println("Name: " + estudyante.getId());
		System.out.println("Course: " + estudyante.getCourse());
		System.out.println("Year Level: " + estudyante.getYearLevel());
		System.out.println("Gender: " + ((estudyante.isMale())?"Male\n":"Female\n"));

		estudyante.study();
		estudyante.shouldNotThinkAboutBreak();
		estudyante.mustLoveAllJavaSubjects();
		estudyante.mustBeOnTime();
}

}