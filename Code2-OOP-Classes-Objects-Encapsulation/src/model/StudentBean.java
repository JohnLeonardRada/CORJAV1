package model;

public class StudentBean {

	//Instance variable (unique per object) - outside any methods but inside a class
	private String id;
	private String name;
	private String course;
	private int yearLevel;
	private boolean isMale;
	
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
