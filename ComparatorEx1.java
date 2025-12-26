import java.util.*;

class Student
{
	int roll;
	String name;

	Student(int r, String n)
	{
		roll = r;
		name = n;
	}
}

class RollComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.roll - s2.roll;
	}
}

class ComparatorEx1
{
	public static void main(String args[])
	{
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(3,"Sneha"));
		al.add(new Student(1,"Priyanka"));
		al.add(new Student(2,"Vijaya"));

		Collections.sort(al, new RollComparator());

		for(Student s : al)
			System.out.println(s.roll + " " + s.name);
	}
}
