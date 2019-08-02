package number;

public class Swap {
	public static void main(String[] args) {
		int a=5,b=7;
		swap(a,b);
		swapWithOutTemp(5,7);
	}
	private static void swap(int a, int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+"--"+b);
	}
	private static void swapWithOutTemp(int a, int b){
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"--"+b);
	}
}
