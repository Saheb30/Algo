package array;

import java.util.Arrays;
import java.util.Objects;

//Largest Sum Contiguous Subarray
public class KadaneAlgo {

	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		//int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSumSubArray(arr));
	}
	static  int maxSumSubArray(int[] arr) {
		Objects.requireNonNull(arr);
		
		int maxSoFar = 0;
		int maxEndingHere = 0;
		for(int i=0;i<arr.length;i++) {
			maxEndingHere = maxEndingHere +arr[i];
			if(maxEndingHere<0) {
				maxEndingHere = 0;
			}
			if(maxSoFar<maxEndingHere) {
				maxSoFar  = maxEndingHere;
			}
		}
		return maxSoFar;
	}
	static  int maxSumSubArrayWithIndex(int[] arr) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		int startIndex = 0;
		int endIndex = 0;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 && !flag) {
				startIndex = i;
				flag = true;
			}
			maxEndingHere = maxEndingHere +arr[i];
			if(maxEndingHere<0) {
				maxEndingHere = 0;
				flag = false;
			}
			if(maxSoFar<maxEndingHere) {
				maxSoFar  = maxEndingHere;
				endIndex = i; //
			}
		}
		System.out.println("Start index-->"+startIndex);
		System.out.println("End index-->"+endIndex);
		return maxSoFar;
	}
	static  int maxSumSubArrayForAllNegative(int[] arr) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		int negativeMax = Arrays.stream(arr).max().getAsInt();
		if(negativeMax < 0) {
			return negativeMax;
		}
		for(int i=0;i<arr.length;i++) {
			maxEndingHere = maxEndingHere +arr[i];
			if(maxEndingHere<0) {
				maxEndingHere = 0;
			}
			if(maxSoFar<maxEndingHere) {
				maxSoFar  = maxEndingHere;
			}
		}
		return maxSoFar;
	}
	

}
