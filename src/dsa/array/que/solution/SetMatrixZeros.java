package dsa.array.que.solution;

public class SetMatrixZeros {
	
	public static void setMatrixZeros(int [][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		//Brute force approach
//		for(int i=0; i<m ; i++) {
//			for(int j=0; j<n; j++) {
//				if(matrix[i][j] == 0) {
//					markRows(matrix, n, m, j);
//					markCols(matrix, n, m, i);
//				}
//			}
//		}
//		
//		for(int i=0; i<m ; i++) {
//			for(int j =0; j<n; j++) {
//				if(matrix[i][j] == -1) {
//					matrix[i][j] = 0;
//				}
//			}
//		}
		
		//Better approach
		int row [] = new int[n];
		int col [] = new int [m];
		// Traverse the matrix:
		for(int i=0; i<n ;i++) {
			for(int j=0; j<m ;j++) {
				if(matrix[i][j] == 0) {
					//mark row array to 1
					row[i] = 1;
					//mark col array to 1
					col[j] = 1;
				}
			}
		}
		
		// Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<m ; j++) {
				if(row[i] == 1 || col[j] == 1) {
					matrix[i][j] =0;
				}
			}
		}
 	}
	public static void markRows(int [][] matrix, int n, int m, int j) {
		for(int i=0; i<m; i++) {
			if(matrix[i][j] !=0) {
				matrix[i][j] = -1;
			}
		}
	}
	public static void markCols(int [][] matrix, int n, int m, int i) {
		for(int j=0; j<n; j++) {
			if(matrix[i][j] !=0) {
				matrix[i][j] = -1;
			}
		}
	}
}
