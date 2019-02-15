package array;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				   {1,  2,  3},
				   {5,  6,  7},
				   {9,  10, 11},
				   {13, 14, 15},
				   {17, 18, 19}
				  };
		printDiagonal(matrix, 5, 3);
	}
	private static void printDiagonal(int[][] arr,int row, int column) {
		
		for(int i = 0; i < row; i++) {
			int j = i;
			int k =0;
			while(j>=0 && k<column) {
				System.out.print(arr[j][k]+"\t");
				j--;
				k++;
			}
			System.out.println("\n");
		}
		for(int i = 1; i < column; i++) {
			int j = row-1;
			int k =i;
			while(j>=0 && k<column) {
				System.out.print(arr[j][k]+"\t");
				j--;
				k++;
			}
			System.out.println("\n");
		}
	}

}
