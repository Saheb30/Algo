package array;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		quickSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]+"\t");
		}
	}
	static void quickSort(int[] arr, int lowIndex, int highIndex) {
		if(lowIndex<highIndex) {
			int partitionIndex = partition(arr, lowIndex, highIndex);
			quickSort(arr, lowIndex, partitionIndex-1);
			quickSort(arr, partitionIndex+1, highIndex);
		}
	}
	static int partition(int[] arr, int lowIndex, int highIndex) {
		//System.out.println(lowIndex+" "+highIndex);
		int pivot = arr[highIndex];
		int partitionIndex = lowIndex;
		for(int i = lowIndex; i<highIndex; i++) {
			//System.out.println(i);
			if(arr[i] <= pivot) {
				swap(arr, i, partitionIndex);
				partitionIndex++;
			}
		} 
		swap(arr,partitionIndex, highIndex);
		return partitionIndex;
	}
	private static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}

}
