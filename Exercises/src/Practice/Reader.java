package Practice;
import java.io.*;

public class Reader {
	private static BufferedReader getReader() {

		BufferedReader reader = new BufferedReader(

		new InputStreamReader(System.in));

		return reader;

		}

		public static String readString(String message) {

		String input = null;

		try {

		System.out.print(message +": ");

		input = getReader().readLine();

		} catch (Exception e) {

		}

		return input;

		}

		public static int readInt(String message) {

		int input = 0;

		try {

		System.out.print(message +": ");

		
		/*The parseInt method converts a String value

		to an equivalent int value*/

		input = Integer.parseInt(getReader().readLine());

		} catch (Exception e) {

		}

		return input;

		}

		public static double readDouble(String message) {

		double input = 0;

		try {

		System.out.print(message +": ");

		/*The parseInt method converts a String value

		to an equivalent double value*/

		input = Double.parseDouble(getReader().readLine());

		} catch (Exception e) {

		}

		return input;

		}

		
}
