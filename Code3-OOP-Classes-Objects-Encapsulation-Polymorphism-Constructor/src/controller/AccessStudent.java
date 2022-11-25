package controller;

import model.StudentBean;

public class AccessStudent {

	public static void main(String[] args) {
		StudentBean studRada = new StudentBean();
		
		/*studRada.setId("201801141");
		studRada.setName("John Leonard Rada");	
		studRada.setCourse("BSCS-SE");
		studRada.setMale(true);
		studRada.setYearLevel(2);
		*/
		
//Executing Constructor 1	
printDetails(studRada);

//Executing Constructor 2
StudentBean studRada2 = new StudentBean("201801141", "John Leonard Rada", "BSCS-SE", 2, true);
printDetails(studRada2);

//Executing Constructor 3
studRada = null; 
studRada = new StudentBean("201801141", "John Leonard Rada", "BSCS-SE", true, 2);
printDetails(studRada);

//Executing Constructor 4
String myStudentDetails [] = {"201801141", "John Leonard Rada", "BSCS-SE"};
StudentBean studJohnCena = new StudentBean (myStudentDetails, true, 2);
printDetails(studJohnCena);

//Executing Constructor 5
StudentBean studJamesGosling = new StudentBean(true, 4, "201805671", 
		"James Gosling", "Java Creator", "Java for Life", 
		"Java for Eternity", "Java is Infinite", 
		"Hello World", "Hello Country", "Hello Universe"); 
printDetails(studJamesGosling);
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