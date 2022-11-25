package Practice;
import Practice.Reader;

public class PassByValueAndReference {
	public static void main(String[] args)throws InterruptedException {
		int faveNumber = Reader.readInt("Enter your number");
		int number[] = {faveNumber};
			System.out.println("Your input number is " + faveNumber);
			System.out.println("I will add 10 to your input number " + faveNumber);
			System.out.println("\nPlease wait as I add 10");
			System.out.print("Still thinking");
		for (int counter = 1; counter <= 3; counter++) {
			Thread.sleep(1000);
			System.out.print(" yeet");
		}
		faveNumber = changeNumberPassedByValue(faveNumber);
		System.out.println("\nThe new value of adding 10 to " + faveNumber
				+ " using pass by value is " + faveNumber);
		changeNumberPassedByReference(number);

		System.out.println("\nThe new value of adding 10 to " + faveNumber
				+ " using pass by reference is " + number[0]);

		}

		public static int changeNumberPassedByValue(int faveNumber) {
		//faveNumber = faveNumber + 10;
		return faveNumber += 10;
		}

		public static void changeNumberPassedByReference(int faveNumber[]) {
		//faveNumber[0] = faveNumber[0] + 10;
		faveNumber[0]+=10;
		}
	
}


