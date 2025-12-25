/*
Set it an interface colletion data structure
it is not index based data structure
it allowed to store homogonius data except SortedSet,NavigableSet,TreeSet
we can store duplicate element in set
we can store max 1 null element in set
it does not follows the sorting order except SortedSet,NavigableSet,TreeSet
we can predicate the output,output is changable for this we can not say the index wise element
we can perform verous opertion on the set
*/
import java.util.*;
class SetExample
{
	public static void main(String args[])
	{
		//we can also store homo or hetrogenous data is HashSet
		//Set<Integer> s1 = new HashSet<>();
		Set s1 = new HashSet();
		s1.add(12);
		s1.add("g");
		System.out.println(s1);
		
	}
}