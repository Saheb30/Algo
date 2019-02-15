package array;

import java.util.Objects;

public class ArrayRotaion {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		for(int i=0;i<2;i++) {
			rotateRight(arr);
		}
		//rotateLeft(arr);
		//rotateRight(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
	}
	private static void rotateLeft(int[] arr) {
		Objects.requireNonNull(arr);
		if(arr.length == 0)
			return;
		int first = arr[0];
		int i;
		for( i = 0; i<arr.length-1;i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = first;
	}
	private static void rotateRight(int[] arr) {
		Objects.requireNonNull(arr);
		if(arr.length == 0)
			return;
		int last = arr[arr.length-1];
		int i;
		for( i = arr.length-1; i>0;i--) {
			arr[i] = arr[i - 1];
		}
		arr[i] = last;
	}

}
