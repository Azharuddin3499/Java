package AssignmentOOPArray;

//add 2d array matrix array 2x3
public class Array2D {
	
	public static int[][] MartixArrayMultiplication(int[][] a1,int [][]a2) {
		int[][] result = {{0,0,0},
						  {0,0,0}};
		
		for (int i = 0; i < a1.length; i++) {//row number of times x2
			for (int j = 0; j < a1[i].length; j++) {//column number of time x3
				result[i][j] = a1[i][j]+a2[i][j]; 
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[][] mat1 = {{1,2,3},
						{4,5,6}};
		
		int[][] mat2 = {{7,8,9},
						{10,11,12}};
		
		int result[][] = 	MartixArrayMultiplication(mat1, mat2);
		
		for (int[] row : result) {
			for (int elem : row) {
				System.out.print(elem + " "); 
				} 
			System.out.println();
		}
	}
}
