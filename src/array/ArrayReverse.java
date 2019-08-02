package array;

import java.util.Objects;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	static void reverse(int[] arr) {
		Objects.requireNonNull(arr);
		int len = arr.length-1;
		for(int i=0, j = len;i<=len/2 && j>=len/2;i++,j--) {
			swap(arr, i, j);
		}
	}
	static void swap(int[] arr, int i, int j) {
		Objects.requireNonNull(arr);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
