package firstExample;

public class PracticeSwitchCase {
	
	public static void main(String[] args) {
		// Using Switch Case
		
		int j = 0;
		//Switch Case Using Simple Integer
		switch(j) {
			
			case 0:
				System.out.println("Value is 0");
				break;
			case 1:
				System.out.println("Value is 1");
				break;
			case 2:
				System.out.println("Value is 2");
				break;
			case 3:
				System.out.println("Value is 3");
				break;
			default:
				System.out.println("No Value");
		}
		
		// Switch Case Using String
		String k = "One";
		
		switch(k) {
		
		case "Zero":
			System.out.println("Value is 0");
			break;
		case "One":
			System.out.println("Value is 1");
			break;
		case "Two":
			System.out.println("Value is 2");
			break;
		case "Three":
			System.out.println("Value is 3");
			break;
		default:
			System.out.println("No Value");
		}
	}

}
