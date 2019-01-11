package string;

public class Pangram {

	public static void main(String[] args) {
		System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
	}
	private static boolean isPangram(String str) {
		if(str == null) {
			return false;
		}
		boolean[] arr = new boolean[26];
		str = str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				int index = str.charAt(i)- 'A';
				if(!arr[index]) {
					arr[index] = true;
				}
			}
		}
		for(int i = 0; i<arr.length;i++) {
			if(!arr[i])
				return false;
		}
		return true;
	}
}
