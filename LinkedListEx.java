import java.util.*;
class LinkedListEx
{
	public static void main(String args[])
	{
		LinkedList llst = new LinkedList();
		llst.add(20);
		System.out.println(llst);
		
		//add first
		llst.addFirst(10);
		
		//add last
		llst.addLast(30);
		llst.add("Vijaya");
		System.out.println("Get first "+llst.getFirst());
		System.out.println("Get last "+llst.getLast());
		
		System.out.println("All Elements");
		for(Object obj : llst)
		{
			System.out.print(obj+" ");
		}
		
		//llst.removeFirst();
		//llst.removeLast();
	}
}