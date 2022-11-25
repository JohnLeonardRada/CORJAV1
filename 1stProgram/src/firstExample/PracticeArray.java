package firstExample;

public class PracticeArray {

	public static void main(String[] args) {
		//Using Arrays
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[2] + " " + a[4]);
		
		//Enhanced For Statement
		for(int temp: a) {
			System.out.println(temp);
		}
		System.out.println("--------");
		int[] x = new int[5];
		
		x[3]= 25;
		x[0]= 12;
		
		for(int temp2: x) {
			System.out.println(temp2);
		}
		//Using String in Arrays
		System.out.println("--------");
		String[] st = {"One", "Two", "Three"};
		
		for(String temp: st) {
			System.out.println(temp);
		}
		System.out.println("--------");
		String[] stx = new String[5];
		
		stx[3] = "25";
		stx[0] = "12";
		
		for(String temp2 : stx) {
			System.out.println(temp2);
		}
		
	}

}
