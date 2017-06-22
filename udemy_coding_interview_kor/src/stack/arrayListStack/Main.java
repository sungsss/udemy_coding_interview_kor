package stack.arrayListStack;

import stack.arrayListStack.Practice_01;

public class Main {
	public static void main(String[] args) {
        Practice_01<Integer> stack1 = new Practice_01<Integer>();
        for(int i=1; i<=100; i++){
            stack1.push(i);
        }
        stack1.push(101);
        System.out.println(stack1.pop());
	}
}
