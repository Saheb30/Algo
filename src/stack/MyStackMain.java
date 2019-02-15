package stack;

public class MyStackMain {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(2);
		System.out.println("Size-->"+stack.getSize());
		stack.push(3);
		stack.push(4);
		System.out.println("Size-->"+stack.getSize());
		stack.push(5);
		stack.push(6);
		System.out.println("Size-->"+stack.getSize());
		System.out.println("Elements-->");
		for(int i = 0; i< stack.getSize();i++) {
			System.out.print(stack.get(i)+"\t");
		}
		int length = stack.getSize();
		for(int i = 0; i<=length;i++) {
			System.out.println("\nPopped-->"+stack.pop());
		}
	}

}
