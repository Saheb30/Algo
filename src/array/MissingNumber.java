package array;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		System.out.println(getMissingNumber(arr, 5));
	}
	static int getMissingNumber(int arr[], int length) {
		int sum = (length*(length+1))/2;
		int arrSum = 0;
		for(int i=0;i<arr.length;i++) {
			arrSum = arrSum +arr[i];
		}
		return (sum - arrSum); 
	}

}
