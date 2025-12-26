import java.util.*;
class NavigableSetEx
{
	public static void main(String args[])
	{
		//Interface reference = ImplementingClass object
		NavigableSet<Integer> ng = new TreeSet<>();
		ng.add(34);
		ng.add(12);
		ng.add(20);
		System.out.println(ng);
		System.out.println("Lower :"+ng.lower(12));
		System.out.println("higher :"+ng.higher(34));
		System.out.println("First :"+ng.first());
		System.out.println("Last :"+ng.last());
		
	}
}