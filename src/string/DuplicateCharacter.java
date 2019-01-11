package string;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String str = "abcd";
		//System.out.println(str.charAt(str.length()-1));
		if(new DuplicateCharacter().isDuplicatePresent(str)) {
			System.out.println("Duplicate presnt");
		}else {
			System.out.println("No duplicate");
		}
		new DuplicateCharacter().charToAscii('a');
	}
	private boolean isDuplicatePresent(String str) {
		boolean[] arr = new boolean[256];
		for(int i = 0; i<=str.length()-1; i++) {
			int index = str.charAt(i);
			if(arr[index]) {
				return true;
			}
			arr[index] = true;
		}
		return false;
	}
	private int charToAscii(char ch) {
		int asciiVal = ch;
		System.out.println("char to aschii --> "+asciiVal);
		return asciiVal;
	}
	private char asciiToChar(int value) {
		char ch = (char)value;
		System.out.println("ASCII to char --> "+ch);
		return ch;
	}
}
