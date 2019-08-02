package number;

public class Fibonacci {
	public static void main(String[] args) {
		fib(8);
	}

	private static void fib(int n){
		int a=0,b=1,c=0;
		if(n==1)
			System.out.print(0);
		if(n>1)
			System.out.println(0);
		
		for(int i=2; i<=n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println("....."+i);
			System.out.println("->"+c);
		}
		
	}
}
