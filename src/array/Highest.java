package array;

public class Highest {

	public static void main(String[] args) {
		int[] arr = {2,1,4,3,6,5};
		new Highest().secondHighest(arr);
	}
	private void secondHighest(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>highest) {
				secondHighest = highest;
				highest = arr[i];
			}else if(arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println("Second highest::"+secondHighest);
	}
}
