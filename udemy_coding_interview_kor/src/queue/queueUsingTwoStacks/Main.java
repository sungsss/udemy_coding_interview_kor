package queue.queueUsingTwoStacks;

public class Main {

	public static void main(String[] args) {
		Practice_01<Integer> sq = new Practice_01<Integer>();
		sq.offer(1);
		sq.offer(2);
		sq.offer(3);
		
		System.out.println(sq.poll());
		System.out.println(sq.poll());
		System.out.println(sq.poll());
		
		System.out.println(sq.size());
		
	}

}
