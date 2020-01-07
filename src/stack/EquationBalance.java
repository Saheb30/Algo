package stack;

import java.util.Stack;

public class EquationBalance {
	public static void main(String[] args) {
		System.out.println(checkBalance("(())()"));
	}
	
	private static boolean checkBalance(String input) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch =='(' || ch =='{' || ch =='[') {
				stack.push(ch);
			}
			else if(ch ==')' && stack.peek()=='(') {
				stack.pop();
			}
			else if(ch =='}' && stack.peek()=='{') {
				stack.pop();
			}
			else if(ch ==']' && stack.peek()=='[') {
				stack.pop();
			}
			else {
				return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
