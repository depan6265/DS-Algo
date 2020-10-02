package recursion;

public class AdvanceQuestion {

	public static void main(String[] args) {
		
		int a[][] = {
				{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 0, 0},
				{1, 0, 0, 1, 1, 0, 1, 1},
				{1, 2, 2, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 2, 2, 0},
				{1, 1, 1, 1, 1, 2, 1, 1},
				{1, 1, 1, 1, 1, 2, 2, 1},
		};
		
		floodFill(a, 0, 0, 3, 1);
		printMatrix(a);

	}
	
	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
		int rows = a.length;
		int cols = a[0].length;
		
		if(r < 0 || r >= rows || c < 0 || c >= cols) {
			return;
		}
		if(a[r][c] != prevFill) {
			return;
		}
		a[r][c] = toFill;
		
		floodFill(a, r-1, c, toFill, prevFill);
		floodFill(a, r, c-1, toFill, prevFill);
		floodFill(a, r+1, c, toFill, prevFill);
		floodFill(a, r, c+1, toFill, prevFill);
	}
	
	static void printMatrix(int a[][]) {
		for(int r = 0; r<a.length;r++) {
			for(int c = 0; c < a[0].length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}

}
