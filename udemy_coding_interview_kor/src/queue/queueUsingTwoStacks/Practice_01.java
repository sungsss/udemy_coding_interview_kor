package queue.queueUsingTwoStacks;

import java.util.Stack;

public class Practice_01<T> {
	Stack<T> s1;
	Stack<T> s2;
	
	public Practice_01(){
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public void offer(T element){
		s1.push(element);
	}
	
	public T poll(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}	
		}
		return s2.pop();
	} 
	
	public int size(){
		return s1.size() + s2.size();
	}
}
