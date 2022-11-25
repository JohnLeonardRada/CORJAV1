package firstExample;

public class PracticeAndOr {

	public static void main(String[] args) {
		// Using && and ||
		// && and
		// || or
		int x, y;
		x = 10;
		y = -10;
		//Using If-Else with && and ||
		if(x > 0 && y > 0) {
			System.out.println(" Both numbers are +ve");
		}else if (x > 0 || y > 0) {
			System.out.println(" at least one number is +ve");
		}else {
			System.out.println(" Both numbers are -ve");
		}
	}

}
