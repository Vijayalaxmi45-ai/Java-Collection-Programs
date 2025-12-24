import java.util.*;
class CollectionEx1
{
	public static void main(String args[])
	{
		ArrayList list = new ArrayList(10);
		//ArrayList<Integer> list = new ArrayList<>(10);
		list.add(100);
		list.add("Hello");
		list.add(2,300);
		list.add("World!!"); 
		list.add(true);
		list.add(false);
		list.add(null);
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}