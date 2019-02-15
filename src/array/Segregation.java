package array;

public class Segregation {
	public static void main(String[] args) {
		int arr[] = {1,0,2,1,0,2,1,0,2};
		//int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}; 
		zeroOnetwo(arr);
		printArray(arr);
	}

	static void zeroOnetwo(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				swap(arr,mid ,low );
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr, mid, high);
				high--;
				break;
			}
		}

	}

	private static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.println(i);
			
		}
	}

}
