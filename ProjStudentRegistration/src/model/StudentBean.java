package model;

public class StudentBean {
	
	private String studId;
	private String lastName;
	private String firstName;
	private String course;
	private int yearLevel;
	private int unitsEnrolled;

	//SETTER AND GETTER

	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public int getUnitsEnrolled() {
		return unitsEnrolled;
	}
	public void setUnitsEnrolled(int unitsEnrolled) {
		this.unitsEnrolled = unitsEnrolled;
	}


	//CONSTRUCTOR/S
	public StudentBean() {
		this.studId = "";
		this.lastName = "";
		this.firstName = "";
		this.course = "";
		this.yearLevel = 0;
		this.unitsEnrolled = 0;

	}
	

}