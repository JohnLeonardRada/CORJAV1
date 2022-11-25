package model;

public class Student {

//instance variable (unique per object) - outside any methods but inside a class
	public String id; //default null value
	public String name; //default null value
	public String course; //default null value
	public int yearLevel; //default to 0
	public boolean isMale; //default to false

//behavior or functionalities
	public void study() {
		System.out.println(name + " must study to prepare for the upcoming quizzes and exams.");
	}

	public void mustBeOnTime() {
		System.out.println(name + " must not be late in any of his/her classes.");
	}

	public void shouldNotThinkAboutBreak() {
		System.out.println(name + " must not be always hungry. Should eat breakfast coming to CORJAV1");
	}

	public void mustLoveAllJavaSubjects() {
		System.out.println(name + " must study Java. You do not have a choice.");
	}

}