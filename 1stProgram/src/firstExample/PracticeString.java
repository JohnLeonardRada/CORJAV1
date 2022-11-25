package firstExample;

public class PracticeString {
	
	public static void main(String[] args) {
		// Using String With Concatenation
		String x = "Elyssa Mae";
		// Some Functions of String
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,7));
		System.out.println(x.charAt(3));
		System.out.println("------------");
		
		// Using Wrapper Classes
		String age = "19";
		String salary = "12345.67";

		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * 15;
		System.out.println(s);
	}

}
