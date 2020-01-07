package array;

public class MissingNumberXOR {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		System.out.println(getMissingNumber(arr, 4));
	}

	private static int getMissingNumber(int[] arr, int size) {
		int x1 = arr[0];
		int x2 = 1;
		for(int i=1;i<arr.length;i++) {
			x1 = x1^arr[i];
		}
		for(int i=2;i<=size+1;i++) {
			x2 = x2^i;
		}
		return x1^x2;
	}
}
