package stack.getMinInO1;

import java.util.Stack;

public class Practice_01 {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;
	
	public Practice_01(){
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	
	public void push(int newVal){
		if(minStack.isEmpty() || newVal <= minStack.peek()){
			minStack.push(newVal);
		}
		stack.push(newVal);
	}
	
	public int pop(){
		int val = stack.pop();
		if(!minStack.isEmpty() && val == minStack.peek()){
			minStack.pop();
		}
		return val;
	}
	
	public int min(){
		if(minStack.isEmpty()) return Integer.MAX_VALUE;
		return minStack.peek();
	}
}
