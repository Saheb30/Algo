package sort;

public class BubbleSort implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr= {5,2,1,3,4};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		BubbleSort ob = new BubbleSort();
		BubbleSort ob2= (BubbleSort) ob.clone();
		
	}
	private static void bubbleSort(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
