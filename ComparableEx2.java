import java.util.*;
class Student implements Comparable<Student>
{
	int rollno;
	String name;
	
	Student(int r,String n)
	{
		rollno = r;
		name = n;
	}
	public int compareTo(Student s)
	{
		return this.rollno - s.rollno;
	}
	
}
class ComparableEx2
{
	public static void main(String args[])
	{
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(5,"Vijaya"));
		al.add(new Student(3,"Sneha"));
		al.add(new Student(1,"Priyanka"));
		al.add(new Student(2,"Sanjana"));
		
		Collections.sort(al);
		for(Student s : al)
		{
			System.out.println(s.rollno + " " + s.name);
		}
	}
}