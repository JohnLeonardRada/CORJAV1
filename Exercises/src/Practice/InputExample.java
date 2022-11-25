package Practice;
import Practice.Reader;

public class InputExample {

	public static void main(String[] args) {
		String name = Reader.readString("Enter your name");
		int yearLevel = Reader.readInt("Enter your school level");
		double targetGrade = Reader.readDouble("Enter your grade");
		
		System.out.println("Hi, Your name is " + name);
		if(yearLevel == 1) {
			System.out.println("Freshmen");
		}else if(yearLevel == 2) {
			System.out.println("Sophomore");
		}else if(yearLevel == 3) {
			System.out.println("Junior");
		}else if (yearLevel == 4) {
			System.out.println("Senior");
		}else {
			System.out.println("iAcademy is your second home");
		}
		System.out.println("Do your best in achieving the grade of " + targetGrade + " for CORJAVA1");
	}
}
