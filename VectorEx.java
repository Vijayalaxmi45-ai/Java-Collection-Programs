import java.util.*;
class VectorEx
{
	public static void main(String args[])
	{
		Vector v1 = new Vector();
		//capacity
		System.out.println("Current Capacity "+v1.capacity());
		
		//add elements
		v1.addElement(12);
		v1.addElement(14);
		
		for(int i=1; i<=10; i++)
		{
			v1.addElement(i);
		}
		
		System.out.println("New Capacity "+v1.capacity());
		//remove
		v1.removeElementAt(1);
		
		//get first
		System.out.println("Fist Element "+v1.firstElement());
		//get last
		System.out.println("Last Element "+v1.lastElement());
		System.out.println(v1);
	}
}