import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Employee e1= new Employee(101,"Shiv",10000);
		Employee e2= new Employee(102,"Ganesh",2000);
		Employee e3= new Employee(103,"jack",5000);
		Employee e4= new Employee(103,"jack",6000);
		TreeSet<Employee> t=new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t.add(e4));
		System.out.println("Default Sorting Order\n"+t);
		TreeSet<Employee> t1=new TreeSet<>(new CustomSort());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println("Custom Sorting Order\n"+t1);
		System.out.println(t1.add(e4));
	
		
	}
}
class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int sal;
	Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int compareTo(Employee e)
	{
		return this.id-e.id;
	}
	public String toString()
	{
		return "{ id "+id+", "+name+", sal "+sal+"}";
	}

}
class CustomSort implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		String s1=e1.name;
		String s2=e2.name;
		if(s1.length()>s2.length())
		{
			return +1;
		}
		return -1;
	}
}