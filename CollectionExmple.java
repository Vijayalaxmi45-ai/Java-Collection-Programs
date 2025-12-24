class Employee
{
	private int id;
	private String name,dept;
	float salary;
	
	public Employee(int id,String name,String dept,float salary)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public void getId(int id )
	{
		this.id = id;
	}
	int setId()
	{
		return id;
	}
	public void getName(String name)
	{
		this.name = name;
	}
	String setName()
	{
		return name;
	}
	public void getDept(String dept)
	{
		this.dept = dept;
	}
	String setDept()
	{
		return dept;
	}
	public void getSalary(float salary)
	{
		this.salary = salary;
	}
	float setSalary()
	{
		return salary;
	}
}
class CollectionExmple
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		int n = scan.nextInt();
		for(int i=0;i<n ;i++)
		{
			String s = scan.next();
		
			String[] arr = s.split(",");
			
			int id = 1001+i;
			String name = arr[0];
			String dept = arr[1];
			String salary = Integer.parseInt(arr[2]);
			
			Employee e = new Employee(id,name,dept,salary);
			emplist.add(e);
		}
		for(Employee emp : emplist)
		{
			System.out.println(emp.getId()+", "+ emp.getName()+","+emp.getSalary()+","+emp.getSalary());
		}
	}
}