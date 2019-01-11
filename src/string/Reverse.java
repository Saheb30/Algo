package string;

public class Reverse {
	public static void main(String[] args) {
		//String str = new Reverse().inlineReverse("abcdefghijklmnop");
		String str = new Reverse().reverse("abcdefghijklmnop");
		System.out.println(str);
	}
	private String inlineReverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length()/2; i++) {
			
			char ch = sb.charAt(sb.length()-1-i);
			char ch2 = sb.charAt(i);
			
			sb.setCharAt(i, ch);
			sb.setCharAt(sb.length()-1-i, ch2);
			
			//System.out.println(i+"-->"+sb);
		}
		return sb.toString();
	}
	private String reverse(String str) {
		String temp = "";
		for(int i = str.length()-1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}
}
