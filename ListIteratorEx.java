/*
ListIterator It is an cursor type used to fetching the data
ListIterator it an interface works only the List Inteface
It has its methods
	public ListIterator listIterator();
we can peroform verious opetion by using this like insertin elemnts,removing,replacing,and fetching
also we can fetch data forword and backword direaction
it is an bi-direaction
*/
import java.util.*;
class ListIteratorEx
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		ListIterator<Integer> li = al.listIterator();
		System.out.println("forword Direction");
		
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		System.out.println("Backword Direction");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
	}
}