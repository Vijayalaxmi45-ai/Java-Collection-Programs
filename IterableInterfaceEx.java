/*
Iterable Interface it is an cursor type
used to fetch the data
it is and universal interface works on all the collection object
It performs the reading and removing opetion also
It has the method
	public Iterable<> iterator();
*/
import java.util.*;
class IterableInterfaceEx
{
	public static void main(String args[])
	{
		Vector<Integer> v1 = new Vector<>();
		v1.add(1);
		v1.add(20);
		v1.add(30);

		Iterator<Integer> it = v1.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
