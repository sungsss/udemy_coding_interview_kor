package queue.reverseQueue;

import java.util.Queue;
import java.util.Stack;

public class Practice_01<T> {
	public Queue<T> reverseQueue(Queue<T> q){
		Stack<T> stack = new Stack<T>();

		while(!q.isEmpty()){
			stack.push(q.poll());
		}
		
		while(!stack.isEmpty()){
			q.offer(stack.pop());
		}
		
		return q;
	}
}
