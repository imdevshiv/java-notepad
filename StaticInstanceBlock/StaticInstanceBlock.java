class StaticInstanceBlock
{

	public static void main(String[] args)
	{
		
		System.out.println("Lets create 2 object for class A and see how many time instances and static block get executed");
		A a1=new A();
		a1.m1();
		A a2=new A();
		a2.m1();
	}



}

class A
{
	
	public void m1()
	{
		System.out.println("Hello from class A m1 method");
	}
	
	{
	   
		System.out.println("Hey Instance block executed");
	}

	static
	{
	 	
		System.out.println("Hey Static block executed");
	}



}