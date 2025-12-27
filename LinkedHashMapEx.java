import java.util.*;
class LinkedHashMapEx
{
	public static void main(String args[])
	{
		Map<Integer,String> mp = new LinkedHashMap<>();
		mp.put(1,"Vijaya");
		mp.put(2,"Sneha");
		mp.put(3,"Pallavi");
		mp.put(4,"Payal");
		System.out.println(mp);
		System.out.println(mp.get(2));
	}
}