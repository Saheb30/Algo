package stack;

import java.util.Arrays;

public class MyStack<E> {
	private static final int DEFAULT_SIZE = 2;
	private Object[] elementData;
	private static int top = -1;
	public MyStack(){
		elementData = new Object[DEFAULT_SIZE];
	}
	private boolean isEmpty() {
		return (top==-1)?true:false;
	}
	public int getSize() {
		return top+1;
	}
	public E push(E data) {
		if(this.getSize() == elementData.length) {
			this.increaseCapacity();
		}
		top++;
		elementData[top] = data;
		return data;
	}
	@SuppressWarnings("unchecked")
	public E pop() {
		if(this.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Stack is empty");
		}
		E data = (E) (elementData[top]);
		elementData[top] = null;
		top--;
		return data;
	}
	private void increaseCapacity() {
		elementData = Arrays.copyOf(elementData, elementData.length*2);
	}
	@SuppressWarnings("unchecked")
	public E get(int index) {
		if(index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return (E) this.elementData[index];
	}
	@SuppressWarnings("unchecked")
	public E peek() {
		 return (E) elementData[top];
	 }
	
}
