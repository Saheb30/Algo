package stack;

import java.util.Arrays;
import java.util.Stack;

public class GetMinAtConstantTime extends Stack<Integer> {
	private static final long serialVersionUID = 1L;
	private Stack<Integer> minStack = new Stack<>();
	private static final int DEFAULT_SIZE = 2;
	private Object[] elementData;
	private static int top = -1;

	public GetMinAtConstantTime() {
		elementData = new Object[DEFAULT_SIZE];
	}

	public int getSize() {
		return top + 1;
	}

	@Override
	public Integer push(Integer data) {
		if (getSize() == elementData.length) {
			this.increaseCapacity();
		}
		elementData[++top] = data;
		if (minStack.size() == 0) {
			minStack.push(data);
		} else {
			if (minStack.peek() > data) {
				minStack.push(data);
			}
		}
		return data;
	}

	@Override
	public Integer pop() {
		if (top == -1) {
			throw new ArrayIndexOutOfBoundsException("Stack is empty");
		}
		Integer data = (Integer) elementData[top];
		elementData[top--] = null;
		if(data <= minStack.peek()) {
			minStack.pop();
		}
		return data;
	}

	private void increaseCapacity() {
		elementData = Arrays.copyOf(elementData, elementData.length * 2);
	}

	public Integer getMin() {
		if (minStack.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Stack is empty");
		}
		return minStack.peek();
	}
	public static void main(String[] args) {
		GetMinAtConstantTime obj = new GetMinAtConstantTime();
		obj.push(6);
		obj.push(5);
		System.out.println(obj.getMin());
		obj.push(2);
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.getMin());
		obj.pop();
		obj.pop();
		
	}
}
