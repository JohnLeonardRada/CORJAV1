package model;

public class StudentBean {
	/*
	Three (3) Types of Variable Declarations
	  	1. local or automatic (owned by function)
	  	2. instance (owned by the object, promotes uniqueness of values)
	  	3. class or static (owned by the class. 
	  		value is shared to all objects - promote commonality)
	 
	Constructor/s
		  A constructor is a special function that is automatically executed upon 
		  object instantiation. The purpose of using a constructor is to perform
		  member data initialization.
		  
		  Naming constructor
		  1. Name of the constructor must the same name as the class name.
		  2. It does not return any data type.
		  
		  Two Types of Constructor
		  1. Default Constructor - does not accept any arguments or parameters.
		  2. Parameterized Constructor - accepts arguments (NOTE: be very careful
		     on implementing parameterized constructor because arguments matters - 
		     results to method overloading (same name and with different arguments -
		     number of arguments and data types of arguments)
		*/
		
	//Instance variable (unique per object) - outside any methods but inside a class
	private String id;
	private String name;
	private String course;
	private int yearLevel;
	private boolean isMale;
	
	//Constructor/s
	public StudentBean() {
		//Default Constructor
		System.out.println("\nExecuting Constructor 1");
		id = "";
		name = "";
		course = "";  
	}
	
	public StudentBean(String id, String name, String course, int yearLevel, boolean isMale) {
		System.out.println("\nExecuting Constructor 2");
		this.id = id;
		this.name = name;
		this.course = course;
		this.yearLevel = yearLevel;
		this.isMale = isMale;
	}
	
	public StudentBean(String id, String name, String course,boolean isMale, int yearLevel) {
		System.out.println("\nExecuting C onstructor 3");
		this.id = id;
		this.name = name;
		this.course = course;
		this.isMale = isMale;
		this.yearLevel = yearLevel;
		
		System.out.println("NAME: " + getName());
		
	}
	
	public StudentBean(String[] input, boolean isMale, int yearLevel) {
		System.out.println("\nExecuting Constructor 4");
		this.id = input[0];
		this.name = input[1] + " and John Cena";
		this.course = input[2];
		this.isMale = isMale;
		this.yearLevel = yearLevel;
	
	}
	
	public StudentBean(boolean isMale, int yearLevel, String ... input) {
		System.out.println("\nExecuting Constructor 5");
		this.id = input[0];
		this.name = input[1] + " and John Cena";
		this.course = input[2];
		this.isMale = isMale;
		this.yearLevel = yearLevel;
		
		System.out.println(input[3]);
		System.out.println(input[4]);
		System.out.println(input[5]);
		
		//Using For Each
		System.out.println("\n\nFor Each Example");
		for(String Rada: input)
			System.out.println(Rada);
	}
	
	
	//Setter and Getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	
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
