package string;

public class AllUniqueChar {
	public static void main(String[] args) {
		Character c = 'a';
		int i = c;
		System.out.println(i);
		System.out.println(isUniqueChars2("sahebe"));
	}

	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println("val-->" + val);
			if (char_set[val]) {
				System.out.println("If-->" + char_set[val]);
				return false;
			}

			char_set[val] = true;
		}
		return true;
	}
}
