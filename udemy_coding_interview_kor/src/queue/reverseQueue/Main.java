package queue.reverseQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println(q.toString());
		
		Practice_01<Integer> rq = new Practice_01<Integer>();
		Queue<Integer> reverseQ = rq.reverseQueue(q);
		System.out.println(reverseQ.toString());
	}

}
