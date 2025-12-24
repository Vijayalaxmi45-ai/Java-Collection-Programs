import java.util.Collection.*;
import java.util.*;
class QueueExample
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		
		//list format
		System.out.println(queue);
		
		//lamda expression
		queue.forEach((Integer x) ->System.out.print(x+" "));
		
		System.out.println();
		//for each loop
		for(int x:queue)
		{
			System.out.print(x+" ");
		}
		
	}
}