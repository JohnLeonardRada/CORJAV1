package firstExample;

public class Practice2DArray {
	
	public static void main(String[] args) {
		// Using 2D Array
		int[][] TwoDim = new int[4][3];
		
		int temp = 10;
		// Nested For Loop
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				
				TwoDim[i][j] = temp;
				temp += 10;
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.println(TwoDim[i][j]);
				}
		}
	}

}