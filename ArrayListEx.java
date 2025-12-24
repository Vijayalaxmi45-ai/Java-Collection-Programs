/*
ArrayList
-it is an implemented class of List Interface
-We implement this class by the List interface
->it has the several methods including List Interface it's own methods also
->by default the arraylist size will be 10
->after adding all index upto 10 index then arraylist increase its capacity by following formulla
	(CurrentCapcity*3 /2 )+1
	ex: 10*3 / 2+1 = 15+1 = 16 
->it will distroy first arraylist created then it will created new arraylist with capacity 16
->List Interface Methods
	1)void add(int index,elemnt);
	2)boolean addAll(Collection c);
	3)void get(index);
	4)Object set(index,element);
	5)Object remove(index/element);
	6)Object indexOf(Object obj);
	7)Object lastIndexOf(Object obj);
ArrayList Properties
1)It maintains the insertion order 
2)It allows to store duplicate values
3)It allows to store null values
4)It does not like Sorting order
5)We will get elements as per added in list
6)we can add directly any index to any elements..we need to add index wise elements
7)It is an non-synchronized arraylist does not contain any synchronized data
8)allows to more than 1 thread at a time
9)It allows to parallel execution
10)It reduce the time to make application faster
11)ArrayList is not thread safe
12)arraylist does not gurantee for data inconsistancy

When to use ArrayList?
->When we use retrival operation mostly
->Fetching data is fast in arraylist because its implements RandomAccess interfaced

When we should not use ArrayList?
->When we have mostly insertion and deletion operation,then we should not use arraylist

RandomAccess interface?
->RandomAccess interface is marker interface that means it does not contains any methods or filds(variable)
->the use of RandomAccess is it allows us to retrive any elements of Collection object with same speed
->it inherite only 2 class
	1.ArrayList
	2.Vector

Clonable Interface
->it also a marker interface
->it introduced in JDK 1.2 Version
->used clone new object with using "new" Keyword 
*/

import java.util.*;
class ArrayListEx
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);	//0th index
		// al.add(5,50); 5th index we cannot add directly to any index we need to 
		//add elemnts sequenc wise otherwise it will throw exception arraylist out of bound
		al.add("Vijaya");	//1st index
		al.add(null);	//2nd index
		al.add(false);	//3rd index
		al.add(0);		//4rth index
		al.add(5,50);	//5th index
		System.out.println(al);
		
		System.out.println(al.get(0));	//getting 0th index
		al.set(0,5);					//setting 0th index value as 5
		System.out.println(al.get(0));	//getting 0th index
		
		al.remove(1); 	//remove 1st index element
		
		//Adding all elemnts of al ArrayList to another ArrayList al2
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
		//Adding all elemnts of al ArrayList to another ArrayList al2 at 2nd position
		al2.addAll(2,al);
		System.out.println(al2);
		
		System.out.println(al.add(10));	//it will return "TRUE" if it successfully added then
		
		System.out.println(al.contains(null));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		//Printing arraylist elements using iterable
		for(Object obj : al)
		{
			System.out.println(obj);
		}
		
	}
}