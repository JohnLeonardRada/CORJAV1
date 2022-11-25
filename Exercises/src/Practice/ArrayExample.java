package Practice;

public class ArrayExample {

	public static void main(String[] args) {
		int number1[] = new int[10]; // 0 is the Default value for all indexes
		printArray(number1);

		double number2[] = new double[10]; // 0.0 is the Default value for all indexes
		printArray(number2);
		
		boolean data[] = new boolean[10]; // False is the Default value for all indexes
		printArray(data);
		
		String Days[] = new String[10];
		printArray(Days);
	}
	
	
	public static void printArray(int num[]) {
		System.out.println("Printing integer array content");
		System.out.println("------------------------------");
		// Array using While Loop
		int counter = 0;
		while (counter < 10) {
			System.out.println("Number[" +counter+ "]: " + num[counter]);
		counter++;
		}
	} 
	public static void printArray(double num[]) {
		System.out.println("Printing integer array content");
		System.out.println("------------------------------");
		// Array using Do-While Loop
		int counter = 0;
		do {
			System.out.println("Number[" +counter+ "]: " + num[counter]);
			counter++;
		}while(counter < 10);
	}
	public static void printArray(boolean data[]) {
		System.out.println("Printing integer array content");
		System.out.println("------------------------------");
		// Array using For Loop
		for(int counter = 0; counter <10; counter++) {
			System.out.println("Data[" +counter+ "]: " + data[counter]);
		}
	}
	public static void printArray(String days[]) {
		System.out.println("Printing integer array content");
		System.out.println("------------------------------");
		// Array using For Each
		// Without Using Counter	
		for(String Weekdays: days) {
			System.out.println("Days: " + Weekdays);
		}
	}	
	
}
	
