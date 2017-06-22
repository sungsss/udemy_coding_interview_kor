package stack.getMinInO1;

public class Main {
	public static void main(String[] args) {
		Practice_01 minStack = new Practice_01();
		minStack.push(10);
		minStack.push(29);
		minStack.push(10);
		minStack.push(29);
		minStack.push(10);
		minStack.push(29);
		minStack.push(10);
		minStack.push(9);
		minStack.push(10);
		minStack.push(22);
		minStack.push(10);
		minStack.push(29);
		minStack.push(10);
		minStack.push(8);
		
		System.out.println(minStack.min());
		minStack.pop();
		System.out.println(minStack.min());
		
	}
}
