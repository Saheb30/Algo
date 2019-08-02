package string;

public class Anagram {
	public static void main(String[] args) {

		System.out.println(isAnagram("word", "wrdo"));
		System.out.println(isAnagram("word", "wrdot"));
	}

	public static boolean isAnagram(String first, String second) {
		char[] firstArr = first.toCharArray();
		StringBuilder sb = new StringBuilder(second);
		for (char c : firstArr) {
			int index = sb.indexOf("" + c);
			if (index != -1) {
				sb.deleteCharAt(index);
			}
		}
		return sb.length() == 0 ? true : false;
	}
}
