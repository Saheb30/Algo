package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {3,2,7,6,5,1,8,4};
		new QuickSort().sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+"  ");
	}
	private void sort(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int partitionIndex = getPartitionIndex(arr, 0, end);
		sort(arr, start, partitionIndex-1);
		sort(arr, partitionIndex+1, end);
	}
	private int getPartitionIndex(int[] arr, int start, int end) {
		int pivotElement = arr[end];
		int partitionIndex= start;
		for(int i=0;i<=arr.length-2;i++) {
			if(arr[i]<pivotElement) {
				swap(arr, i, partitionIndex);
				partitionIndex++;
			}
		}
		swap(arr, partitionIndex, end);
		return partitionIndex;
	}
	private void swap(int[] arr, int first, int second){
		if(first==second) {
			return;
		}
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
		
}
