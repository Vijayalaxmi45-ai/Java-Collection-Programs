import java.util.*;
class QueueEx
{
	public static void main(String args[])
	{
		Queue<Integer> q = new PriorityQueue<>();
		q.add(10);
		q.add(20);
		q.add(2);
		System.out.println(q);
		q.offer(1);
		System.out.println(q.poll());
		System.out.println(q.peek());
		
	}
}