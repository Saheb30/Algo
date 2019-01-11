package string;

public class SwapString {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		swap(s1, s2);
	}
	private static void swap(String s1, String s2) {
		System.out.println("Before swap s1::"+s1+" s2::"+s2);
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length(),s1.length());
		System.out.println("After swap s1::"+s1+" s2::"+s2);
	}
}
