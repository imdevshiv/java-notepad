class EqualsOveridding
{
	int a;
	public static void main(String[] args)
	{
		Emp e1=new Emp(10,"Shiv");
		Emp e2=new Emp(10,"Shiv");
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()+"\n"+e2.hashCode());

		
		EqualsOveridding eo =new EqualsOveridding();
		System.out.println(eo.m1(50));
		
		
		
	}
	public int m1(int x)
	{
		a=x;
		/*int a=a;*/ //local variabal
		int a=this.a; //So this is used ro remove confusion
		return a;
	}

}

class Emp 
{
	int empId;
	String empName;
	Emp(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public boolean equals(Object o)
	{
		
		Emp e=(Emp)o;
		System.out.println(this.empName.hashCode()+"\n"+e.empName.hashCode());
		return (this.empId == e.empId && this.empName==e.empName);
	}

}