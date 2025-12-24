import java.util.*;
class EnumarationEx
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		list.add("X");
		list.add(100);
		list.add(false);
		list.add(null);
		list.add(true);
		for(Object o : list)
		{
			System.out.print(o+" ");
		}
	}
}