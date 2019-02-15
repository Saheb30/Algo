package array;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				   {1,  2,  3, 4},
				   {5,  6,  7, 8},
				   {9,  10, 11, 12},
				   {13, 14, 15, 16},
				   {17, 18, 19, 20}
				  };
		printSpiral(matrix, 5, 4);
	}

	private static void printSpiral(int[][] matrix, int maxRow, int maxColumn) {
		int i;
		int minRow = 0;
		int minColumn = 0;
		while(minRow < maxRow && minColumn < maxColumn) {
			
			//First Row
			//System.out.println("\n");
			for(i = minColumn;i < maxColumn;i++) {
				System.out.print(matrix[minRow][i]+"\t");
			}
			minRow++;
			
			
			//Last column
			//System.out.println("\n");
			for(i = minRow; i < maxRow; i++) {
				System.out.print(matrix[i][maxColumn-1]+"\t");
			}
			maxColumn--;
			
			
			//last row
			//System.out.println("\n");
			//if(j < row) {
				for(i = maxColumn-1;i>=minColumn;i--) {
					System.out.print(matrix[maxRow-1][i]+"\t");
				}
				maxRow--;
			//}
			
			
			//First column
			//System.out.println("\n");
			//if(k < column) {
				for(i = maxRow-1; i >= minRow; i--) {
					System.out.print(matrix[i][minColumn]+"\t");
				}
				minColumn++;
			//}
			
		}
		
		
	}
	

}
